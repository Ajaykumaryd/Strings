package StringAssignments;

import java.util.Scanner;

//For a given a string(str), find and return the highest occurring character.
//Example:
//Input String: "abcdeapapqarr"
//Expected Output: 'a'
//Since 'a' has appeared four times in the string which happens to be the highest frequency character,
//the answer would be 'a'

public class str4highestfreq {
	
 public static char highestfreq(String str){
 int n=str.length();
 int freq[]=new int[256];
 for(int i=0;i<n;i++){
	 char ch=str.charAt(i);
	 freq[ch]++;}	   
 char ans=str.charAt(0);
 int count=freq[ans];
 for(int i=1;i<n;i++){
	 char ch=str.charAt(i);
	 if(freq[ch]>count){
		count=freq[ch];
		ans=ch;
 }
 }
 return ans;
 }
 public static void main(String[] args) {
 Scanner s = new Scanner(System.in);
 String str=s.nextLine();
 char ch=highestfreq(str);
 System.out.println(ch);
} 	
}