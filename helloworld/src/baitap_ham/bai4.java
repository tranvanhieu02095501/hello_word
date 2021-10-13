package baitap_ham;
//Bài 4: Hãy viết chương trình thực hiện các yêu cầu sau:
//- Xây dựng hàm giải phương trình bậc 1 (ax + b = 0), với hệ số a & b được truyền vào qua
//thông số của hàm.
//- Chương trình chính nhận các thông số a, b từ bàn phím
//- Chương trình chính gọi hàm giải phương trình bậc 1 nêu trên
import java.text.DecimalFormat;
import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("giai phương trình bậc nhat : ");
		System.out.println(" nhap a: ");
		int a= sc.nextInt();
		System.out.println("nhap b : ");
		int b= sc.nextInt();
		tinh(a,b);
		
	}
    public static void tinh(int aNumber,int bNumber) {
    	double nghiem;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
    	 if (aNumber == 0) {
             if (bNumber == 0) {
                 System.out.println("Phương trình này có vô số nghiệm.");
             } else {
                 System.out.println("Phương trình vô nghiệm.");
             }
         } else {
             nghiem = (double) -bNumber / aNumber;   // ép kiểu để cho ra kết quả chính xác
             System.out.println("Phương trình có nghiệm x = " + decimalFormat.format(nghiem) + ".");
         }
   	}
}
