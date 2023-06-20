package BitwiseOperations;

import java.util.Scanner;

public class ToggleIthBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a;
	        Scanner sc = new Scanner(System.in);
	        a = sc.nextInt();
	        int k = sc.nextInt();
	         System.out.println(a^(1<<(k-1)));
	}

}
