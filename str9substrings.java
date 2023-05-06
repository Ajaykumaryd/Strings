package Strings;
import java.util.Scanner;
public class str9substrings {
    public static void substrings(String str){
	int n=str.length();
	for(int start=0;start<n;start++){
       for(int end=start;end<n;end++){
    	 System.out.println(str.substring(start,end+1));  
       }
	}
    }
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String str="pqrs";
	substrings(str);	
	}
}
//method 2
//for(int len=1;len<=str.length();len++){
//    //We have to print all strings wih length as "len"
//    for(int start=0;start<=str.length()-len;start++){
//        int end=start+len-1;
//        System.out.println(str.substring(start,end+1));
//    }
//}
//}
