package Strings;
import java.util.Arrays;
public class Anagrams {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hashTable("decima","medical"));
	}
	public static boolean areAnagrams(String a,String b) {
		String t1 = sortString(a);
		String t2 = sortString(b);
		if(a.length()!=b.length()) {
			return false;
		}
		else if(t1.equals(t2)){
			return true;
		}
		StringBuilder sb = new StringBuilder();
		
		return false;
	}
	
	public static String sortString(String a) {
		char[] s = a.toCharArray();
		Arrays.sort(s);
		return String.valueOf(s);
	}
	public static boolean hashTable(String a,String b) {
		
		if(a.length()!=b.length()) {
			return false;
		}
		char[] A = a.toCharArray();
		char[] B = b.toCharArray();
 		int[] h = new int[26];

 		for(int i =0;i<a.length();i++) {
 			h[A[i]-97]+=1;
 			System.out.println(h[A[i]-97]  +" "  +i);
 		}
		for(int i = 0;i<b.length();i++) {
			h[A[i]-97]-=1;
			if(h[A[i]-97]<0) {
				break;
			}
		}
		for(int i = 0;i<26;i++) {
			if(h[i]!=0) {
				return false;
			}
		}
		return true;
		
	}
}
