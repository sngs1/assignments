package com.acad.assignments;



public class ConstructorChaining

{

	ConstructorChaining()  //default constructor

  {

    this(10);
    System.out.println("default constructor");

  }

	ConstructorChaining(int x)  //one parameter constructor

  {

    this(10,20);
    System.out.println("value of x is" +x);

  }

	ConstructorChaining(int x,int y)  //two parameter constructor

  {

    System.out.println("Add result is" +(x+y));

  }

  public static void main(String[] args)

  {

    new ConstructorChaining();

  }

}