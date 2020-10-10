package org.jschool;

public class TestFigOne {
	public static void main(String[] args) {
		Figure figone = new FigOne(10.0,new double[]{5,10}, new Circle());
		figone.showIt();
		figone.setShape(new Rect());
		figone.showIt();
		figone.setShape(new Triangle());
		figone.showIt();
		figone.setShape(new Square());
		figone.showIt();
		figone.setShape(new Circle());
		figone.showIt();
	}
}

