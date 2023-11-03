package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		// rectangle 255 109 182 true 0.5 0.5 0.2 0.2 
		
	
		String shape = in.next();
		
		if (shape.equals("rectangle")) {
			int redComponent = in.nextInt();
			int greenComponent = in.nextInt();
			int blueComponent = in.nextInt();
			boolean isFilled = in.nextBoolean();
			double x = in.nextDouble();
			double y = in.nextDouble();
			double halfWidth = in.nextDouble();
			double halfHeight = in.nextDouble();
			
			StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
			if (isFilled) {
				StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
			}
			else {
				StdDraw.rectangle(x, y, halfWidth, halfHeight);
			}
		}
		
		if (shape.equals("triangle")) {
			double[] pointX = new double[3];
			double[] pointY = new double[3];
			int redComponent = in.nextInt();
			int greenComponent = in.nextInt();
			int blueComponent = in.nextInt();
			boolean isFilled = in.nextBoolean();
			
			pointX[0] = in.nextDouble();
			pointY[0] = in.nextDouble();
			pointX[1] = in.nextDouble();
			pointY[1] = in.nextDouble();
			pointX[2] = in.nextDouble();
			pointY[2] = in.nextDouble();
			StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
			
			if (isFilled) {
				StdDraw.filledPolygon(pointX, pointY);
			}
			
			else {
				StdDraw.polygon(pointX, pointY);
			}
		}
		
	}
}
