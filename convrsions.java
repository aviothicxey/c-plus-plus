// infix to postfix:
import java.util.Stack;

class InfixToPostfix {

    public static int priority(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        if (ch == '^') return 3;
        return -1;
    }

    public static String infixToPostfix(String s) {

        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Operand
            if (Character.isLetterOrDigit(ch)) {
                ans.append(ch);
            }

            // Opening bracket
            else if (ch == '(') {
                st.push(ch);
            }

            // Closing bracket
            else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans.append(st.pop());
                }
                st.pop(); // remove '('
            }

            // Operator
            else {
                while (!st.isEmpty() && priority(ch) <= priority(st.peek())) {
                    ans.append(st.pop());
                }
                st.push(ch);
            }
        }

        // Pop remaining operators
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.toString();
    }
}


// infix to prefix:
