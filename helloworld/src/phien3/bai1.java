package phien3;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
    	 Scanner sc = new Scanner (System.in);
            //temperature in fahrenheit
            double  ce ;
              double fa = sc.nextDouble();
            
      
            //calculate celsius temperature
            ce = (fa - 32)/1.8;
            
            
  
            System.out.println( "value of temperature in fahrenheit:" + fa);
      
            //print the celsius temperature
            
            
            System.out.println("value of temperature in celsius:" + ce);
        }
	}

