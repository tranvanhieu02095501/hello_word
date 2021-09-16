package helloworld;

import java.util.Scanner;

//Hãy giải phương trình bậc 1 y = ax + b, với các tham số a, b được nhập vào từ bàn phím
//Kết quả xuất ra màn hình
//Chương trình đẩy lên github và chia sẻ link vào phần trả lời bài tập
public class pt_bac1 {
   public static void main(String[] args) {
	   Scanner sc = new Scanner (System.in);
	   System.out.println(" Enter to a : ");
	   float a =  sc.nextFloat();
	   System.out.println(" Enter to b : ");
	   float b = sc.nextFloat();
	     if(a==0) { 
	         if(b==0) 
	         {
	        	 System.out.println("PT vô số nghiệm.");
	         }else if(b!=0) {
	        	 System.out.println("PT vô nghiệm.");
	         }
        } else {
        	 System.out.println(" PT có nghiệm là :" + -b/a);
        }
}
}
