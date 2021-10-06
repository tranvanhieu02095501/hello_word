package phien1_btvonglap;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
      
        int num1,num2, reversed = 0;
        System.out.println("\n\nNhập vào số: ");
        num1 = sc.nextInt();
       
        num2 = num1;
       
        while(num1 != 0) {
          int digit = num1 % 10;
          reversed = reversed * 10 + digit;
          num1 /= 10;
        }
        
        System.out.printf("Số  sau khi đảo ngược là:", num2, reversed);
     
	}
}
