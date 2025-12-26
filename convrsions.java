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
class infix2Prefix{
static int priority(char ch){
    if(ch== '+' || ch == '-') return 1;
    if(ch == '*' || ch == '/') return 2;
    if(ch == '^')return 3;
    return -1;
}
static String infixToPrefix(String s){
    StringBuilder rev = new StringBuilder(s).reverse();

    for(int i = 0 ; i < rev.length();i++){
        if(rev.charAt(i) == '('){
            rev.setCharAt(i , ')');
        } else if(rev.charAt(i)== ')'){
            rev.setCharAt(i,'(');
        }
    }
    Stack<Character> st = new Stack<>();
    StringBuilder postfix = new StringBuilder();
    for(int i = 0 ; i <rev.length() ; i++){
        char ch = rev.charAt(i);

        if(Character.isLetterOrDigit(ch)){
            postfix.append(ch);
        }
        else if(ch == '('){
            st.push(ch);
        }
        else if(ch == ')'){
            while(!st.isEmpty() && st.peek()!= '('){
                 postfix.append(st.pop());
            }
            st.pop();
        }
        else{
            while(!st.isEmpty() && priority(ch)< priority(st.peek())){
                postfix.append(st.pop());
            }
            st.push(ch);
        }
    }
    while(!st.isEmpty()){
        postfix.append(st.pop());
    }
    return postfix.reverse().toString();
}

}

//postfix to infix:
class postfix2infix{
    public static boolean isOperator(char ch){
        return ch == '+' || ch == '-' || ch == '/' || ch == '^' || ch == '*';
    }

    public static String postfixToInfix(String s){
        Stack<String> st = new Stack<>();

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                st.push(String.valueOf(ch));
            }
            else if(isOperator(ch)){
                String op2 = st.pop();
                String op1 = st.pop();
                String exp = "(" + op1 + ch + op2 + ")";

                st.push(exp);
            }
        }
        return st.peek();
    }
}