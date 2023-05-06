package StringAssignments;
import java.util.Scanner;
//aaabbccdsa
//Sample Output 1:
//a3b2c2dsa
//Explanation for Sample Output 1:
//In the given string 'a' is repeated 3 times, 'b' is repeated 2 times, 'c' is repeated 2 times and 
//'d', 's' and 'a'and occuring 1 time hence no compression for last 3 characters.

public class str6stringcompressed {
	public static String getCompressedString(String str) {
		int n=str.length();
		int i=0;
		String ans="";
		while(i<n){
		ans=ans+str.charAt(i);	
	     int j=i+1;
		 while(j<n && str.charAt(i)==str.charAt(j)){
			 j++;
		 }
	     int count =j-i;
		 if(count>1){
		 ans=ans+count;
		}
		i=j;
		}
		return ans;
	}
	public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	String str=s.next();
	System.out.println(getCompressedString(str));
	}
}
