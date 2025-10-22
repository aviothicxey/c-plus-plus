class Node{
    int data;
    Node next;
    Node back;
    Node(int data1 , node next1 , node back1){
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }
    Node(int data1){
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
    private static Node convert2Arr(int[]arr){
        Node head = new Node (arr[0]);
        Node prev = head;
        for(int i = 1; i < arr.length;i++){
            Node temp = new Node(arr[i],null , prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    public static void main(String[] args){
        int[] arr = {12 , 5 , 6 ,8};
        Node head = convert2Arr(arr);
        print(head);
    }
}