package Strings;

public class q2repacepi {
	//           xpix
	public static String replace(String s){
	
	String output="";	
	for(int i=0;i<s.length();i++){
		if(i + 1 < s.length()&& s.charAt(i)=='p'&& s.charAt(i+1)=='i'){
		output+="3.14";
		i++;
		}
		else {
			output+=s.charAt(i);
		}
	}
	return output;		
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s="apib";
    System.out.println(replace(s));
	}
}
