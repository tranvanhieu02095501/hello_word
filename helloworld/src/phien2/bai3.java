package phien2;

import java.util.Scanner;

public class bai3 {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
		 int year;
         System.out.println("Mời bạn nhập năm: ");
         year = sc.nextInt();
         if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
             System.out.println( " năm " + year + " is sleap year.");
         } else {
             System.out.println( " năm " + year + " is not sleap year.");
                  
         }
	}

}
