import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


// Add triangular poligon maker as class from two constructors

public class WriteImageType {
    static public void main(String args[]) throws Exception {
        try {
            int width = 200, height = 200;

            // TYPE_INT_ARGB specifies the image format: 8-bit RGBA packed
            // into integer pixels
            BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

            Graphics2D graphic = bi.createGraphics();
            graphic.drawImage(bi,0, 0, Color.WHITE, null);
            graphic.setColor(Color.BLACK);
            graphic.setStroke(new BasicStroke(3));


            /*Font font = new Font("TimesRoman", Font.BOLD, 20);
            graphic.setFont(font);
            String message = "www.java2s.com!";
            FontMetrics fontMetrics = graphic.getFontMetrics();

            int stringWidth = fontMetrics.stringWidth(message);
            int stringHeight = fontMetrics.getAscent();

            graphic.setPaint(Color.black);
            graphic.drawString(message, (width - stringWidth) / 2, height / 2 + stringHeight / 4);
*/

// draw GeneralPath (polygon)
            int x1Points[] = {0, 100, 0, 100};
            int y1Points[] = {0, 50, 50, 0};
            GeneralPath polygon =
                    new GeneralPath(GeneralPath.WIND_EVEN_ODD,
                            x1Points.length);
            polygon.moveTo(x1Points[0], y1Points[0]);

            for (int index = 1; index < x1Points.length; index++) {
                polygon.lineTo(x1Points[index], y1Points[index]);
            };

            polygon.closePath();
            graphic.draw(polygon);

            ImageIO.write(bi, "png", new File("yourImageName.png"));
            ImageIO.write(bi, "gif", new File("yourImageName.gif"));

        } catch (IOException ie) {
            ie.printStackTrace();
        }

    }
}