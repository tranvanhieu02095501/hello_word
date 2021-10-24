package baitap_chuoi;

import java.util.Scanner;

public class bai1_xoakitukhoangtrang {
       public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Nhập chuỗi :");
		  String chuoi=sc.nextLine();
		  System.out.println("Chuỗi bạn nhập là :"+chuoi);
		  chuoi=chuoi.replaceAll(" ", "");
		  System.out.println("Chuỗi đã xóa kí tự khoảng trắng :"+chuoi);
	}
}
