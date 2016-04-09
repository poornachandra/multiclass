package co.cask.imgscalr;

import com.google.common.base.Joiner;
import com.google.common.primitives.Ints;
import org.imgscalr.Scalr;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Arrays;
import javax.imageio.ImageIO;

/**
 *
 */
public class PrintImage {
  private static int[] imageArray = new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,16,16,16,16,16,16,16,16,16,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,36,182,191,190,190,190,190,190,191,179,21,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,45,233,248,234,234,234,234,234,234,215,25,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,45,234,216,74,64,65,65,65,65,61,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,45,234,206,22,4,4,4,4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,45,234,205,17,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,45,234,207,33,16,16,10,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,45,236,243,193,191,187,125,32,11,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,44,223,238,234,234,234,239,225,132,24,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,21,85,67,64,64,71,175,242,238,151,13,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,4,4,4,4,29,150,247,227,23,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,33,234,236,44,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,21,234,236,44,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,9,0,0,0,0,0,0,39,234,233,27,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,9,101,43,17,7,6,8,35,197,250,200,20,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,21,219,217,179,111,94,121,198,247,221,58,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,17,192,233,234,232,233,232,233,206,88,7,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,27,56,77,127,150,115,64,35,7,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,4,10,13,9,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

  public static void main(String[] args) throws Exception {
    BufferedImage i2 = new BufferedImage(28, 28, BufferedImage.TYPE_INT_RGB);

    int i = 0;
    for (int x = 0; x < 28; ++x) {
      for (int y = 0; y < 28; ++y) {
        int rgb = imageArray[i++];
        i2.setRGB(y, x, new Color(rgb, rgb, rgb).getRGB());
      }
    }

    ImageIO.write(i2, "png", new File("/tmp/out.png"));
  }
}
