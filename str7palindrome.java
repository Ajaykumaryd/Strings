package Strings;

import java.util.Scanner;

//A palindrome is a word, number, phrase,
//or other sequences of characters which read the same backwards and forwards.
//Sample Input 1 :
//abcdcba
//Sample Output 1 :
//true 
public class str7palindrome {
	public static boolean palindrome(String s){
	int n=s.length();
	int i=0;
	int j=n-1;                                                                              
	while(i<j){
	if(s.charAt(i)!=s.charAt(j)){
	return false;
	} else{
	  i++;
	  j--;
	     }
	   }	
	return true;
	   }
	public static void main(String[] args){
		
	// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
        boolean ans=palindrome(str);
        System.out.println(ans);	
	}
}

//method2
//public static Boolean reverse(String str){
//	String reversedstring="";
//	int n=str.length();
//	for(int i=n-1;i>=0;i--){
//	reversedstring=reversedstring+str.charAt(i);		
//	}
//	if(reversedstring.equals(str)){
//		return true;}
//	else {
//		return false;
//	}
//    }	
//	public static void main(String[] args) {
//	String str="cristiano";
//    boolean ans=reverse(str);
//    System.out.println(ans);
//	
//	}
//}


