package BitwiseOperations;
import java.util.*;

public class IthBitIsSet {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        int numOfBits = 64; // Assuming 32-bit integer

        for (int i = numOfBits - 1; i >= 0; i--) {
            if ((a & (1 << i)) != 0) {
                sb.append('1');
            } else {
                sb.append('0');
            }
        }

        System.out.println("The binary representation of " + a + " is " + sb.toString());
    }
}
