package studio4;

import java.awt.Color;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); //making Scanner with a File
		double x = 0.5;
		double y = 0.5;
		double radius = 0.5;
		
		StdDraw.circle(x, y, radius);
		
		{
		
		while (radius > 0.30)
		{
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.circle(x, y, radius);
		radius = radius - 0.001;
		}
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.circle(x, y, radius);
		
		double halfLength = 0.30;
		
		while (halfLength > 0.10)
		{
		StdDraw.setPenColor(0, 255, 0);
		StdDraw.square(x, y, halfLength);
		halfLength = halfLength - 0.001;
		}
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.square(x, y, halfLength);
		
		radius = halfLength;
		
		while (radius > 0)
		{
		StdDraw.setPenColor(0, 0, 255);
		StdDraw.circle(x, y, radius);
		radius = radius - 0.001;
		}
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.circle(x, y, radius);
		
		
		}
		
		// StdDraw.rectangle(x, y, halfWidth, halfHeight);
		// circle(double x, double y, double radius)
		// square(double x, double y, double halfLength)
		
		
	}
}