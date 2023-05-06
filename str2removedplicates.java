package StringAssignments;
import java.util.Scanner;
//For a given string(str), remove all the consecutive duplicate characters.
//Example:
//Input String: "aaaa"
//Expected Output: "a"
//
//Input String: "aabbbcc"
//Expected Output: "abc"

public class str2removedplicates {
	public static String removeConsecutiveDuplicates(String str) {
        int n=str.length();
        if(n==0){ //to handle the case of empty string
            return str;
        }
        String ans="";
    	int i=0;
    	while(i<n){
    		ans=ans+str.charAt(i);
    		int j=i+1;
    		while(j<n && str.charAt(i) == str.charAt(j)){
                 j++;
    		}					
          i=j;
    	} 
    return ans;
    	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	System.out.println(removeConsecutiveDuplicates(str));	
	}
}
