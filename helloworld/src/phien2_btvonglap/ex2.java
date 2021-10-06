package phien2_btvonglap;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
    	 Scanner sc = new Scanner (System.in);
		   System.out.println("enter :");
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
