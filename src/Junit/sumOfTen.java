package Junit;
public class sumOfTen {

	public static int findMax(int arr[]){  
        int max=Integer.MIN_VALUE;  
        for(int i=1;i<arr.length;i++){  
            if(max<arr[i])  
                max=arr[i];  
        }  
        return max;  
    }  
	
}
