package Strings;
import java.util.Scanner;
public class str4printallchars {
	
	public static void printallchar(String str) {
	int n=str.length();
	for(int i=0;i<n;i++){
	System.out.print(str.charAt(i));
	}
	System.out.println();
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str=s.nextLine();
		//String str=s.next();
		printallchar(str);
	}
}
