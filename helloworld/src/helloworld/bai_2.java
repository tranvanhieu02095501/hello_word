package helloworld;

import java.util.Scanner;

//2. Take three numbers from the user and print the greatest number
//Test Data
//Input the 1st number: 25
//Input the 2nd number: 78
//Input the 3rd number: 87
//Expected Output :
//The greatest: 87
public class bai_2 {
   public static void main(String[] args) {
	   Scanner sc = new Scanner (System.in);
	   int x,y,z;
	   System.out.println(" nhap x : ");
	   x=sc.nextInt();
	   System.out.println(" nhap y : ");
	   y=sc.nextInt();
	   System.out.println(" nhap z : ");
	   z=sc.nextInt();
			   
	   int max=0;
	   if(x > y) {
		   max=x;
		   
	   }else if(y>=x) {
		   max=y;
		   
	   }
	   
	    if(z>=max) {
		   max=z;
		   
	   }
	    System.out.println("The greatest : " + max);
		   
	   
}
}
