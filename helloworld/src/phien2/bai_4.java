package phien2;

import java.util.Scanner;

public class bai_4 {
    public static void main(String[] args) {
		 Scanner  sc = new Scanner (System.in);
		 System.out.println(" nhap so thu 1 :");
		 int x1 = sc.nextInt();
		 System.out.println(" nhap so thu 2 :");
		 int   x2= sc.nextInt();
		 System.out.println(" nhap so thu 3 :");
		 int x3 = sc.nextInt();
		 System.out.println(" nhap so thu 4 :");
		 int x4 = sc.nextInt();
		 System.out.println(" nhap so thu 5 :");
		 int x5 = sc.nextInt();
		  float x = x1 +x2 +x3+x4+x5;
		  float y = x/5;
		  System.out.println(" sum :"+ x);
		  System.out.println(" everage :" + y);
	}
  
  
}
