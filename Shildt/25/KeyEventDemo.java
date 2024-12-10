// Демонстрация нескольких кодов виртуальных клавиш.

import java.awt.*;
import java.awt.event.*;

public class KeyEventDemo extends Frame implements KeyListener {
    String msg = "";
    String keyState = "";
    public KeyEventDemo() {
        addKeyListener(this);
        addWindowListener(new MyWindowAdapter());
    }
    // Обработать нажатие клавиши
    public void keyPressed(KeyEvent keyEvent) {
        keyState = "Key Down";  // Клавиша нажата.
        int key = keyEvent.getKeyCode();
        switch (key) {
            case KeyEvent.VK_F1:
                msg += "<F1>";
                break;
            case KeyEvent.VK_F2:
                msg += "<F2>";
                break;
            case KeyEvent.VK_F3:
                msg += "<F3>";
                break;
            case KeyEvent.VK_PAGE_DOWN:
                msg += "<PgDn>";
                break;
            case KeyEvent.VK_PAGE_UP:
                msg += "<PgUp>";
                break;
            case KeyEvent.VK_LEFT:
                msg += "<Left Arrow>";
                break;
            case KeyEvent.VK_RIGHT:
                msg += "<Right Arrow>";
                break;
        }
        repaint();
    }
    // Обработать отпускание клавиши
    public void keyReleased(KeyEvent keyEvent) {
        keyState = "Key Up";  // Клавиша отпущена.
        repaint();
    }
    // Обработать ввод символа.
    public void keyTyped(KeyEvent keyEvent) {
        msg += keyEvent.getKeyChar();
        repaint();
    }
    // Отобразить результаты нажатых клавиш.
    public void paint(Graphics g) {
        g.drawString(msg, 20, 100);
        g.drawString(keyState, 20, 50);
    }
    public static void main(String[] args) {
        SimpleKey appwin = new SimpleKey();
        appwin.setSize(new Dimension(200, 150));
        appwin.setTitle("KeyEventDemo");
        appwin.setVisible(true);
    }
}
// При щелчке на кнопке закрытия закрыть окно и завершить программу.
class MyWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}