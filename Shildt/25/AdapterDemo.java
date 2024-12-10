// Демонстрация нескольких кодов виртуальных клавиш.

import java.awt.*;
import java.awt.event.*;

public class AdapterDemo extends Frame {
    String msg = "";
    public AdapterDemo() {
        addMouseListener(new MyMouseAdapter(this));
        addMouseMotionListener(new MyMouseAdapter(this));
        addWindowListener(new MyWindowAdapter());
    }
    // Отобразить информацию, связанную с мышью.
    public void paint(Graphics g) {
        g.drawString(msg, 20, 80);
    }
    public static void main(String[] args) {
        AdapterDemo appwin = new AdapterDemo();
        appwin.setSize(new Dimension(200, 150));
        appwin.setTitle("AdapterDemo");
        appwin.setVisible(true);
    }
}
// Обработать только события щелчка и перетаскивания.
class MyMouseAdapter extends MouseAdapter {
    AdapterDemo adapterDemo;
    public MyMouseAdapter(AdapterDemo adapterDemo) {
        this.adapterDemo = adapterDemo;
    }
    // Обработать щелчок кнопкой мыши.
    public void mouseClicked(MouseEvent me) {
        adapterDemo.msg = "Mouse clicked";
        adapterDemo.repaint();
    }
    // Обработать перетаскивание указателя мыши.
    public void mouseDragged(MouseEvent me) {
        adapterDemo.msg = "Mouse dragged";
        adapterDemo.repaint();
    }
}
// При щелчке на кнопке закрытия закрыть окно и завершить программу.
class MyWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}
