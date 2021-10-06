package phien2_btvonglap;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
		  Scanner sc = new Scanner (System.in);
		  System.out.println("nhap x :");
		  int x=sc.nextInt();
		  for(int i=10;i<=200;i++) {
		     if((i%7==0)&&  (i%5!=0)){
			  System.out.println(i+" ");
		  }
		  }

	}
}
