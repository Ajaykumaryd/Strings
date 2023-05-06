package Strings;

public class str91stringbuffer {

		public static void main(String args[]) {
	        StringBuffer str=new StringBuffer("abc");
	        str.setCharAt(0,'d');
	        str.append("def");
	        System.out.println(str+" "+str.length());
	      
	        //1.Would the Stringbuffer store its string in string pool?
	        //no
	        //2
	}
}
