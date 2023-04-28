package Strings;
import java.util.*;
public class str8howstringsstored {
	
		// TODO Auto-generated method stub
	
		public static void main(String args[]) {		      
		  String str="abc"; //stored in string pool
		  String str1="abc"; //stored within same stringpool with same adress where str is stored 
		  String str2=new String("abc"); //new will create new space to store outside string pool with diff adress
		  String str3="abc";
		   
		  //output1
		  String str11="abc";
		  String str21=new String("abc");
		  System.out.println(str11==str21);
		  
          //output2
		  String str31="abc";
		  String str23=new String("abc");
		  System.out.println(str31.equals(str23));
		  
		  //immutability
		  String str6="abc";
	      String str14="abc";
	      String str20=new String("abc");
	      str6="xyz";
	      str6=str6+"def";
	      
	      String str8="abc";
	      System.out.println(str6);
	      
	      //outputs
	      String str881="abc";
	      String str288="";
	      System.out.println(str881.contains(str288));
	      }	      
	      //      
	}


