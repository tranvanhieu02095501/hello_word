package helloworld;

import java.util.Scanner;

public class pt_bac2 {
	public static void main(String[] args) {
	
        double a, b, c, x1, x2, delta;
        String ketQua = "";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập a (a # 0): ");
            a = scanner.nextDouble();
        } while (a == 0);
        System.out.print("Nhập b: ");
        b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        c = scanner.nextDouble();
        delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            ketQua = "Phương trình vô nghiệm!";
        } else if (delta == 0) {
            x1 = x2 = -b/ (2*a);
            System.out.println("Phương trinh có nghiệm kép là x1 = x2 = "+x1);
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            ketQua = "Phương trình có 2 nghiệm x1 = " + x1 + " và x2 = " + x2;
        }
        System.out.println(ketQua);
    }

}

