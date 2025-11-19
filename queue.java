// //queue:
// //queue implementation using array:
// class Queue {
//     int[] arr;
//     int size;
//     int capacity;

//     Queue(int capacity) {
//         this.capacity = capacity;
//         arr = new int[capacity];
//         size = 0;
//     }
//     void enqueue(int x) {
//         if (size == capacity) {
//             System.out.println("Queue is full");
//             return;
//         }
//         arr[size] = x;  
//         size++;
//     }

//     int dequeue() {
//         if (size == 0) {
//             System.out.println("Queue is empty");
//             return -1;
//         }

//         int val = arr[0]; 
//         for (int i = 1; i < size; i++) {
//             arr[i - 1] = arr[i];
//         }

//         size--;
//         return val;
//     }

//     int peek() {
//         if (size == 0) {
//             System.out.println("Queue is empty");
//             return -1;
//         }
//         return arr[0];
//     }

//     boolean isEmpty() {
//         return size == 0;
//     }

//     boolean isFull() {
//         return size == capacity;
//     }
// }


// // queue implementation using linked list:
// class Node {
//     int data;
//     Node next;

//     public Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }
// class LinkedListQueue {
//     private Node front;
//     private Node rear;
//     private int size;

//     public LinkedListQueue() {
//         this.front = null;
//         this.rear = null;
//         this.size = 0;
//     }

//     public boolean isEmpty() {
//         return size == 0;
//     }

//     public int size() {
//         return size;
//     }

//     public void enqueue(int value) {
//         Node newNode = new Node(value);
//         if (rear != null) {
//             rear.next = newNode;
//         }
//         rear = newNode;
//         if (front == null) {
//             front = newNode;
//         }
//         size++;
//     }

//     public int dequeue() {
//         if (isEmpty()) {
//             System.out.println("Queue underflow");
//             return -1;
//         }
//         int value = front.data;
//         front = front.next;
//         if (front == null) {
//             rear = null;
//         }
//         size--;
//         return value;
//     }


//     public boolean isFull() {
//         return false; // A linked list based queue is never full 
//     }

// }


class Queue {
    int[] arr;
    int front = 0;
    int rear = 0;
    int size = 0;
    int capacity;

    Queue(int n) {
        arr = new int[n];
        capacity = n;
    }

    void push(int x) {
        if (size == capacity) {
            System.out.println("Queue is full");
            return;
        }
        arr[rear] = x;
        rear = (rear + 1) % capacity;
        size++;
    }

    int pop() {
        if (size == 0) {                                                                        
            System.out.println("Queue is empty");
            return -1;
        }
        int val = arr[front];
        front = (front + 1) % capacity;
        size--;
        return val;
    }

    int top() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }
}

public class queue{
    public static void main(String[]args){
        Queue queue = new Queue(5);

        queue.push(10);
        queue.push(20);
        queue.push(30);

        System.out.println("Front element: " + queue.top());

        System.out.println("Dequeued: " + queue.pop());
        System.out.println("Front element after dequeue: " + queue.top());
    }
}