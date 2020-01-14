import java.util.Stack;

public class IsValid {

    public static void main(String[] args) {

        String input = "()[{}]";
        IsValid isValid = new IsValid();
        boolean valid = isValid.isValid(input);
        System.out.println(valid);

    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if (stack.empty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.empty();
    }

}
