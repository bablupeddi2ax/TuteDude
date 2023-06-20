package Sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,1,2,33,22,12,1,21,2,1};
		for(int i = 0;i<10;i++) {
			int idx = indexOfMin(a,i,10);
			if(i!=idx) {
			a[i] = a[i]^a[idx];
			a[idx] = a[i]^a[idx];
			a[i] = a[i]^a[idx];
		}}
		System.out.println("after Selection Sort");
		for(int i = 0;i<10;i++) {
			System.out.println(a[i]);
		}
	}

	private static int indexOfMin(int[] a, int currIdx, int n) {
		// TODO Auto-generated method stub
		int min = a[currIdx];
		int minIdx = currIdx;
		for(int k = currIdx+1;k<n;k++) {
			if(a[k]<min) {
				minIdx = k;
				min = a[k];
			}
		}
		return minIdx;
	}

}
