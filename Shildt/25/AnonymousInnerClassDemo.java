// Демонстрация использования анонимных внутренних классов.

import java.awt.*;
import java.awt.event.*;

public class AnonymousInnerClassDemo extends Frame {
    String msg = "";
    public AnonymousInnerClassDemo() {
        // Анонимный внутренний класс для обработки событий нажатия кнопки мыши.
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent me) {
                msg = "Mouse Pressed";
                repaint();
            }
        });
        // Анонимный внутренний класс для обработки событий закрытия окна.
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
    // Отобразить информацию, связанную с мышью.
    public void paint(Graphics g) {
        g.drawString(msg, 20, 80);
    }
    public static void main(String[] args) {
        AnonymousInnerClassDemo appwin = new AnonymousInnerClassDemo();
        appwin.setSize(new Dimension(200, 150));
        appwin.setTitle("AnonymousInnerClassDemo");
        appwin.setVisible(true);
    }
}