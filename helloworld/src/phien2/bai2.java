package phien2;

import java.util.Scanner;

//. Viết một chương trình Java đưa người dùng cung cấp một ký tự duy nhất từ ​​bảng chữ cái. In
//Nguyên âm hoặc Phụ âm, tùy thuộc vào đầu vào của người dùng. Nếu đầu vào của người dùng không phải là một chữ cái (giữa a và z
//hoặc A và Z), hoặc là một chuỗi có độ dài> 1, in một thông báo lỗi.
//. Write a Java program that takes the user to provide a single character from the alphabet. Print
//Vowel or Consonant, depending on the user input. If the user input is not a letter (between a and z
//or A and Z), or is a string of length > 1, print an error message.

public class bai2 {
    public static void main(String[] args) {
    	  boolean isVowel=false;;
          Scanner scanner=new Scanner(System.in);
          System.out.println("Nhập vào kí tự cần kiểm tra : ");
          char ch=scanner.next().charAt(0);
          scanner.close();
          switch(ch)
          {
              case 'a' :
              case 'e' :
              case 'i' :
              case 'o' :
              case 'u' :
              case 'A' :
              case 'E' :
              case 'I' :
              case 'O' :
              case 'U' : isVowel = true;
          }
          if(isVowel == true) {
              System.out.println(ch+" Là nguyên âm");
          }
          else {
              if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
                  System.out.println(ch+" Là phụ âm");
              else
                  System.out.println("Không nằmtrong bảng chữ cái!");
          }
      }
		
	}

