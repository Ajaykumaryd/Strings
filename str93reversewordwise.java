package Strings;

import java.util.Scanner;
  
//intput abc def
//output def abc
public class str93reversewordwise {
	public static String reverseWordWise(String input){
		int n=input.length();
		String ans="";
		int i=n-1;
		int end=n;
		while(i>=0){			
		if(input.charAt(i)==' '){		
		ans=ans+input.substring(i+1,end)+" ";
		end=i;
		}
		i--;
		}
     	ans=ans+input.substring(i+1,end)+" ";// to print the 1st word ie abc
		return ans ;
	    }
public static void main(String[] args) {
//	Scanner s=new Scanner(System.in);
//	String str="abc cde";
//	System.out.println(reverseWordWise(str));	
	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	String ans=reverseWordWise(str);
	System.out.println(ans);
	}
}

