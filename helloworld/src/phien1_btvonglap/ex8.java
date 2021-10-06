package phien1_btvonglap;

import java.util.Scanner;

public class ex8 {
     public static void main(String[] args) {
		   Scanner sc = new Scanner (System.in);
		   System.err.println("enter :");
		   int number = sc.nextInt();
	        long fact = 1;
	        int i = 1;
	        while(i<=number)
	        {
	            fact = fact * i;
	            i++;
	        }
	        System.out.println("Giai thừa của "+number+" là: "+fact);
	}
}
