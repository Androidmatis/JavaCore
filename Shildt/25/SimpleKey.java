// Демонстрация обработчиков событий клавиатуры.
import java.awt.*;
import java.awt.event.*;

public class SimpleKey extends Frame implements KeyListener {
    String msg = "";
    String keyState = "";
    public SimpleKey() {
        addKeyListener(this);
        addWindowListener(new MyWindowAdapter());
    }
    // Обработать нажатие клавиши
    public void keyPressed(KeyEvent keyEvent) {
        keyState = "Key Down";  // Клавиша нажата.
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
        appwin.setTitle("SimpleKey");
        appwin.setVisible(true);
    }

}
// При щелчке на кнопке закрытия закрыть окно и завершить программу.
class MyWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}