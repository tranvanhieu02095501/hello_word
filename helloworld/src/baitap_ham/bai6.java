package baitap_ham;

import static java.lang.Math.sqrt;

import java.text.DecimalFormat;
import java.util.Scanner;

//- Cho người dùng lựa chọn giải phương trình bậc 1 hay bậc 2 bằng cách nhập số (1 hay 2)
//từ bàn phím
//- Nếu người dùng chọn giải phương trình bậc 1, thì thực hiện các bước như Bài 4
//- Nếu người dùng chọn giải phương trình bậc 2, thì thực hiện các bước như Bài 5
public class bai6 {
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
         
         System.out.println("Nhap tuy chon = ");
         int tuychon = scan.nextInt();
         if(tuychon == 1) {giaiptbac2( a, b,  c);}
         else if(tuychon == 0) {giaibacnhat( a, b);}
         else System.out.println("vui long nhap lai !");
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
     ////////////////////////
     public static void giaibacnhat(int a,int b) {
     	double nghiem;
         DecimalFormat decimalFormat = new DecimalFormat("#.##");
     	 if (a == 0) {
              if (b == 0) {
                  System.out.println("Phương trình này có vô số nghiệm.");
              } else {
                  System.out.println("Phương trình vô nghiệm.");
              }
          } else {
              nghiem = (double) -b / a;   // ép kiểu để cho ra kết quả chính xác
              System.out.println("Phương trình có nghiệm x = " + decimalFormat.format(nghiem) + ".");
          }
    	}
}
