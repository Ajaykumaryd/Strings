package StringAssignments;

//For a given two strings, 'str1' and 'str2', check whether they are a permutation of each other or not.
//Two strings are said to be a permutation of each other when either of the strings
//characters can be rearranged so that it becomes identical to the other one.
//Example: 
//str1= "sinrtg" 
//str2 = "string"
//The character of the first string(str1) can be rearranged to form str2 and 
//hence we can say that the given strings are a permutation of each other.

public class str11permutations {
	public static boolean isPermutation(String str1, String str2) {
	int n=str1.length();
	int m=str2.length();
	if(n!=m){
	return false;
	}
	int freq1[]=new int [256];
	int freq2[]=new int[256];
	for(int i=0;i<n;i++){
	int ch=str1.charAt(i);
	freq1[ch]=+1;
	}
	for(int i=0;i<m;i++){
		int ch=str2.charAt(i);
    freq2[ch]=+1;
	}
	for(int i=0;i<256;i++){
	if(freq1[i]!=freq2[i]){
		return false;
	}}
	return true; 
	}
	public static void main(String[] args){
		
      String str1="heatts";
      String str2="ttseah";
      System.out.println(isPermutation(str1,str2));
	}
}
