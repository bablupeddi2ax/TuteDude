package Sorting;

public class InsertionSort {
	//Deck of cards kind of thing 
	// We assume that the first element is always soerted
	/* 
	 * complexity:o(n*n) 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,1,2,33,22,12,1,21,2,1};
		int j;
		for(int i = 1;i<10;i++) {
			j = i;
			while(j>0 && a[j-1]>a[j]) {
				a[j-1] = a[j-1]^a[j];
				a[j]=a[j-1]^a[j];
				a[j-1] = a[j-1]^a[j];
				j--;
			}
		}
	}

}
