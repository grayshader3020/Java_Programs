import java.util.*;
import java.io.*;
import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
class PatternAll{
	public static void main(String[] args)
	{
		File file = new File("C:" + File.separator + "Users" + File.separator + "DELL" + File.separator + "Desktop" + File.separator + "Maharaj.jpg");
		try{
			BufferedImage image = ImageIO.read(file);
			for (int i=0;i<image.getHeight();i++) 
			{
				for (int j=0;j<image.getWidth();j++)
			    {
			    	Color cl = new Color(image.getRGB(j,i));
			    	if (cl.getRed()==0&&cl.getGreen()==0&&cl.getBlue()==0) 
			    		System.out.print("@ ");
			    	else
			    		System.out.print("  ");
					
				}
				System.out.println();
			}
		}catch(Exception e)
		{
			System.out.println("Something went wrong" + e.getMessage());
		}
	}

}