package com.bridgelabz.linecomparison;

public class LineComparisionProblem {

	public static void main(String[] args) {
		System.out.println("welcome to line Comparison Computation Program");
		
		int x1 = 3;
		int y1 = 4;
		int x2 = 8;
		int y2 = 2;
		System.out.println("line 1 co-ordinates= " + x1+","+ y1);
		System.out.println("line 2 co-ordinates= " + x2+","+ y2);
		double length_of_line = Math.sqrt((x2-x1)^2+(y2-y1)^2);
		System.out.println("Length_of_line = "+length_of_line);

	}

}
