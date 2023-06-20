package Strings;
import java.util.*;
public class MaxAndMinWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "will this code get checked by tutedude I don't know";
		String[] a = s.split(" ");
		int maxLength = Integer.MIN_VALUE;
		int minLength = Integer.MAX_VALUE;
		for(int i = 0;i<a.length;i++) {
			if(a[i].length()>maxLength) {
				maxLength = a[i].length();
			}
			if(a[i].length()<minLength) {
				minLength = a[i].length();
			}
		}
		System.out.println("MaxLength:" + maxLength + "\n" + "MinLength:" +minLength);
	}

}
