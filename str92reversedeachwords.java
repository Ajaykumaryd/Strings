package Strings;
import java.util.Scanner;

//Aadil has been provided with a sentence in the form of a string as a function parameter. 
//The task is to implement a function so as to print the sentence such that each word in the sentence is reversed.
//Sample Input 1:
//Welcome to Coding Ninjas
//Sample Output 1:
//emocleW ot gnidoC sajniN
public class str92reversedeachwords {
	public static String reverseeachwords(String str){
	int n=str.length();	
	String ans=""; 
	int currentwordstart=0;
	int i=0;
	for(i=0;i<n;i++){		
	if(str.charAt(i)==' '){
		//Reverse Current Word
	int currentwordend=i-1;
	String reversedword="";
	for(int j=currentwordstart;j<=currentwordend;j++){
		reversedword=str.charAt(j)+reversedword;
	}//Add it final String(ans)
		ans+=reversedword+ " ";
		currentwordstart=i+1;	
	}}
//	to print last word
	int currentwordend=i-1;
	String reversedword="";
	for(int j=currentwordstart;j<=currentwordend;j++){
		reversedword=str.charAt(j)+reversedword;
	}
	ans+=reversedword;
	return ans;
	} 
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str="abc def ghi jkl";
		System.out.println(reverseeachwords(str));
	}
}
