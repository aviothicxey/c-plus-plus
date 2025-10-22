class node{
    int data;
    node next;
    node back;
    node(int data1 , node next1 , node back1){
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }
    node(int data1){
        this.data = data1;
        this.next = null;
        this.back = null;
    }};
public class LINKEDLISTJAVA{
    private static void print(node head){
        while(head != null){
            system.out.print(head.data+ " ");
            head = head.next;
        }
        system.out.println();
    }
    public static void main(String[] args){
        int[] arr = {12 , 5 , 6 ,8};
        node head = convert2Arr(arr);
        print(head);
    }
}