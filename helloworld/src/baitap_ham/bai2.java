package baitap_ham;

import java.util.Scanner;

//Bài 2: Hãy xây dựng một hàm thực hiện các yêu cầu sau:
//- Nhận một tham số đầu vào là một chuỗi ký tự (kiểu String)
//- Xuất ra màn hình nội dung chuỗi được truyền vào từ tham số
//- Hàm không có giá trị trả về
//Từ chương trình chính gọi thực hiện hàm này.
public class bai2 {
     public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		
		System.out.println("xuat chuoi : ");
		String x = sc.nextLine();
		xuatchuoi(x);
		
	}
     public static void xuatchuoi(String n ) {
 		System.out.println(n);
 	}
}
