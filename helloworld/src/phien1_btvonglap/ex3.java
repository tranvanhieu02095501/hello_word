package phien1_btvonglap;

import java.util.Scanner;

public class ex3 {
     public static void main(String[] args) {
    	 int s=0;
		Scanner sc = new Scanner (System.in);
		System.out.println(" enter n : ");
		int x = sc.nextInt();
		
		for(int i=1; i<=x;i++)
		{
			s+=i;
			
		}
		System.out.println(s);
		
	}
}
