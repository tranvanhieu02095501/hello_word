package phien3;

import java.util.Scanner;

public class bai5 {
      public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
		 System.out.println("nhap met : ");
		 float met=sc.nextInt();
		 float km= (float)met/1000;
		 System.out.println("nhap gio : ");
		 int gio=sc.nextInt();
		 System.out.println("nhap phut : ");
		 int phut= sc.nextInt();
		 System.out.println("nhap giay : ");
		 int giay= sc.nextInt();
		 
		 float second= gio*60*60 +phut*60+giay; 
		 float hour= (float)second /3600;
		 
		 
		 float ms = (float)met/second;
		 float kmh= (float)km/hour;
		 float mh = (float )met/hour;
		 System.out.println(" m/s : " +ms);
		 System.out.println(" m/h : "+mh);
		 System.out.println(" km/h : "+kmh);
		 
		 
	}
}
