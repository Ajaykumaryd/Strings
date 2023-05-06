package StringAssignments;
import java.util.Scanner;

//For a given a string(str) and a character X, 
//write a function to remove all the occurrences of X from the given string.
//The input string will remain unchanged if the given character(X) doesn't exist in the input string.


public class str5removechar {
	
    public static String removechar(String str,char ch){   
	int n=str.length();
	String ans="";
	for(int i=0;i<n;i++){
	 if(str.charAt(i)!=ch){
	  ans=ans+str.charAt(i);
      }}
	 return ans;}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      Scanner s=new Scanner(System.in);
//      String str=s.nextLine();
//      char ch=s.next().charAt(0);
//      String ans=removechar(str,ch);
//      System.out.println(ans);
      
      String str="abcsdadaa";
      char ch='a';
   
      System.out.println(removechar(str,ch));
}
}
