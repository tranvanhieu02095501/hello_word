package baitap_chuoi;

import java.util.Scanner;

public class bai7_nghichdaochuoi {
    public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
		 System.out.println("nhap chuoi: ");
		 String chuoi= sc.nextLine();
		
		 char Arr[]=chuoi.toCharArray();
		 System.out.println("chuoi nghich dao :");
		 daonguoc(Arr);
    }
    
    public static void daonguoc(char Arr[]) {
    	
    	int len=Arr.length;
		 for(int i=0;i<len/2;i++) {
			 char temp= Arr[i];
			      Arr[i]= Arr[len-i-1];
			      Arr[len-i-1]= temp;
		 }
		
	   System.out.println(Arr);
    }
}
