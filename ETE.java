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

// q5:
class Main{
    public static Node mergeList(Node l1 , Node l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        Node dummy = new Node(0);
        Node temp = dummy;

        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                temp.next = l1;
                l1 = l1.next;
            }
            else{
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        if(l1 != null) temp.next = l1;
        if(l2 != null) temp.next = l2;
        return dummy.next;

    }
}

// q6 
class Main{
    private static void Sortt(int[] arr){
        int n = arr.length;
        for(int i = 1 ; i< n ; i++){
            int key = arr[i];
            int j = i -1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    private static int Search(int[] arr , int target){
        int low = 0 ; int high = arr.length -1;
        while(low <= high){
            int mid = low + (high -low) /2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                low = mid +1;
            }
            else high = mid -1;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
         Sortt(arr);

        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Element " + x + " is at index: " + Search(arr,x));
    }
}

//q7:
class Main{
    private static boolean isPalindrome(int n ){
        int temp = n;
        int rev = 0;
        while(n>0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n/= 10;
        }
        return temp == rev;
    }
}

// q8:
class Main{
    public static int factorial(int n){
        if(n == 0 || n == 1) return 1;
        int fact = n * factorial(n -1) ;
        return fact;
    }
}
         
// q9:
class Main{
    public static String isValid(String s){
        if(s.length() == 0) return "Balanced";
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch =='{' || ch == '[' || ch =='(' ) st.push(ch);
            else{
                if(st.isEmpty()) return "Not Balanced";
                char c = st.pop();
                    if(ch == '}' && c != '{' || ch ==']' && c !='[' || ch ==')' && c !='('){
                        return "Not Balanced";
                    }
            }
        }
        if(st.isEmpty()) return "Balanced";
        return "Not Balanced";
    }
}

//q 10:
class Main{
    public static String Detect_Cycle(Node head){
        Node slow = head ;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next;

            if(slow == fast){
                return "Cycle Detected";
            }
        }
        return "No Cycle";
    }
}
