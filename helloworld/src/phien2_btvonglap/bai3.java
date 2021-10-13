package phien2_btvonglap;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner (System.in);
    	System.out.println("enter : ");
    	int dem = sc.nextInt();
    	int num1 = 0, num2 = 1;
        System.out.print("Chuỗi Fibonacci với "+dem+" số là: ");
        for (int i = 1; i <= dem; ++i)
        {
            System.out.print(num1+" ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
	}
}
