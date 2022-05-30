package cafeInterface;

import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.*;

public class DrawImage {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Soohyun\\Desktop\\Newman Paul\\JavaUnterricht\\src\\images\\sff.png");
        BufferedImage img = ImageIO.read(file);
        JLabel lb = new JLabel(new ImageIcon(img));
        JFrame f = new JFrame("draw Image");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(lb);
        f.pack();
        f.setLocation(200,200);
        f.setVisible(true);
    }
}