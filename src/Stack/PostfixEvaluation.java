package Stack;
import java.util.*;
import java.util.Stack;

public class PostfixEvaluation {
    public static void main(String[] args) {
        System.out.println(postfixEval("35*62/+4-"));
    }

    public static int postfixEval(String s) {
        char[] c = s.toCharArray();
        Stack<Integer> stack = new Stack<>();
        int x, y, result;
        for (char ch : c) {
            if (isOperand(ch)) {
                stack.push(ch - '0'); // Convert char to integer and push to stack
            } else {
                y = stack.pop();
                x = stack.pop();

                result = operation(ch, x, y);
                stack.push(result);
            }
        }
        result = stack.pop();

        return result;
    }

    public static boolean isOperand(char ch) {
        return (ch >= '0' && ch <= '9'); // Check if the character is a digit
    }

    public static int operation(char ch, int x, int y) {
        switch (ch) {
            case '+':
                return x + y;
            case '-':
                return x - y;
            case '/':
                return x / y;
            case '*':
                return x * y;
            default:
                return 0;
        }
    }
}
