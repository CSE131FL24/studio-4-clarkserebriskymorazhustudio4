package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	StdDraw.setPenColor(StdDraw.RED);
	StdDraw.filledRectangle(.5, .5, .35, .20);
	
	StdDraw.setPenColor(StdDraw.RED);
	StdDraw.filledRectangle(.5, .5, .175, .20);
	
	StdDraw.setPenColor(StdDraw.WHITE);
	double[] x = {0.15, 0.85, 0.85};
	double[] y = {0.3, 0.3, 0.7};
	StdDraw.filledPolygon(x, y);
	
	StdDraw.setPenRadius(0.025);
	StdDraw.setPenColor(StdDraw.BLACK);
	StdDraw.line(.15, .3, .85, .7);

	
	StdDraw.setPenColor(StdDraw.WHITE);
	StdDraw.filledEllipse(.5, .5, .1, .10);
	
	
	StdDraw.setPenRadius(0.025);
	StdDraw.setPenColor(StdDraw.BLACK);
	StdDraw.ellipse(.5, .5, .1, .10);
	
	StdDraw.setPenRadius(0.005);
	StdDraw.setPenColor(StdDraw.BLACK);
	StdDraw.filledEllipse(.5, .5, .05, .05);
	
	StdDraw.setPenColor(StdDraw.WHITE);
	StdDraw.filledEllipse(.5, .5, .025, .025);
	
	
	
	StdDraw.setPenRadius(0.015);
	StdDraw.setPenColor(StdDraw.BLACK);
	StdDraw.rectangle(.5, .5, .35, .20);
	
	
	
	
	}
}