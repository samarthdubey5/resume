
import java.io.*;
import java.util.*;

/**
 @ samarth QA Infotech
Calculation of area of shapes 
 */
public class Area 
{
	public static void main(String args [])
	{
	Scanner initObject= new Scanner(System.in);
	String typeOfObject=null;
	typeOfObject= initObject.nextLine();
	double area =0.0 ;
	
	if(typeOfObject.equalsIgnoreCase("CIRCLE"))
	{
		System.out.println("Enter the Radius");
		double radius = initObject.nextDouble();
		System.out.println("the area of "+ typeOfObject + " "+ 3.14*radius*radius); //area of circle
	}
	
	else if(typeOfObject.equalsIgnoreCase("RECTANGLE"))
	{
		System.out.println("Enter the Lenght and Breadth");
		double length = initObject.nextDouble();
		double breadth = initObject.nextDouble();
		System.out.println("the area of "+ typeOfObject + " "+ length*breadth);	 //area of rectangle
	}
	else if(typeOfObject.equalsIgnoreCase("SQUARE"))
	
	{
		System.out.println("Enter the side");
		double side = initObject.nextDouble();
		System.out.println("the area of "+ typeOfObject +" "+ (side*side));	//area of square 
	}
	
	else if(typeOfObject.equalsIgnoreCase("TRIANGLE"))
	{
		System.out.println("Enter the base and altitude");
		double base = initObject.nextDouble();
		double altitude = initObject.nextDouble();
		System.out.println("the area of "+ typeOfObject +" "+ (0.5* base*altitude));	//area of triangle
	}
	else 
	{ System.out.println("Please determine a shape between Circle , Rectangle , square and triangle");
	}
	
	initObject.close();
}
}

