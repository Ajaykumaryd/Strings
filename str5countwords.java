package Strings;
import java.util.Scanner;

//For a given input string(str), find and return the total number of words present in it.
//It is assumed that two words will have only a single space in between.
//Also,there wouldn't be any leading and trailing spaces in the given input string.
//input Coding Ninjas!
//2

public class str5countwords {
	public static int countwords(String str){
		
		int n = str.length();
		if(n==0){
		return 0;
		}	
		int count = 1;
	    for(int i=0;i<n;i++){
	    if(str.charAt(i)==' '){
	    count++;
	    }
	    }
	    return count;
		}	
	public static void main(String[] args) {
		
     Scanner s=new Scanner(System.in);
     String str=s.nextLine();
     int ans=countwords(str);
     System.out.println(ans);
     }}

//	String str1="Hello worlds";
//	int words=countwords(str1);
//	System.out.println(words);
//	}


