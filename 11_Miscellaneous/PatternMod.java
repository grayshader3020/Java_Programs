import java.util.*;
import java.io.*;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

class PatternMod {
    public static void main(String[] args) {
        File file = new File("C:" + File.separator + "Users" + File.separator + "DELL" + File.separator + "Desktop" + File.separator + "Maharaj.jpg");
        //File file = new File("E:"+ File.separator +"my.jpeg");
        try {
            BufferedImage originalImage = ImageIO.read(file);
            if (originalImage == null) {
                System.out.println("Image could not be loaded. Check file path or format.");
                return;
            }

            // ✅ Resize image for console display (Width: 100px, Height adjusted)
            int newWidth = 100;
            int newHeight = (originalImage.getHeight() * newWidth) / originalImage.getWidth() / 2;  // /2 for console aspect ratio
            Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

            BufferedImage image = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_RGB);
            image.getGraphics().drawImage(scaledImage, 0, 0, null);

            // ✅ Display pattern
            for (int i = 0; i < image.getHeight(); i++) {
                for (int j = 0; j < image.getWidth(); j++) {
                    Color cl = new Color(image.getRGB(j, i));
                    int brightness = (cl.getRed() + cl.getGreen() + cl.getBlue()) / 3;

                    // ⚡ Adjust the character based on brightness for clearer output
                    if (brightness < 100)
                        System.out.print("@ ");  // Dark areas
                    else if (brightness < 180)
                        System.out.print("* ");  // Mid-tone areas
                    else
                        System.out.print("  ");  // Light areas
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
