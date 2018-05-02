package tests;

import java.time.*;
import java.util.EmptyStackException;
import java.util.Stack;

public class Challenge1 {
    public static void main(String[] args) {

        //String str1 = "[()]}";
        String str1 = "{[(])}";

        System.out.println(isBalanced(str1) ? "YES" : "NO");

        String str = Instant.now().toString();
        LocalDateTime date = LocalDateTime.parse(str);
        Instant instant = date.atZone(ZoneId.systemDefault()).toInstant();
        System.out.println(instant);

    }

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        try {
            for (byte c : expression.getBytes()) {
                char ch = (char) c;
                if (ch == '(' || ch == '{' || ch == '[') {
                    stack.push(ch);
                } else {
                    char top = stack.pop();
                    if (ch == ')' && top != '(') {
                        return false;
                    }
                    if (ch == '}' && top != '{') {
                        return false;
                    }
                    if (ch == ']' && top != '[') {
                        return false;
                    }
                }
            }
        } catch (EmptyStackException e) {
            return false;
        }
        return stack.isEmpty();
    }
}
