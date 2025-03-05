import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            System.out.println(stack);
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (c == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                } else if (c == '}') {
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                } else if (c == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("hello world");
        String trueCase = "()[]{}";
        String falseCase = "(]";
        System.out.println(isValid(falseCase));
    }
}
