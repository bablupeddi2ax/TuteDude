package Sorting;
public class MergeSorting {
	public static void main(String[] args) {
		int[] arr = {5,27,3,22,45,90};
		MergeSort(arr,0,arr.length-1);
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void MergeSort(int arr[],int l,int h) {
		if(l<h) {
			int m   = l+(h-l)/2;
			MergeSort(arr,l,m);
			MergeSort(arr,m+1,h);
			Merge(arr,l,m,h);
		}
	}
	public static void Merge(int[] arr,int l,int m,int h) {
		int n1 = m-l+1;
		int n2 = h-m;
		int[] L = new int[n1];
		int[] R = new int[n2];
		for(int i = 0;i<n1;i++) {
			L[i] = arr[l+i];
		}
		Integer.bi
		for(int i = 0;i<n2;i++) {
			R[i] = arr[m+1+i];
		}
		int i=0,j=0;
		int k = l;
		while(i<n1 && j<n2) {
			if(L[i]<=R[j]) {
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k] = R[j];
			j++;
			k++;
		}	
		}

}
