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
	 Scanner sc = new Scanner(System.in);
	 int x=sc.nextInt();
	  if(x>0 && x<=1)
		  System.out.println("positive small number");
	  else if(x>0 && x>1 && x<=1000)
		  System.out.println("positive  number");
	  else if(x>0 && x>1000)
		  System.out.println("positive large number");
	  else if(x==0)
		  System.out.println("zero");
	  else if(x<0 && x>=-1)
		  System.out.println("negastive small number");
	  else if(x<0 && x<-1 && x>=-1000)
		  System.out.println("negative number");
	  else if(x<0 && x<-1000)
		  System.out.println("negative small number");
}   
}
