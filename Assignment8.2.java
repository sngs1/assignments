package com.acad.assignments;

import java.util.Scanner;

class NegativeAgeException extends Exception
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String errorMessage;
 
    public NegativeAgeException(String errorMessage)
    {
        this.errorMessage = errorMessage;
    }
 
    //Modifying toString() method to display customized error message
 
    @Override
    public String toString()
    {
        return errorMessage;
    }
}

 class ExceptionHandling
{
    public static void main(String[] args)
    {
          Scanner sc = new Scanner(System.in);  //Declaring Scanner variable to take input from user
 
          System.out.println("Enter Your Age:");
 
          int age = sc.nextInt();         //Taking input from user
 
          try
          {
              if(age < 0)
              {
                  throw new NegativeAgeException("NegativeAgeException!!!!! Age can not be negative");    //throws AgeIsNegativeException if age is negative
              }
              else{
            	  System.out.println("Age you have entered is : "+age);
              }
          }
          catch(NegativeAgeException ex)
          {
              System.out.println(ex);    //Output : Age can not be negative
          }
          
          sc.close();
    }
}