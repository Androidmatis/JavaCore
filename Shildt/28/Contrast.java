// Фильтр контрастности.

import java.awt.*;
import java.awt.image.*;

public class Contrast extends RGBImageFilter implements  PlugInFilter {
    public Contrast() {}
    public Image filter(Frame f, Image in) {
        return f.createImage(new FilteredImageSource(in.getSource(), this));
    }
    private int multclamp(int in, double factor) {
        in = (int) (in * factor);
        return in > 255 ? 255 : in;
    }
    double gain = 1.2;
    private int count(int in) {
        return (in < 128) ? (int) (in / gain) : multclamp(in, gain);
    }
    public int filterRGB(int x, int y, int rgb) {
        int r = count((rgb >> 16) & 0xff);
        int g = count((rgb >> 8) & 0xff);
        int b = count((rgb) & 0xff);
        return (0xff000000 | r << 16 | g << 8 | b);
    }
}
