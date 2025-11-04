class Node{

    int data;
    Node next;
    Node back;

    Node(int data1 , Node next1 , Node back1 ){
        this.data = data1;
        this.next = next1;
        this.back = back1; 
    }
    Node (int data1){
        this. data = data1;
        this.next = null;
        this.back = null;
    }};

public class LLc{
    private Listnode head;
    private Listnode tail;
    class Listnode{
        int data;
        Listnode next;
        Listnode(int val){
            data = val;
            next = null;
        }
    }
    
    public void start(int val){
        Listnode nw = new Listnode(val);
        if (head == null) {
            head = nw;
            tail = nw;
            nw.next = head; 
        } else {
            tail.next = nw;
            nw.next = head;
            tail = nw;
        }
    }
    
    public void print(int count) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Listnode cur = head;
        for (int i = 0; i < count; i++) {
            System.out.print(cur.data);
            if (i < count - 1) System.out.print(" -> ");
            cur = cur.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        circularlinkedlist ll = new circularlinkedlist();
        ll.start(1);
        ll.start(2);
        ll.start(3);
        ll.print(6); 
    }

}