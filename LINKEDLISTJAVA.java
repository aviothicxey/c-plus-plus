class Node{
    int data;
    Node next;
    Node back;
    Node(int data1 , Node next1 , Node back1){
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
    private static void print(Node head){
        while(head != null){
            System.out.print(head.data+ " ");
            head = head.next;
        }
        System.out.println();
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
    private static Node deleteHead(Node head){
    if(head == null || head.next == null){
        return null;
    }
    Node prev = head;
    head = head.next;

    head.back = null;
    prev.next = null; 

    
    return head;
}
private static Node deleteTail(Node  head){
    if(head == null || head.next == null){
        return null;
    }
    Node tail = head;
    while (tail.next!= null)
    {
        tail= tail.next;
    }
    Node prev = tail.back;
    prev.next = null;
    tail.back = null;
   
    return head;

}
private static Node insertHead(Node head, int val){
    // return new Node (val,head); // for singly;
    if(head == null ) return new Node (val);
    Node newNode = new Node(val , head , null);
    head.back = newNode;
    return newNode;
}
private static Node insertTail(Node head , int val){
    if(head == null ) return new Node (val);
    Node tail = head;
    while(tail.next != null){
        tail = tail.next;
    }
    Node newNode = new Node (val , null , tail);
    tail.next = newNode;
    return head;
}
private static Node reverse(Node head){
    if (head == null || head.next == null) {
            return head;
        }
    Node temp = head ;
    Node prev = null;
    while(temp != null){
        prev = temp.back;
        temp.back = temp.next;
        temp.next = prev;
        temp = temp.back;
    }
    if(prev != null){
        head = prev.back;
    }
    return head;


}
    public static void main(String[] args){
        int[] arr = {12 , 5 , 6 ,8};
        Node head = convert2Arr(arr);
        // head = deleteHead(head);
        // head = deleteTail(head);
        // head = insertHead(head,10);
        // head = insertTail(head , 20);
        head = reverse(head);
        print(head);
    }
}