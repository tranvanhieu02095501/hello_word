package phien3;

import java.util.Scanner;

public class bai3 {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println(" nhap so nguyen (0->1000) :");
	int x = sc.nextInt();
	int sum = 0;
	int k;
	System.out.println("input : "+ x);
	while(x >0) {
		 k=x%10;
		sum=sum+k;
		x=x/10;
	}
	
	System.out.println("output : "+ sum);
}
}
