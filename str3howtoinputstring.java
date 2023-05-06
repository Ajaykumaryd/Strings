package Strings;

import java.util.Scanner;

public class str3howtoinputstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
			
			String str1=s.next();
			String str2=s.nextLine();
			System.out.println(str1+""+str1.length());
			System.out.println(str2+""+str2.length());
		
//			System.in in Scanner represents input Stream.
//			If we want to read from a file then we can pass filename instead of System.in
//			.nextLine() reads till '\n' is encountered.		
	}
}
