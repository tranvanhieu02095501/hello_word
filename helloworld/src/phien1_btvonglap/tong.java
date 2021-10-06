package phien1_btvonglap;

import java.util.Scanner;

public class tong {
   public static void main(String[] args) {
	   int s=0;
	   Scanner can = new Scanner(System.in);
	   int x = can.nextInt();
		
		for(int i=1; i<=x;i++)
		{
			s+=i;
			
		}
		System.out.println(s);
}
}
