package org.jschool;

public abstract class Figure {
    private double size;
    private double[] location;
	private Point[] points;
    private Shape shape;


    public Figure(double size,double[] location,Shape shape) {
		this.size = size;
		this.location = location;
		this.shape = shape;
    }

    public void showIt() {
        shape.show();
    }
    public void display() {
        System.out.println("My size is "+size);
    }

    public void setShape(Shape s) {
        shape = s;
    }
	class Point {
		double x,y;
		Point(double x, double y) {
			this.x = x;
			this.y = y;
		}
	}
}
