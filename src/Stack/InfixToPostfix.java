package Stack;
import java.util.*;
import java.util.*;

public class InfixToPostfix {
    public static void main(String[] args) {
        System.out.println(infixToPostfix("a+b"));
    }

    public static String infixToPostfix(String infixExpression) {
        Stack<Character> stack = new Stack<>();
        StringBuilder postfixExpression = new StringBuilder();

        for (char ch : infixExpression.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                postfixExpression.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfixExpression.append(stack.pop());
                }
                stack.pop(); // Discard '('
            } else {
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    postfixExpression.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                return "Invalid infix expression";
            }
            postfixExpression.append(stack.pop());
        }

        return postfixExpression.toString();
    }

    private static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }
}
