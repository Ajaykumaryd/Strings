package Strings;

public class q1removex {
	//xaxb
	public static String remove(String s){
	String output="";
	for(int i=0;i<s.length();i++){
	if(s.charAt(i)!='x'){
		output+=s.charAt(i);
	}
	}
	return output;
	
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s="xaxb";
     System.out.println(remove(s));
	}

}
