package com.acad.assignments;

import java.util.Scanner;
import java.lang.Math;

public abstract class Figure {

	double dim1;
	
	abstract void findArea();
	abstract void findPerimeter();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("DETAILS OF CIRCLE");
		Circle circle = new Circle();
		circle.getRadius();
		circle.findArea();
		circle.findPerimeter();
		
		System.out.println("DETAILS OF RECTANGLE");
		Rectangle rectangle=new Rectangle();
		rectangle.getLength();
		rectangle.getBreadth();
		rectangle.findArea();
		rectangle.findPerimeter();
		
		System.out.println("DETAILS OF TRIANGLE");
		Triangle triangle= new Triangle();
		triangle.getSide1();
		triangle.getSide2();
		triangle.getSide3();
		triangle.findArea();
		triangle.findPerimeter();
	}

}
class Circle extends Figure{
	float getRadius(){
	System.out.println("Enter the radius:");
	Scanner reader = new Scanner(System.in);  // Reading from System.in
	float radius = reader.nextFloat();
	reader.close();
	return radius;
	}
	@Override
	void findArea() {
		// TODO Auto-generated method stub
		
		double area=0;
		float rad=getRadius();
		area = 3.14*rad*rad;
		System.out.println("Area of circle is:" + area);
		
	}

	@Override
	void findPerimeter() {
		// TODO Auto-generated method stub
		double perimeter=0;
		float rad=getRadius();
		perimeter = 2*3.14*rad;
		System.out.println("Perimeter of circle is:" + perimeter);
	}
	
}
class Rectangle extends Figure{
     float getLength(){
    	 System.out.println("Enter the length:");
    		Scanner reader = new Scanner(System.in);  // Reading from System.in
    		float length = reader.nextFloat();
    		reader.close(); 
    	 
		return length;
    	 
     }
     float getBreadth(){
    	 System.out.println("Enter the breadth:");
    		Scanner reader = new Scanner(System.in);  // Reading from System.in
    		float breadth = reader.nextFloat();
    		reader.close(); 
    	 
		return breadth;
    	 
     }
	@Override
	void findArea() {
		// TODO Auto-generated method stub
		float len=getLength();
		float brdth=getBreadth();
		float area= len*brdth;
		System.out.println("Area of the rectangle:" + area);
		
		
	}

	@Override
	void findPerimeter() {
		// TODO Auto-generated method stub
		float len=getLength();
		float brdth=getBreadth();
		float perimeter= 2*(len+brdth);
		System.out.println("Perimeter of the rectangle:" + perimeter);
	}
	
}
class Triangle extends Figure{
float getSide1(){
	System.out.println("Enter side1:");
	Scanner reader = new Scanner(System.in);  // Reading from System.in
	float side1 = reader.nextFloat();
	reader.close(); 
	return side1;
	
}
float getSide2(){
	System.out.println("Enter side1:");
	Scanner reader = new Scanner(System.in);  // Reading from System.in
	float side2 = reader.nextFloat();
	reader.close(); 
	return side2;
	
}
float getSide3(){
	System.out.println("Enter side1:");
	Scanner reader = new Scanner(System.in);  // Reading from System.in
	float side3 = reader.nextFloat();
	reader.close(); 
	return side3;
	
}
	@Override
	void findArea() {
		// TODO Auto-generated method stub
		float a= getSide1();
		float b = getSide2();
		float c= getSide3();
		float s = (a+b+c)/2;
		double area= Math.sqrt((s*(s-a)*(s-b)*(s-c)));
		
		System.out.println("Area of the triangle:" + area);
	}

	
	@Override
	void findPerimeter() {
		// TODO Auto-generated method stub
		float a= getSide1();
		float b = getSide2();
		float c= getSide3();
		
		float perimeter = a+b+c;
		System.out.println("Perimeter of the triangle:" + perimeter);
	}
}
