package co.cask.imgscalr;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
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
public class ScaleImage {
  public static void main(String[] args) throws Exception {
    BufferedImage image = ImageIO.read(new File("/tmp/five.png"));

    BufferedImage resize = Scalr.resize(image, 28, 28, Scalr.OP_ANTIALIAS, Scalr.OP_GRAYSCALE);
    ImageIO.write(resize, "png", new File("/tmp/resize.png"));
    BufferedImage i2 = new BufferedImage(resize.getWidth(), resize.getHeight(), BufferedImage.TYPE_INT_RGB);

    Graphics g = i2.getGraphics();
    g.drawImage(resize, 0, 0, null);
    g.dispose();

    int[] rgbArray = i2.getRGB(0, 0, 28, 28, null, 0, 28);

    System.out.println("Size of array = " + rgbArray.length);
    System.out.println(Arrays.toString(rgbArray));

    int[] convert = new int[rgbArray.length];
    int i = 0;
    for (int rgb : rgbArray) {
      Color color = new Color(rgb);
      System.out.println("R=" + color.getRed() + " G=" + color.getGreen() + " B=" + color.getBlue());
      convert[i++] = color.getRed();
    }
    System.out.println("Size of array = " + convert.length);
    System.out.println(Joiner.on(',').join(Ints.asList(convert)));
  }
}
