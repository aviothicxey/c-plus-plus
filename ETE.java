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