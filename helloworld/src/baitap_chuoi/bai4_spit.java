package baitap_chuoi;

import java.util.Scanner;

public class bai4_spit {
    public static void main(String[] args) {
		  Scanner sc=new Scanner (System.in);
		  System.out.println(" nhập chuỗi :");
		  String chuoi = sc.nextLine();
		  String word[]= chuoi.split(" ");
		  for(String w:word) {
		  System.out.println(w);
		  }
	}
}
