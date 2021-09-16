package helloworld;

import java.util.Scanner;

public class password {
     public static void main(String[] args) {
//    	final  String U = "HuyHoang";
//    	final  String  P = "2021";
    	 Scanner sc = new Scanner (System.in);
		System.out.println(" Nhập UserName : ");
		String username = sc.nextLine();
		System.out.println(" Nhập PassWord : ");
		String password = sc.nextLine();
		if(  username =="HuyHoang" ||  password == "2021") {
			System.out.println("Nhập đúng (u,p)");
		}else {
			System.out.println("Nhập sai Username or PassWord");
		}
		 
	}
}
