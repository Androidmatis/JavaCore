// Загрузка и отображение изображения.
import java.awt.*;
import java.awt.event.*;
import javax.imageio.*;
import java.io.*;

class SimpleImageLoad extends Frame {
    Image img;
    public SimpleImageLoad() {
        try {
            File imageFile = new File("mem.jpg");
            // Загрузить изображение.
            img = ImageIO.read(imageFile);
        } catch (IOException e) {
            System.out.println("Не удалось загрузить файл изображения.");
            System.exit(0);
        }
        addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent we) {
                System.exit(0);
            }
        });
    }
    public void paint(Graphics g) {
        g.drawImage(img, getInsets().left, getInsets().top, null);
    }
    public static void main(String[] args) {
        SimpleImageLoad appwin = new SimpleImageLoad();
        appwin.setSize(new Dimension(624, 350));
        appwin.setTitle("SimpleImageLoad");
        appwin.setVisible(true);
    }
}
