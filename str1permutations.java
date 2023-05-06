package StringAssignments;

public class str1permutations {
	public static boolean isPermutation(String str1,String str2){
	int n=str1.length();
	int m=str2.length();
	if(n!=m){
		return false;
	}
	//this step can be skipped as well
	int freq[]=new int [256];
	for(int i=0;i<256;i++){
	//initializing every number to 0	
	freq[i]=0;
	}
	//Go through str1
	for(int i=0;i<n;i++){
	char ch=str1.charAt(i);
	freq[ch]++;
	}
	//Go through str2
	for(int i=0;i<m;i++){
		char ch=str2.charAt(i);
		freq[ch]--;
	}
	//go through frequency array 
	for(int i=0;i<256;i++){
	if(freq[i]!=0){
		return false;
	}}
	return true; 
	}
	
	public static void main(String[] args) {	
    String str1="heat";
	String str2="terh";
	System.out.println(isPermutation(str1,str2));
	}
}
