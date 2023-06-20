package Sorting;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sort an arrays={5,27,3,22,45,90} using quick sort
		int[] a = {3,9,1,6,2};
		quickSort(a,0,a.length-1);
		for(int i = 0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	private static void swap(int[] a,int i,int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	private static void quickSort(int[] a, int i, int j) {
		// TODO Auto-generated method stub0
		int loc;
		if(i<j) {
			loc = partition(a,i,j);
			quickSort(a,i,loc-1);
			quickSort(a,loc+1,j);
		}
	}

	private static int partition(int[] a, int low, int high) {
	    int pivot = a[high];
	    int i = low - 1;
	    for (int j = low; j <= high - 1; j++) {
	        if (a[j] < pivot) {
	            i++;
	            swap(a, i, j);
	        }
	    }
	    swap(a, i + 1, high);
	    return i + 1;
	}

	

}
