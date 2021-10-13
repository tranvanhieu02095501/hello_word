package baitap_ham;

import java.util.Scanner;

//Bài 3: Hãy viết chương trình thực hiện các yêu cầu sau:
//- Nhập một số nguyên dương n từ bàn phím (kiểm tra nếu không đạt yêu cầu thì bắt nhập
//lại)
//- Nhập một thông điệp từ bàn phím
//- Gọi thực hiện hàm ở Bài 2 n lần với thông điệp được truyền làm tham số đầu vào của hàm.
public class bai3 {
            public static void main(String[] args) {
            	Scanner sc =new Scanner (System.in);
        		
        		System.out.println("xuat chuoi : ");
        		String x = sc.nextLine();
        		System.out.println("so luong : ");
        		int n = sc.nextInt();
        		for (int i =0;i<n;i++)
        		xuatchuoi(x);
        		
        	}
             public static void xuatchuoi(String n ) {
         		System.out.println(n);
         	}
}
