import javax.imageio.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;


// Демонстрация использования CropImageFilter.
public class TileImage extends Frame {
    Image img;
    Image[] cell = new Image[4 * 4];
    int iw, ih;
    int tw, th;
    public TileImage() {
        try {
            File imageFile = new File("mem.jpg");
            // Загрузить изображение.
            img = ImageIO.read(imageFile);
            iw = img.getWidth(null);
            ih = img.getHeight(null);
            tw = iw / 4;
            th = ih / 4;
            CropImageFilter f;
            FilteredImageSource fis;
            for (int y = 0; y < 4; y++) {
                for (int x = 0; x < 4; x++) {
                    f = new CropImageFilter(tw * x, th * y, tw, th);
                    fis = new FilteredImageSource(img.getSource(), f);
                    int i = y * 4 + x;
                    cell[i] = createImage(fis);
                }
            }
            for (int i = 0; i < 32; i++) {
                int si = (int) (Math.random() * 16);
                int di = (int) (Math.random() * 16);
                Image tmp = cell[si];
                cell[si] = cell[di];
                cell[di] = tmp;
            }
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
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 4; x++) {
                g.drawImage(cell[y * 4 + x], x * tw + getInsets().left,
                        y * th + getInsets().top, null);
            }
        }
    }
    public static void main(String[] args) {
        TileImage appwin = new TileImage();
        appwin.setSize(new Dimension(400, 380));
        appwin.setTitle("TileImage");
        appwin.setVisible(true);
    }
}
