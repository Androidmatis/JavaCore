// Демонстрация использования внутренних классов.

import java.awt.*;
import java.awt.event.*;

public class InnerClassDemo extends Frame {
    String msg = "";
    public InnerClassDemo() {
        addMouseListener(new MyMouseAdapter());
        addWindowListener(new MyWindowAdapter());
    }
    // Внутренний класс для обработки событий нажатия кнопки мыши.
    class MyMouseAdapter extends MouseAdapter {
        public void mousePressed(MouseEvent me) {
            msg = "Mouse Pressed";
            repaint();
        }
    }
    // Внутренний класс для обработки событий закрытия окна.
    class MyWindowAdapter extends WindowAdapter {
        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }
    }
    // Отобразить информацию, связанную с мышью.
    public void paint(Graphics g) {
        g.drawString(msg, 20, 80);
    }
    public static void main(String[] args) {
        InnerClassDemo appwin = new InnerClassDemo();
        appwin.setSize(new Dimension(200, 150));
        appwin.setTitle("InnerClassDemo");
        appwin.setVisible(true);
    }
}