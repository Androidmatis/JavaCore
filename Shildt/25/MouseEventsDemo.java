// Демонстрация обработки событий мыши.
import java.awt.*;
import java.awt.event.*;

public class MouseEventsDemo extends Frame
        implements MouseListener, MouseMotionListener{
    String msg = "";
    int mouseX = 0, mouseY = 0; // координаты указателя мыши
    public MouseEventsDemo() {
        addMouseListener(this);
        addMouseMotionListener(this);
        addWindowListener(new MyWindowAdapter());
    }
    // Обработать щелчок кнопкой мыши.
    public void mouseClicked(MouseEvent mouseEvent) {
        msg = msg + " -- click received";
        repaint();  // -- получен щелчок
    }
    // Обработать наведение на окно указателя мыши.
    public void mouseEntered(MouseEvent mouseEvent) {
        mouseX = 100;
        mouseY = 100;
        msg = "Mouse entered";  // Указатель мыши наведен на окно.
        repaint();
    }
    // Обработать покидание окна указателем мыши.
    public void mouseExited(MouseEvent mouseEvent) {
        mouseX = 100;
        mouseY = 100;
        msg = "Mouse exited";  // Указатель мыши покинул окно.
        repaint();
    }
    // Обработать нажатие кнопки мыши.
    public void mousePressed(MouseEvent mouseEvent) {
        // Сохранить координаты.
        mouseX = mouseEvent.getX();
        mouseY = mouseEvent.getY();
        msg = "Button down";    // Кнопка нажата.
        repaint();
    }
    // Обработать отпускание кнопки мыши.
    public void mouseReleased(MouseEvent mouseEvent) {
        // Сохранить координаты.
        mouseX = mouseEvent.getX();
        mouseY = mouseEvent.getY();
        msg = "Button Released";    // Кнопка отпущена.
        repaint();
    }
    // Обработать перетаскивание указателя мыши.
    public void mouseDragged(MouseEvent mouseEvent) {
        // Сохранить координаты.
        mouseX = mouseEvent.getX();
        mouseY = mouseEvent.getY();
        msg = "*" + " mouse at " + mouseX + ", " + mouseY;  // * Курсор мыши находится в
        repaint();
    }
    // Обработать перемещение указателя мыши.
    public void mouseMoved(MouseEvent mouseEvent) {
        msg = "Moving mouse at " + mouseEvent.getX() +
                ", " + mouseEvent.getY();   // Перемещение курсора мыши в
        repaint();
    }
    // Отобразить сообщение в текущей позиции X, Y окна.
    public void paint(Graphics g) {
        g.drawString(msg, mouseX, mouseY);
    }
    public static void main(String[] args) {
        MouseEventsDemo appwin = new MouseEventsDemo();
        appwin.setSize(new Dimension(300, 300));
        appwin.setTitle("MouseEventDemo");
        appwin.setVisible(true);
    }
}
// При щелчке на кнопке закрытия закрыть окно и завершить программу.
class MyWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}