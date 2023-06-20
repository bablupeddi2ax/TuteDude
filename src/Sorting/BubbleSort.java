package Sorting;

public class BubbleSort {
/*
  complexity: o(n*n)
  space:o(1)
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,1,2,33,22,12,1,21,2,1};

		for(int i= 0;i<10;i++) {
			for(int j = 0;j<10-i-1;j++) {
				if(a[j]>a[j+1]) {
					a[j] = a[j]^a[j+1];
					a[j+1] = a[j]^a[j+1];
					a[j] = a[j]^a[j+1];
				}
			}
		}
		System.out.println("after Bubble Sort");
		for(int i = 0;i<10;i++) {
			System.out.println(a[i]);
		}
	}
}

