package studio4;

import java.awt.Color;
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
		

		int numShapes = in.nextInt();
		in.nextLine();
		
		for(int i = 0; i<numShapes; i++) {
			
		String shape = in.next();	
		
		int redComp = in.nextInt();
		int greenComp = in.nextInt();
		int blueComp = in.nextInt();
		
		boolean isFilled = in.nextBoolean();

		double param1 = in.nextDouble();
		double param2 = in.nextDouble();
		double param3 = in.nextDouble();
		double param4 = in.nextDouble();
		
		StdDraw.setPenColor(redComp, greenComp, blueComp);
		
		
		if(isFilled)
		StdDraw.filledRectangle(param1, param2, param3, param4);
		else
		StdDraw.rectangle(param1, param2, param3, param4);
	
		
		in.nextLine();
		StdDraw.show();
		
		}
		
		int numCircles = in.nextInt();
		in.nextLine();
		
		for(int i=0; i<numCircles; i++) {
			String shape = in.next();
			
			int redComp = in.nextInt();
			int greenComp = in.nextInt();
			int blueComp = in.nextInt();
			
			boolean isFilled = in.nextBoolean();

			double param1 = in.nextDouble();
			double param2 = in.nextDouble();
			double param3 = in.nextDouble();
			
			StdDraw.setPenColor(redComp, greenComp, blueComp);
			
			
			if(isFilled)
			StdDraw.filledCircle(param1, param2, param3);
			else
			StdDraw.circle(param1, param2, param3);
			
			in.nextLine();
			StdDraw.show();
		}
		
		
		
	}
}
