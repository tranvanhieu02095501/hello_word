package phien1_btvonglap;

public class ex7 {
    public static void main(String[] args) {
    	int count = 10, num1 = 0, num2 = 1;
        System.out.print("Chuỗi Fibonacci với "+count+" số là: ");
        for (int i = 1; i <= count; ++i)
        {
            System.out.print(num1+" ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
        
	}
}