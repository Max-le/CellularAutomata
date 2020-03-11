package be.max.graphics.Image;

import be.max.Plan;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageCreator {

    /**
     * Creates and write a BMP image representation of a 2-dimension array of booleans.
     * Output image is called "out.bmp".
     * @param plan The array containing boolean values.
     * @throws IOException
     */
    static void createImage(boolean[][] plan) throws IOException {
        int lengthRow = plan.length;
        int nbrRows = plan[0].length;
        BufferedImage image = new BufferedImage(lengthRow, nbrRows,BufferedImage.TYPE_INT_RGB);
        Color aliveCell = Color.BLACK;
        Color deadCELL = Color.WHITE;

        for (int i = 0; i < plan.length; i++) {
            for (int j = 0; j < plan[0].length; j++) {
                if (plan[i][j]){
                    image.setRGB(i, j,  aliveCell.getRGB());
                }
                else{
                    image.setRGB(i,j, deadCELL.getRGB());
                }
            }

        }

        File OutImage=new File("out.bmp");
        ImageIO.write(image, "BMP", OutImage);
    }
}
