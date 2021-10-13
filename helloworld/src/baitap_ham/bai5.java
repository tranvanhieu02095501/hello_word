package baitap_ham;

import java.util.Scanner;
import static java.lang.Math.sqrt;

//5: Hãy viết chương trình thực hiện các yêu cầu sau:
//- Xây dựng hàm giải phương trình bậc (ax2 + bx + c = 0), với hệ số a & b & c được truyền
//vào qua thông số của hàm.
//- Chương trình chính nhận các thông số a, b & c từ bàn phím
//- Chương trình chính gọi hàm giải phương trình bậc 2 nêu trên
public class bai5 {
     public static void main(String[] args) {
    	 int a, b, c;
         float x1, x2, detail;
         
         Scanner scan = new Scanner(System.in);
         
         System.out.println("Nhap a= ");
         a = scan.nextInt();
         
         System.out.println("Nhap b= ");
         b = scan.nextInt();
         
         System.out.println("Nhap c= ");
         c = scan.nextInt();
         
         giaiptbac2 (a,b,c);
	}
     public static void giaiptbac2(int a,int b, int c) {
    	 float x1, x2, detail;
    	 detail = (b*b - (4*a*c))/(2*a);
         if (detail<0) {
             System.out.println("PT  vo nghiem");
         } else if(detail==0) {
             x1=x2= (-b/(2*a));
             System.out.println("PT co nghiem kep x1 = x2= " + x1);
         }
         else {
             x1 = (float) ((-b + sqrt(detail))/(2*a));
             x2 = (float) ((-b - sqrt(detail))/(2*a));
             System.out.println("PT co 2 nghiem x1 = " + x1 + "x2 = " + x2);
         } 

	}
}
