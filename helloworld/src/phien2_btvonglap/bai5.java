package phien2_btvonglap;

import java.util.Scanner;

public class bai5 {

	public static boolean kiemtra(int n) {
        
        if (n < 2) {
            return false;
        }
        
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Nhập n = ");
        int n = scanner.nextInt();
        System.out.printf(" số nguyên tố đầu tiên là: \n", n);
        int dem = 0; 
        int i = 2;   
        while (dem < n) {
            if (kiemtra(i)) {
                System.out.print(i + " ");
                dem++;
            }
            i++;
        }
    }
}
