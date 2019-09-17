package Pieces;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class LoadImage {
    public BufferedImage loadImage (String filename){
        filename = "C:\\Users\\Mehdi M~\\IdeaProjects\\AutoChez\\Chess Pieces\\" + filename;
        File file =  new File(filename);
        BufferedImage img = null;
        try {
            img = ImageIO.read(file);
        } catch (IOException e) {
        }

        return img;
    }
}
