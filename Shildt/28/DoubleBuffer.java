// Демонстрация использования внеэкранного буфера.
import java.awt.*;
import java.awt.event.*;

class DoubleBuffer extends Frame {
    int gap = 3;
    int mx, my;
    boolean flicker = true;
    Image buffer = null;
    int w = 400, h = 400;
    public DoubleBuffer() {
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent me) {
                mx = me.getX();
                my = me.getY();
                flicker = false;
                repaint();
            }

            public void mouseMoved(MouseEvent we) {
                System.exit(0);
            }
        });
    }
    public void paint(Graphics g) {
        Graphics screengc = null;
        if (!flicker) {
            screengc = g;
            g = buffer.getGraphics();
        }
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, w, h);
        g.setColor(Color.RED);
        for (int i = 0; i < w; i += gap)
            g.drawLine(i, 0, w - i, h);
        for (int i = 0; i < h; i += gap)
            g.drawLine(i, 0, w, h - i);
        g.setColor(Color.BLACK);
        g.drawString("Press mouse button to double buffer", 10, h / 2);
        // Нажмите кнопку мыши, чтобы удвоить буфер.
        g.setColor(Color.YELLOW);
        g.fillOval(mx - gap, my - gap, gap * 2 + 1, gap * 2 + 1);
        if (!flicker) {
            screengc.drawImage(buffer, 0, 0, null);
        }
    }
    public void update(Graphics g) {
        paint(g);
    }
    public static void main(String[] args) {
        DoubleBuffer appwin = new DoubleBuffer();
        appwin.setSize(400, 400);
        appwin.setTitle("DoubleBuffer");
        appwin.setVisible(true);
        // Создать внеэкранный буфер.
        appwin.buffer = appwin.createImage(appwin.w, appwin.h);
    }
}
