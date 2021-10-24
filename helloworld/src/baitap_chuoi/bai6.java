package baitap_chuoi;

import java.util.Scanner;

public class bai6 {
  public static void main(String[] args) {
	  Scanner sc = new Scanner (System.in);
	  System.out.println(" Nhập chuỗi : ");
	  String chuoi = sc.nextLine();
	  System.out.println(" Nhập kí tự : ");
	  char c = sc.next().charAt(0);
	  int dem=0;
	  char charArray[]=chuoi.toCharArray();
	  for(int i=0;i<charArray.length;i++) {
		  
		 if( c == charArray[i]) {
			 dem++;
		 }
	  }
	  System.out.println(" Số lần xuất hiện của kí tự "+c+": "+dem);
}
}
