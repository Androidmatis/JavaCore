// Демонстрация использования фильтров изображения.
import javax.imageio.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.lang.reflect.*;

public class ImageFilterDemo extends Frame implements ActionListener {
    Image img;
    PlugInFilter pif;
    Image fimg;
    Image curImg;
    LoadedImage lim;
    Label lab;
    Button reset;
    // Имена фильтров.
    String[] filters = {"Grayscale", "Invert", "Contrast", "Blur", "Sharpen"};
    public ImageFilterDemo() {
        Panel p = new Panel();
        add(p, BorderLayout.SOUTH);
        // Создать кнопку Reset(Сброс).
        reset = new Button("Reset");
        reset.addActionListener(this);
        p.add(reset);
        // Добавить кнопки фильтров.
        for(String fstr : filters) {
            Button b = new Button(fstr);
            b.addActionListener(this);
            p.add(b);
        }
        // Создать верхнюю кнопку.
        lab = new Label("");
        add(lab, BorderLayout.NORTH);
        // Загрузить изображение.
        try {
            File imageFile = new File("mem.jpg");
            img = ImageIO.read(imageFile);
        } catch (IOException e) {
            System.out.println("Не удалось загрузить файл изображения.");
            System.exit(0);
        }
        // Получить объект LoadedImage и расположить его по центру.
        lim = new LoadedImage(img);
        add(lim, BorderLayout.CENTER);
        addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent we) {
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent ae) {
        String a = "";
        try {
            a = ae.getActionCommand();
            if (a.equals("Reset")) {
                lim.set(img);
                lab.setText("Normal");  // Нормальное
            }
            else {
                // Получить выбранный фильтр.
                pif = (PlugInFilter)
                        (Class.forName(a)).getConstructor().newInstance();
                fimg = pif.filter(this, img);
                lim.set(fimg);
                lab.setText("Filtered: " + a);  // Отфильтрованное
            }
            repaint();
        } catch (ClassNotFoundException e) {
            lab.setText(a + " not found");  // не найдено
            lim.set(img);
            repaint();
        } catch (InstantiationException e) {
            lab.setText("couldn't new " + a);   // не удается создать
        } catch (IllegalAccessException e) {
            lab.setText("no access: " + a);     // нет доступа
        } catch (NoSuchMethodException | InvocationTargetException e) {
            lab.setText("Filter creation error: " + e); // Ошибка создания фильтра
        }
    }
    public static void main(String[] args) {
        ImageFilterDemo appwin = new ImageFilterDemo();
        appwin.setSize(new Dimension(420, 420));
        appwin.setTitle("ImageFilterDemo");
        appwin.setVisible(true);
    }
}
