package baitap_chuoi;

import java.util.Scanner;

public class bai2_UpperCase {
     public static void main(String[] args) {
		  Scanner sc= new Scanner (System.in);
		  System.out.println("Nhập chuỗi :");
		  String chuoi=sc.nextLine();
		  System.out.println("Chuỗi ban đầu :"+chuoi);
		  // chuyển đổi chuỗi thành mảng kí tự
		  char []CharArray=chuoi.toCharArray();
		  boolean foundspace =true;
		  for (int i=0; i<CharArray.length;i++)
		  {
			  if(Character.isLetter(CharArray[i])){
				  if(foundspace) {
					  CharArray[i]=Character.toUpperCase(CharArray[i]);
					  foundspace=false;
				  }
			  }else {
				  foundspace=true;
			  }
		  }
		  chuoi=String.valueOf(CharArray);
		  System.out.println("Kết quả chuẩn hóa chuỗi :"+chuoi);
	}
}
