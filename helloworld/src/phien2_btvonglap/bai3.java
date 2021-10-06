package phien2_btvonglap;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner (System.in);
    	System.out.println("enter : ");
    	int count = sc.nextInt();
    	int num1 = 0, num2 = 1;
        System.out.print("Chuỗi Fibonacci với "+count+" số là: ");
        for (int i = 1; i <= count; ++i)
        {
            System.out.print(num1+" ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
	}
}
