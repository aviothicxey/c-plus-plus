// q1
class Main{
    private static Node reverseLL(Node head){
        Node temp = head;
        Node prev = null ;
        Node next = null ;

        while(temp != null){
            next = temp.next;
            temp.next = prev ;
            prev = temp ;
            temp = next;
        }
        return prev;
    }
}

//q2:
class Main{
    private static int summ(int a , int b){
        return a + b;
    }
    private static int diff(int a , int b){
        return a - b;
    }
    private static int prod(int a ,int b){
        return a * b;
    }
    private static int quotient(int a , int b){
        return a / b;
    }
    private static boolean isDivisible(int a , int b){
        return a % b == 0 ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Sum: " + summ(a,b));
        System.out.println("Difference: " + diff(a,b));
        System.out.println("Product: " + prod(a,b));
        System.out.println("Quotient: " + quotient(a,b));
        System.out.println("Is divisible: " + isDivisible(a,b));

    }
}

// q3:
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ;j++){
                System.out.print(j);
            }
             System.out.println();
        }
    }
}

// q4:
class Solution{
    public static boolean isPalindrome(Node head){
        Node slow = head ;
        Node fast = head ;
        while (fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next;
        }

        if(fast !=null){
            slow = slow.next;
        }
        Node curr = slow ;
        Node prev = null ;
        Node next = null;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node p1 = prev ;
        Node p2 = head;
        while ( p1 != null && p2 != null){
            if(p1.val != p2.val){
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
}

