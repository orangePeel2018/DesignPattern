package com.principle.ocp;

public class Ocp {

	public static void main(String[] args) {
		GraphicEditor graphicEditor = new GraphicEditor();
		graphicEditor.drawShape(new Rectangle());
		graphicEditor.drawShape(new Circle());
		graphicEditor.drawShape(new Triangle());
	}
}

//这是一个用于绘图的类 [使用方]
class GraphicEditor {
	//接收Shape对象，然后根据type，来绘制不同的图形
	public void drawShape(Shape s) {
		s.draw();
	}
}

//Shape类，基类
abstract class Shape {
	int m_type;
	public abstract void draw();
}

class Rectangle extends Shape {
	Rectangle() {
		super.m_type = 1;
	}

	@Override
	public void draw() {
		System.out.println("画矩形");
	}
}

class Circle extends Shape {
	Circle() {
		super.m_type = 2;
	}

	@Override
	public void draw() {
		System.out.println("画圆形");
	}
}

//新增画三角形
class Triangle extends Shape {
	Triangle() {
		super.m_type = 3;
	}

	@Override
	public void draw() {
		System.out.println("画三角形");
	}
}
