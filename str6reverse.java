package Strings;

import java.util.Scanner;
public class str6reverse {
    public static String reverse(String a){
	String reversedstring="";
	int n=a.length();
	for(int i=n-1;i>=0;i--){
	reversedstring=reversedstring+a.charAt(i);		
	}
	return reversedstring;
    }	
	public static void main(String[] args) {
	String str="abcd";
	String Reversed=reverse(str);
	System.out.println(Reversed);	
	}
    }
