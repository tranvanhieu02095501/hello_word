package helloworld;

import java.util.Scanner;

//1. Write a Java program to get a number from the user and print whether it is positive or negative
//Test Data
//Input number: 35
//Expected Output :
//Number is positive

public class bai_1 {
   public static void main(String[] args) {
	   Scanner sc = new  Scanner (System.in);
	   System.out.println(" nhap x : ");
	   int x = sc.nextInt();
	   if(x>=0) System.out.println("positive");
	   else System.out.println("negative");
			   
			   
}
}
