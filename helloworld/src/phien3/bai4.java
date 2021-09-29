package phien3;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double mininy=60*24*365;
		double min = sc.nextDouble();
		int year = (int)(min/mininy);
		int day =(int) (min/60/24)%365;
		System.out.println(year + "year!");
		System.out.println(day + "day!");
	}
}
