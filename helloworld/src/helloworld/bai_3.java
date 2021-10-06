package helloworld;

import java.util.Scanner;

//3. Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
//Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less
//than 1, or "large" if it exceeds 1,000,000.
//Test Data
//Input a number: 25
//Expected Output :
//Input value: 25
//Positive number
public class bai_3 {
  public static void main(String[] args) {
	
			// TODO Auto-generated method stub
			 double a ;
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Input a number: ");
		        a = scanner.nextDouble();	
		        
		        if ( a == 0 )
		        {
		        	 System.out.println(" Zero  ");
		        	 }
		        if ( Math.abs(a) < 1) 
		        {
		        	System.out.println(" Small  ");
		        }
		        if ( a > 1000000) 
		        {
		        	System.out.println(" Large  ");
		        }
		        if (a > 0 ) {System.out.println(" positive  ");}
		        else {System.out.println(" negative  ");}
}   
}
