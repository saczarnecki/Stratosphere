import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
import java.io.File;
import java.awt.Component;
import static java.lang.System.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import java.awt.*;
import java.io.*;
import java.awt.geom.*;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
public class compress extends JFrame
{
	public static void main(String args[]) throws IOException
	{
		File imagefile = new File("a.png");
		BufferedImage iag = ImageIO.read(imagefile);
		int w = iag.getWidth();
		int h = iag.getHeight();

		System.out.println(w);

		FastRGB a = new FastRGB(iag);
		//int test;
		//test=a.getRGB(3,9);
		//System.out.println(test);
		ArrayList<ArrayList<ArrayList>>close;
		close=a.noble(iag);
	
		System.out.println(close);
		
	}





}