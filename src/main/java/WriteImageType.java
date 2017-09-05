import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.imageio.ImageIO;


// Add triangular poligon maker as class from two constructors

public class WriteImageType {
    static public void main(String args[]) throws Exception {
        try {
            int width = 360, height = 360;
            BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

            Graphics2D graphic = bi.createGraphics();
            graphic.drawImage(bi,0, 0, Color.WHITE, null);

            TriangularDrawer triangularDrawer = new TriangularDrawer(graphic);

//            triangularDrawer.createOnCathetus(3, 4, 360);
//            triangularDrawer.createOnCathetAndHypotenuse(5, 7, 360);
            triangularDrawer.createOnAngles(Arrays.asList(120, 50, 10), 360);

            ImageIO.write(bi, "png", new File("yourImageName.png"));
            ImageIO.write(bi, "gif", new File("yourImageName.gif"));

        } catch (IOException ie) {
            ie.printStackTrace();
        }

    }
}