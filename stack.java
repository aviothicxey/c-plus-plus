class Stack{
    private int size;
    private int stack[];
    private int top;

    public boolean isempty(){
        return top == 0;
    }

    public int size(){
        return top;
    }

    public Stack (int size1){
        this.size = size1;
        this.stack= new int[size1];
        this.top =0;
    }

    public void push(int value){

         if(top == size){
            System.out.println("overflow");
            return;
        }

        stack[top++] = value;

       
    }

    public int pop(){
        if(isempty()){
            System.out.println("Stack underflow");
            return -1;
        }
        return stack[--top];
    }

    public int peek(){
         if (isempty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top - 1];
    }

}



public class stack {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());
        System.out.println("Stack size: " + stack.size());

        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        System.out.println("Is stack empty? " + stack.isempty());
    }
}
 
