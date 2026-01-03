swap the sub array in a array till k where k is 3
import java.util.Arrays;
public class SlidingWindow{
    public static void swapSubArray(int[] arr , int k){
        int n = arr.length;
        for(int i = 0 ; i < n ; i+=k){
            int left = i ;
            int right = Math.min(i+k-1, n-1);
            while(left < right && right < n){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}

/*
Q1. Energy Required for Insertion Sort
A shopkeeper has & products kept on his shelf. He assigns a unique rank to each product based on its annual sales. Now the shopkeeper wants to sort all the products in the increasing order of their ranks, but because his products are a bit heavy, so he needs to know how much of his energy will be spent on sorting
all the N products using the Insertion Sort algorithm.
Assume that shifting any product from its place requires 4 units of energy.
Note: If any product is moved from its position, then it will be considered as a shift.
Given an array, denoting the current order and rank of N products. Your task is to find how much energy will be required to sort them using Insertion Sort.
Input Format:
First line of each input will contain an integer number of test cases.
Each test case will contain two lines:
First line will contain a number N no. of products on the shelf.
Next line will contain N space separated numbers, denoting the rank of each product.
Output Format:
For each test case, print on a new line, the energy required to sort the products in increasing order using Insertion sort.
Constraints:
1 << 10
1 <= N <= 50
1 < ranks[i] <= 10^4
Sample Input
5
// No. of test cases
24135
10
10 9 8 7 6 5 4 3 2 1
5
12345
Sample Output
20
216
*/


//solution:
import java.util.*;
public class DSA{
    public static int EnergyRequired(int[]arr){
        int swaps = 0 ;
         int n = arr.length;
         for(int i = 0 ; i < n ; i++){
            int key = arr[i];
            int j = i -1 ;
            while(j>= 0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
                swaps++;
            }
            arr[j+1] = key;
         }
         return swaps * 4 ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        while(K-- > 0){
            int N = sc.nextInt();
            int []a = new int[N];
            for(int i =0 ; i < N ; i++){
                a[i] = sc.nextInt();

            }
            System.out.println(EnergyRequired(a));
        }
    }
}

/* Find the special employee

Some employees of a company decided to connect on Facebook, either directly or indirectly(i.e. via some common friend) on a single day. But due to some recent restrictions, a person can send only one friend request per day. Therefore, to connect together exactly on the same day, they came up with the
following plan:
Employeel will send the friend request to Employee2, then Employee2 will send the request to Employee3, and so on... This way, they will be connected with each other.
In this plan, the last employee has an advantage He can send a friend request to any of the employees, or he can choose not to send it to anyone. But, if he decides to send the request to an employee, then that person will be considered as a special employee (because he would receive friend requests from two people).
Given a linked-list representing their plan, in which each node denotes an employee. Your task is to find and return the node representing the special employee if it exists, otherwise return NULL.
For Example: According to the below diagram, Aman is the special employee because he will receive friend requests from two people.
Complete the function specialEmployee() which takes the head node of the linked list(i.e. the first employee) as a parameter, and returns the node representing the special employee.
Input Format
First line contains the number of Test cases i.e. T.
Each test case contains the following:
First line will contain N, denoting the number of employees.
Next N lines will contain the names of the employees.
Last line will contain the position of special employee in the list. If no special employee exists, then this input will be -1.
Output Format
Print the name of the special employee if it exists, else print -1.
Sample Input
1// Test Cases
5
// No. of employees
Rajesh
Shivam
Aman
Karan
Seema
2
// This signifies the position of special employee (consider e-based indexing)
Sample Output
Aman */


import java.util.*;
class Node{
    String name;
    Node next;
    Node(String name){
        this.name = name ;
        this.next = null;
    }
}
public class Solution{
    public static Node SpecialEmployee(Node head){
        if(head == null || head.next == null) return null;

        Node slow = head;
        Node fast = head;
// detect the cycle:
        while(fast!= null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next;
            if(slow == fast) break;
        }

//no cycle:
        if(fast == null || fast.next == null){
            return null;
        }
//find the start of the cycle:
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow; // special employee
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // number of testcases
        while(T-- > 0){
            int N = sc.nextInt();
            sc.nextLine();
            Node head = null , tail = null;
            ArrayList<Node> list = new ArrayList<>();
            //read employee names and create linked list:
            for(int i = 0; i < N ; i++){
                String name = sc.nextLine();
                Node newNode = new Node(name);
                list.add(newNode);
                if(head == null){
                    head = newNode;
                    tail = newNode;
                }else{
                    tail.next = newNode;
                    tail = newNode;
                }
            }
            int pos = sc.nextInt(); //special employee position
            //If pos != -1 create a cycle
            if(pos != -1){
                tail.next = list.get(pos);
            }
            Node special = SpecialEmployee(head);
            if(special == null)
                System.out.println(-1);
            else
                System.out.println(special.name);
        }

        sc.close();
        
    }
}


// Family Photograph (Reverse in Groups of k)

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
           arr[i] = sc.nextInt(); 
        }
        int k = sc.nextInt();
 // i+=k ensures:Each group starts at i , Next group starts directly at i + k , No overlapping, no double-reversing
        for(int i = 0 ; i < n ; i+=k){
            int left = i ;
            int right = Math.min(i+k -1 , n-1);
/*left → start of group
right → end of group
Math.min protects the last group if size < k */
            while(left < right){
                int temp = arr[left];
                arr[left]  = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        for(int x : arr) System.out.print(x + " ");
    }
}

//Airport Mishap (Missing Bag ID using XOR)

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int xor = 0;
            for(int i = 0 ; i < n ;i++) xor ^= sc.nextInt();
            for(int i = 0 ; i < m ;i++) xor ^= sc.nextInt();

            System.out.println(xor);
        }
    }
}

// Upper Triangular Matrix Verification

class main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        boolean isUpper = true;

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                mat[i][j] = sc.nextInt();
                if(i > j && mat[i][j] != 0){
                    isUpper = false;
                }
            }
        }
        for(int[] row : mat){
            for(int val : row) System.out.print(val + " ");
            System.out.println();
        }
         if (isUpper)
            System.out.println("upper triangular matrix");
        else
            System.out.println("not an upper triangular matrix");
    }
}

// magic card game ( postfix evaluation)

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int T = sc.nextInt();

        while(T-- >0){
            String exp = sc.next();
            Stack<Integer> st = new Stack<>();
            for(char ch : exp.toCharArray()){
                if(Character.isDigit(ch)){
                    st.push(ch -'0');
                }else{
                    int b = st.pop();
                    int a = st.pop();
                    switch(ch){
                        case '+' : st.push(a+b) ; break;
                        case '-' : st.push(a-b); break;
                        case '*' : st.push(a*b) ; break;
                        case '/' : st.push(a/b) ; break;
                        case '^' : st.push((int)Math.pow(a,b)); break;
                    }
                }
            }
            System.out.println(st.pop());
        }
    }
} 

// Cafeteria Tray Dispenser (Stack Operations)
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0){
            int Q = sc.nextInt();
            Stack<Integer> st = new Stack<>();

            while(Q-- >0){
                int type = sc.nextInt();
                if(type == 1){
                    st.push(sc.nextInt());
                }
                else{
                    if(st.isEmpty()) System.out.print(-1);
                    else System.out.print(st.pop()+ " ");
                }
            }
            System.out.println();
        }
    }
}
// Action-First Math Processor (Prefix Evaluation)

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0){
            String exp = sc.next();
            Stack<Integer> st = new Stack<>();

            for(int i = exp.length() -1 ; i >= 0 ; i--){
                char ch = exp.charAt(i);
                if(Character.isDigit(ch)){
                    st.push(ch-'0');
                }else{
                    int a = st.pop();
                    int b = st.pop();
                    switch(ch){
                        case '+' : st.push(a + b) ; break;
                        case '-' : st.push(a-b) ; break;
                        case '*' : st.push(a * b) ; break;
                        case '/' : st.push(a / b) ; break;
                        case '^' : st.push((int)Math.pow(a,b));break;
                    }
                }
            }
            System.out.println(st.pop());
        }
    }
}

// Duplicate Flyer Detection

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<String , Integer> map = new HashMap<>();

        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            String id = sc.next();
            map.put(id,map.getOrDefault(id,0) +1);
        }
        for(String key : map.keySet()){
            if(map.get(key) > 1){
                System.out.println(key);
            }
        }
    }
}

// Brand Logo of Company

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0){
            String Husband = sc.next();
            String wife = sc.next();
            char result = 'h';
            for(int i = 0 ; i < Husband.length() ;i++){
                char ch = Husband.charAt(i);

                if(wife.indexOf(ch)!= -1){
                    result = ch;
                    break;
                }
            }
            System.out.println(result);
        }
    }
}

// Decode Enemy Message
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        while(T-->0){
            String line = sc.nextLine();
            Stack<Character> st = new Stack<>();

            for(int i = 0 ; i < line.length();i++){
                char ch = line.charAt(i);

                if(ch != ' '){
                    st.push(ch);
                }else{
                   while(!st.isEmpty()){
                    System.out.print(st.pop());
                   } 
                   System.out.print(" ");
                }
            }
            while(!st.isEmpty()){
                System.out.print(st.pop());
            }
            System.out.println();
        }
    }
}


//day 2 :
// K Challenges For Last Occurrence
class Main{
    static int lastOccurrence(int[] arr , int x){
        int left = 0 ; int right = arr.length -1; int ans = -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] == x){
                ans = mid ;
                left = mid +1;
            }
            else if(arr[mid] < x) right = mid -1; //descending array
            else left = mid + 1;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0 ; i < N ; i++){
            arr[i] = sc.nextInt();
        }
        int K = sc.nextInt();
        long sum = 0;
        for(int i = 0 ; i < K ;i++){
            int x = sc.nextInt();
            sum += lastOccurrence(arr,x);
        }
        System.out.println(sum);
    }
}

// Secure Key Exchange

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0){
            int N = sc.nextInt();
            int K = sc.nextInt();

            HashSet<Integer> set = new HashSet<>();
            int[] arr = new int[N];
            for(int i = 0 ; i < N ; i++){
                arr[i] = sc.nextInt();
                set.add(arr[i]);
            }
            int cnt = 0;
            for(int x : arr){
                if(set.contains(x+K)) cnt++;
            }
            System.out.println(cnt);
        }
    }
}

// DataStream Log Audit (Frequency of K)
// count the freq in sorted array:

class Main{
    private static int lastOccurrence(int[] arr , int target){
        int low = 0; 
        int high = arr.length -1;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low )/2;
            
            if(arr[mid] == target){
                ans = mid ;
                low = mid + 1;
            }else if (arr[mid] > target) high = mid -1;
            else low = mid + 1;
        }
        return ans;
    }
    private static int firstOccurence(int[] arr , int target){
        int low = 0; int high = arr.length -1;
        int ans = -1;
        while(low <= high){
            int mid = low + ( high - low ) / 2;

            if(arr[mid] == target){
                ans = mid ;
                high = mid -1;
            }
            else if (arr[mid] > target) high = mid -1;
            else low = mid +1;
        }
        return ans;
    }

    private static int count(int[] arr , int target){
        int first = firstOccurence(arr , target);
        int last = lastOccurrence(arr,target);
        if(first == -1) return 0;
        else return last - first +1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){
            int N = sc.nextInt();
            int K = sc.nextInt();

            int[] arr = new int[N];

            for(int i = 0 ; i < N ; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(count(arr,K));
        }
    }
}


// total search time:

class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int T =sc.nextInt();

        while(T-->0){
            int N = sc.nextInt();
            HashMap<Integer , Integer> map = new HashMap<>();
            for(int i = 0 ; i < N ; i++){
                map.put(sc.nextInt() , i);
            }
            int K = sc.nextInt();
            long time = 0;

            for(int i = 0 ; i < K ;i++){
                int x = sc.nextInt();
                time+= map.getOrDefault(x,N);
            }
            System.out.println(time);
        }
    }
}

// The Sensor Data Peak

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i = 0 ; i < 5 ; i++){
            arr[i] = sc.nextInt();
        }
        int maxi = arr[0];
        for(int i = 0 ; i < 5 ;i++){
            if(arr[i] > maxi){
                maxi = arr[i];
            }
        }
        System.out.println(maxi);
    }
}

//The Voting Consensus Audit:
class Main{
    private static int  getMajorityElement(int arr[]){
        int candidate = 0 ;
        int cnt = 0;
        for(int x : arr) {
            if(cnt ==0) candidate = x;

            if ( x == candidate) cnt++;
            else cnt--;

        }
       cnt = 0 ;
       for(int x :arr) if (x== candidate) cnt++;
       return (cnt > arr.length/2) ? candidate : -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        for(int i = 0 ; i < N ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(getMajorityElement(arr));
    }
}

//search in rotated Sorted Array
class Main{
    private static int searchRotatedSortedArray(int arr[] , int x){
        int low = 0 ;
        int high = arr.length-1;
        while(low <= high){
            int mid = low + (high - low) /2;
            if(arr[mid] == x) return mid;

            if(arr[low] <= arr[mid]){
                if(arr[mid] > x && x >= arr[low]){
                    high = mid -1;
                }
                else low = mid +1;
            }else{
                if(arr[mid] < x && x <= arr[high]) low = mid + 1;
                else high = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int T = sc.nextInt();

        while(T-->0){
            int k = sc.nextInt();
            int N = sc.nextInt();

            int[] arr = new int[N];

            for(int i = 0 ; i < N ;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(searchRotatedSortedArray(arr,k));
        }
    }
}

// make array positive:






//day 3:
// energy required in insertion sort:
class Main{
    private static int EnergyRequired(int arr[]){
        int n = arr.length;
        int swaps = 0;
        for(int i = 1 ; i < n ; i++){
            int key =  arr[i] ;
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
                swaps++;
            }
            arr[j+1] = key;
        }
        return swaps * 4 ;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0){
            int N = sc.nextInt();
            int [] arr = new int[N];
            for(int i = 0 ; i< N ; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(EnergyRequired(arr));
        }
    }
}

// total search time:
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < N ; i++){
            map.put(sc.nextInt() , i);
        }
        int K = sc.nextInt();
        long time = 0;
        for(int i = 0 ; i < K ; i++){
            int x = sc.nextInt();
            time += map.getOrDefault(x , N);
        }
        System.out.println(time);
    }
}

//Find the Special Employee
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            String[] names = new String[N];

            for (int i = 0; i < N; i++) {
                names[i] = sc.next();
            }

            int pos = sc.nextInt();

            if (pos == -1 || pos >= N) {
                System.out.println("-1");
            } else {
                System.out.println(names[pos]);
            }
        }
        sc.close();
    }
}
