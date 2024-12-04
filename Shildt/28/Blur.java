import java.awt.image.ColorModel;

public class Blur extends Convolver {
    public void convolve() {
        for (int y = 1; y < height - 1; y++) {
            for (int x = 1; x < width - 1; x++) {
                int rs = 0;
                int gs = 0;
                int bs = 0;
                for (int k = -1; k <= 1; k++) {
                    for (int j = -1; j <= 1; j++) {
                        int rgb = imgpixels[(y + k) * width + x + j];
                        int r = (rgb >> 16) & 0xff;
                        int g = (rgb >> 8) & 0xff;
                        int b = (rgb) & 0xff;
                        rs += r;
                        gs += g;
                        bs += b;
                    }
                }
                rs /= 9;
                gs /= 9;
                bs /= 9;
                newimgpixels[y * width + x] = (0xff000000 | rs << 16 | gs << 8 | bs);
            }
        }
    }

    public void setPixels(int i, int i1, int i2, int i3, ColorModel colorModel, byte[] bytes, int i4, int i5) {

    }

    public void setPixels(int i, int i1, int i2, int i3, ColorModel colorModel, int[] ints, int i4, int i5) {

    }
}
