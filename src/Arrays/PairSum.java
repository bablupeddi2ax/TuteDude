package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Find a pair in a given array whose sum is k 
		ArrayList<Integer> a= new  ArrayList<Integer>(Arrays.asList(6,3,8,10,16,7,5,2,9,14));
		
		int k = 10;
		for(int i =0;i<a.size();i++) {
			for(int j=i+1;j<a.size();j++) {
				if(a.get(i) + a.get(j)==k) {
					System.out.println(a.get(i)+""+a.get(j));
				}
			}
		}
		
		//using hasharray
		//size is largestnumber+1
		ArrayList<Integer> hashArray = new ArrayList<Integer>( Collections.nCopies(50, 0));
		for(int i =0;i<a.size();i++) {
			hashArray.set(a.get(i), hashArray.get(a.get(i))+1);
		}
		for(int i=0;i<hashArray.size();i++) {
			if(hashArray.get(i)!=0 ) {
				int s = k-i;
				if(s>0 && s<50 && hashArray.get(s)!=0) {
					System.out.println(i+ " " +s);
				}
			}
		}
		
	}

}
