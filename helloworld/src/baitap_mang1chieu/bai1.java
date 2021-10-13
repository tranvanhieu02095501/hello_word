package baitap_mang1chieu;
import java.util.Scanner;

//Bài 1: Viết chương trình thực hiện các yêu cầu sau:
//- Xây dựng 1 hàm sinh ngẫu nhiên một mảng các số nguyên và trả về ở phần kết quả
//- Xây dựng 1 hàm tìm kiếm với thông số đầu vào là 1 mảng các số nguyên và 1 số nguyên
//N. Hàm này tìm kiếm vị trí xuất hiện đầu tiên của N trong mảng và trả về chỉ số tương ứng.
//Nếu không tìm được thì trả về kết quả là -1
//- Xây dựng chương trình chính thực hiện các hàm trên.
public class bai1 {
    
	public static void main(String[] args) {
		
     	nhapMang();
        }
 
    		public static void nhapMang() {
    			Scanner scanner = new Scanner(System.in);
    	        
    		    int n;
    			do {
    		        System.out.println("Nhập vào số phần tử của mảng: ");
    		        n = scanner.nextInt();
    		    } while (n < 0);
    	        
    		    // khởi tạo và cấp phát bộ nhớ cho mảng
    		    int array[] = new int[n];
    		         
    		    System.out.println("Nhập các phần tử cho mảng: ");
    		    for (int i = 0; i < n; i++) {
    		        System.out.print("Nhập phần tử thứ " + i + ": ");
    		        array[i] = scanner.nextInt();
    		    }
    		    for (int i=0 ;i<n;i++) {
    		    	  System.out.println(" phần tử thứ " + i + ": "+ array[i]);
    		    }
    		}

    		
    		}
    	 
	

