// RECURSION:
//factorial:
class FactorialRecursion{
    static int factorial(int n){
        if(n == 0 || n==1){
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args){
        int num = 5;
        System.out.println(factorial(num));
    }
}


//sum of digits :

class sumOfDigits{
    static int sod(int n){
        if(n == 0){
            return 0;
        }
        return (n%10) + sod(n/10);
    }
    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Sum = " + sumOfDigits(num));
    }
}


//power(base,exp):
class poww{
    static int pow(int b , int e){
        if(e == 0) return 1;
        return b *pow(b,e-1);
    }
    public static void main(String[] args){
        int base = 2;
        int exp = 4;
        System.out.println("power = "+ pow(base,exp));
    }
}


//form a new number:

class newn{
    static int newn(int n , int rev){
        if(n == 0) return rev;
        int digit = n % 10;
        rev = rev*10 + digit;
        return newn(n/10 , rev);
    }
    public static void main(String[] args){
        int n = 1234;
        System.out.println("New Number = " + newn(n, 0));
    }
}


//binary conversion:
//RETURN STRING:
class binary{
    static String binaryC(int n) {
        if(n==0)return "0";
        if(n==1)return "1";
        return binaryC(n/2) + n%2;
    }
    public static void main(String[] args){
        int n = 10;
        System.out.println(binaryC(n));
    }
}

//RETURN INT
static int toBinary(int n) {
    if (n == 0) return 0;
    return (n % 2) + 10 * toBinary(n / 2);
}


// prime factors:

class pf{
    static void pf(int n , int i ){
        if(n == 1) return;
        if(n % i==0){
        System.out.print(i +" ");
        pf(n/i,i);
        }
        else{
            pf(n , i+1);
        }
    }
    public static void main(String[] args) {
        int n = 36;
        System.out.print("Prime Factors: ");
        pf(n,2);
    }
}

// greatest common divisor using recursion:

class gcd{
    static int gcd(int a , int b){
        if(b == 0){
            return a; //base case : jab remainder(b) zero hoga tbhi divisor greatest hoga.
        }
        return gcd(b, a%b);
    }
    public static void main(String[] args){
        int a = 48; int b = 18;
        System.out.println(gcd(a,b));
    }
}


//Arrays:

//cut the sticks:

import java.util.*;

public class Solution {
    public static List<Integer> cutTheSticks(int[] arr) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(arr);

        int n = arr.length;

        for (int i = 0; i < n; ) {
            result.add(n - i);      // number of sticks left
            int min = arr[i];       // smallest non-zero stick

            // move i forward until arr[i] is bigger than min
            while (i < n && arr[i] == min) {
                i++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 4, 2, 2, 8};
        List<Integer> ans = cutTheSticks(arr);
        for (int x : ans) System.out.println(x);
    }
}


//kth largest number in an array:

//using build in function:
import java.util.*;

public class KthLargest {
    public static int findKthLargest(int[] arr, int k) {
        Arrays.sort(arr); // sort ascending
        return arr[arr.length - k]; // kth largest
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 12, 2, 11};
        int k = 3;

        System.out.println("Kth largest = " + findKthLargest(arr, k));
    }
}


//without build in functions:
public class KthLargest{
    static void manaulSort(int[] arr){
        int n = arr.length;

        for(int i = 0 ; i<n-1 ; i++){
            int minInex = i;
            for(int j = i+1; j<n ; j++){
                if(arr[j]<arr[minInex]){
                    minInex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minInex];
            arr[minInex] = temp;
        }
    }
    static int KthLargest(int[]arr,int k){
        manaulSort(arr);
        return arr[arr.length -k];
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 12, 2, 11};
        int k = 3;

        System.out.println(KthLargest(arr,k));
    }
}


//max freq in a sequence:

class maxfrequency{
    static int mfreq(int[] arr , int n){

        int maxfreq = 0;
        int maxelenement = 0;
        for(int i = 0 ; i < n ; i++){
            int cnt = 0;
            for(int j = 0 ; j < n ; j++){ 
            if(arr[i]==arr[j]) cnt++;
            }
            if(cnt > maxfreq){
                maxfreq = cnt;
                maxelenement = arr[i];
            }
        }
        
            return maxelenement;
    }
    public static void main(String[] args){
        int[] arr = {2,4,3,5,6,4,4,2,3,4,5,6,4,3,2,1,2,3,4,5,6};
        int n = arr.length;
        System.out.println(mfreq(arr,n));
    }
}

//merge two arrays:
class merged{
    static int[] merge(int[]a, int[]b){
        int n = a.length;
        int m= b.length;
        int[] merged = new int[n+m];
        for(int i = 0 ; i < n ; i++){
            merged[i] = a[i];
        }
        for(int i = 0 ; i < m ; i++){
            merged[i+n] = b[i];
        }
        return merged;
    }
    public static void main(String[] args){
        int[] a = {1,2,3,4};
        int[] b = {5,6,7,8};

        int[] result = merged(a,b);
        for(int x : result){
            System.out.print(x+" ");
        }
    }
}

//ist and last occurence of an integer in a sorted list with duplicates:

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums , target);
        int last = findLast(nums,target);
        return new int[]{first,last};
    }

    private int findFirst(int [] nums ,int target){
        int start = 0 ; int end = nums.length -1 ; int index = -1;
        while( start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target ){
                index = mid ;
                end = mid -1;
            }
            else if ( target > nums[mid]){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        return index;
    }
    private int findLast(int nums[] , int target){
        int  start = 0 ; int end = nums.length -1 ; int index = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                index = mid;
                start = mid +1;
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return index;
    }
}

//find count of a number in a sorted list with duplicates:

count = lastIndex - firstIndex;



// rotation count of a sorted array:




//search element in a rotated array:

public class SearchElement{
    public static int SearchElement(int[] arr,int target){
        int n  = arr.length;
        int start = 0;
        int end = n-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid]>=arr[start]){
                if(arr[mid]>target && arr[start] <=target){
                    end = mid -1;
                }
                else {
                    start = mid +1;
                }
            }else{
                if(arr[mid]<target && arr[end]>= target){
                    start = mid + 1;
                }
                else end = mid -1;
            }
        }
        return -1;
    }
}


//Sorting:

//find the number of swaps in bubble sort:

public class BubbleSort{
    public static int Swaps(int[]nums){
        int n = nums.length;
        int swaps = 0;
        for (int i = 0 ; i < n-1; i++){
            for(int j = 0 ; j < n-i-1 ; j++){
                if(arr[j] > arr[j+1]){
                int temp  = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swaps++;
                }
            }
        }
        return swaps;
    }
}

//find number of swaps in selection sort:

public class SelectionSort{
    public static int Swaps(int[]nums){
        int n = nums.length;
        int swaps = 0;
        for(int i = 0 ; i < n -1 ; i++){
            int minIndex = i;
            for(int j = 0 ; j < n ; j++){
                if(arr[j]>arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            swaps++;
        }
        return swaps;
    }
}

public class InsertionSort{
    public static int countSwaps(int[] arr){
        int swaps = 0 ;
        int n = arr.length;
        for(int i = 1; i < n ;i++){
            int key = arr[i];
            int j = i -1;
            while( j >=0 && arr[i] > key){
                arr[j+1] = arr[j];
                j--;
                swaps++;
            }
            arr[j+1] = key;
        }
        return swaps;
    }
}


// 2d array:

// matrix multication: 



public class MatrixMultiplication {
    // Function to multiply two matrices
    public static int[][] multiply(int[][] A, int[][] B) {
        int m = A.length;         // rows of A
        int n = A[0].length;      // columns of A
        int p = B[0].length;      // columns of B
        int[][] result = new int[m][p];
        // Matrix Multiplication Logic
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }
    // Function to print matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input matrix sizes
        System.out.print("Enter rows & cols of Matrix A: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.print("Enter rows & cols of Matrix B: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        // Check valid multiplication condition
        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible!");
            return;
        }
        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];
        // Input A
        System.out.println("Enter Matrix A:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        // Input B
        System.out.println("Enter Matrix B:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        // Multiply
        int[][] result = multiply(A, B);
        // Output
        System.out.println("Resultant Matrix:");
        printMatrix(result);
        sc.close();
    }
}

//row or column sum:
public class MatrixSum{
    public static int[] RowSum(int[][]matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        int[] result = new int[r];
        for(int i = 0 ; i < r ; i++){
            int sum = 0;
            for(int j = 0 ; j < c ; j++){
                sum += matrix[i][j];
            }
            result[i] = sum;
        }
        return result;
    }

    public static int[] ColSum(int[][]matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        int[]result = new int[c];

        for(int i = 0 ; i < c;i++){
            int sum = 0;
            for(int j = 0 ; j < r ; j++){
                sum += matrix[j][i];
            }
            result[i] = sum;
        }
        return result;
    }
}

//spirally travesing a matrix :

public class Spiralmatrix{
    public List<Integer> spiralOrder(int[][]matrix){
        int bottom = matrix.length -1;
        int top  = 0 ;
        int left = 0;
        int right = matrix[0].length -1;
        List<Integer> result = new ArrayList<>();
        while(left <= right && top <= bottom){
            for(int i = left ; i <= right ; i++){
                result.add(matrix[top][i]);
            }top++;
            for(int i = top ; i <= bottom ; i++){
                result.add(matrix[i][right]);
            }right--;
            if(left <= right){
                for(int i = right ; i >= left ; i--){
                    result.add(matrix[bottom][i]);
                }bottom--;
            }
            if(top <= bottom){
                for(int i = bottom ; i >= top ; i--){
                    result.add(matrix[i][left]);
                }left++;
            }
        }
        return result;
    }
}

//rotate a matrix by 90 degrees :
//leetcode 48: rotate image .

public class Solution{
    public void rotate(int[][]matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][]result = new int[cols][rows];

        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ;j++ ){
                result[j][i] = matrix[i][j];
            }
        }
        for(int i = 0 ; i < rows; i++){
            int left = 0 ; int right = rows-1;
            while(left < right){
                int temp = result[i][ left];
                result[i][left] = result[i][right];
                result[i][right] = temp;
                left++;
                right--;
            }
        }
        for(int i = 0 ; i < rows ; i++){
            for(int  j = 0 ; j < cols ; j++){
                matrix[i][j] = result[i][j];
            }
        }
    }
}


// reverse the order of words in a string:
public class reverseWords{
    public static String reverseWords(String s){
        String words[] = s.trim().split("\\s+");
        int start = 0;
        int end = words.length -1;
        while(start < end){
            String temp = words[start];
            words[start] = words[end];
            words[end] = temp;
            start++;
            end--;
        }
        return String.join(" ",words);
    }
    public static void main(String[] args) {
        String s = "hello my love";
        System.out.println(reverseWords(s));
}
}

//using stack:
public class reverseWords{
    public static String reverseWords(String s){
        Stack<String> st = new Stack<>();
        String[] words = s.trim().split("\\s+");
        for(String w : words){
            st.push(w);
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
            if(!st.isEmpty()) sb.append(" ");
        }
        return sb.toString();

    }
}

// String is subsequence or not

public class Subsequence{
    public static boolean subSequence(String s , String t){ // here s is subsequence and t is main string
        int i = 0 ; int j = 0; // i move in string s and j move in string t
        while(i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++; // move in s
            }j++; // always move t
        }
        return i == s.length();
    }
}

// COUNT WORDS:

public class WordCount{
    public static int countWords(String s){
        String[] words = s.trim().split("\\s+");
        return words.length;
    }
}// this will not work for "" this case .
//use this instead: 

class Solution {
    public int countSegments(String s) {
        s = s.trim();
        if(s.isEmpty()) return 0;
        String[] words = s.split("\\s+");
        return words.length;
    }
}

//without split:
public class Solution{
    public int countWords(String s){
        int count = 0 ;
        boolean inWord = false;
        for(int i = 0 ; i < s.length();i++){
            if(s.charAt(i) != ' '){
                if(!inWord) {
                    count++;
                    inWord = true;
                }
            }
            else{
                inWord = false;
            }
        }
        return count;
    }
}


// spell the number :


import java.util.*;
public class numberToWords{
    private static final String[] units= {"","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] teens= {"Ten","Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] tens= {"","", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static String convertBelowThousand(int num){
        String result = "";
        if(num>= 100){
            result += units[num/100] + " Hundred ";
            num = num % 100;
        }
        if(num>=10 && num<=19){
            result += teens[num - 10]+" ";
        }else if(num>= 20){
            result += tens[num/10]+" ";
            if(num %10 != 0){
                result+= units[num%10] + " ";
            }
        }else if(num>0){
            result += units[num]+ " ";
        }
        return result;
    }
    public static String numberToWords(int num){
        if(num == 0) return "Zero";
        String result = "";
        if(num >= 100000){
            result+= convertBelowThousand(num/100000)+"Lakh ";
            num = num % 100000;
        }
        if(num>=1000){
            result += convertBelowThousand(num/1000) + "Thousand ";
            num = num % 1000;
        }
        if(num> 0){
            result+= convertBelowThousand(num);
        }
        return result.trim();
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Number in words: " + numberToWords(number));
    }
}


//check if strings are rotation or not :

class Result{
    static int isRotation(String s1,String s2){
        if(s1.length() != s2.length()) return 0;
        s1 = s1 + s1;
        if(s1.contains(s2)) return 1;
        return 0;
    }
    
}

//Linked List:

//print the list:
static void forwardPrint(Node head) {
Node temp = head ;
    while(temp != null){
        System.out.print(temp.data + "-");
        temp = temp.next;
    }
}

static void backwardPrint(Node head) {
if(head == null)return ;
    backwardPrint(head.next);
    System.out.print(head.data + "-");
}

//copy ist list in 2nd list:
static node copyList(Node head){
    if(head == null) return null;
    node newhead = new node(head.data);
    node temp1 = head.next;
    node temp2 = newhead;
    while(temp1 != null){
        node temp = new node(temp1.data);
        temp2.next = temp;
        temp2 = temp2.next;
        temp1 = temp1.next;
    }
    return newhead;
}

//check if list is palindrome:

class Result{
    static int checkPalindrome(Node Head){
        if(head == null || head.next == null)return 1;
        Node slow = Head;
        Node fast = Head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node prev = null;
        Node curr = slow;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev ;
            prev = curr;
            curr = next;
        }
        Node p1 = head;
        Node p2 = prev;
        while(p2 != null){
            if(p1.data != p2.data) return 0;
            p1 = p1.next;
            p2 = p2.next;
        }
        return 1;
    }
}

//move the smallest to head and largest to tail:
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
static Node shiftSmallLarge(Node head) {
    // Edge cases: 0 or 1 node
    if (head == null || head.next == null) {
        return head;
    }

    Node minNode = head;
    Node prevMin = null;

    Node curr = head;
    Node prev = null;

    while (curr != null) {
        if (curr.data < minNode.data) {
            minNode = curr;
            prevMin = prev;
        }
        prev = curr;
        curr = curr.next;
    }

    if (minNode != head) {
        // Remove minNode from its current position
        if (prevMin != null) {
            prevMin.next = minNode.next;
        }
        // Insert at head
        minNode.next = head;
        head = minNode;
    }

    Node maxNode = head;
    Node prevMax = null;
    curr = head;
    prev = null;
    Node tail = null;

    while (curr != null) {
        if (curr.data > maxNode.data) {
            maxNode = curr;
            prevMax = prev;
        }
        prev = curr;
        tail = curr;      // last node
        curr = curr.next;
    }

    if (maxNode != tail) {
        // Remove maxNode from its position
        if (prevMax != null) {
            prevMax.next = maxNode.next;
        } else {
            // maxNode was at head
            head = maxNode.next;
        }

        // Attach at tail
        tail.next = maxNode;
        maxNode.next = null;
    }

    return head;
}

//find the loop in ll:

//-- leetcode 141:
public static boolean detectLoop(Node head){
    Node slow = head;
    Node fast = head;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;

        if(slow == fast ) return true;
    }
    return false;

}

//--leetcode 142:
public Node detectCycle(Node head){
    if(head == null ||  head.next ==null) return null;
    Node slow = head;
    Node fast = head;
    while(fast != null && fast.next != null){
        slow = slow.next ;
        fast = fast.next.next;

        if(slow == fast){
            slow = head;
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
    }
    return null;
}

// reverse a linked list:

//--leetcode 206 sol1:
public Node reverseList(Node head){
    Stack<Integer> st = new Stack<>();
    Node temp = head;
    while(temp!= null){
        st.push(temp.val);
        temp = temp.next;
    }
    temp = head;
    while(temp != null){
        temp.val = st.peek();
        st.pop();
        temp =temp.next;
    }
    return head;
}
//leetcode 206 sol2 :
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev= null;
        ListNode curr = head;
        ListNode next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }  
        return prev;
    }
}

//leetcode 206 sol3 :
class Solution {
    public ListNode reverseList(ListNode head) {
    if(head == null || head.next == null) return head;

    ListNode newHead = reverseList(head.next);
    head.next.next = head;
    head.next = null;

    return newHead;
}
}

//leetcode 92:
public ListNode reverseBetween(ListNode head , int left , int right){
    if(head == null || left == right) return head;

    ListNode dummy = new ListNode(0);
    dummy.next = head;
     ListNode prev = dummy;

    // Step 1: reach node before left
    for (int i = 1; i < left; i++) {
        prev = prev.next;
    }

    // Start reversing
    ListNode curr = prev.next;
    ListNode next = null;
    ListNode prevNode = null;

    for (int i = 0; i <= right - left; i++) {
        next = curr.next;
        curr.next = prevNode;
        prevNode = curr;
        curr = next;
    }

    // Fix connections
    prev.next.next = curr;   // tail of reversed connects to remaining list
    prev.next = prevNode;    // connect previous part to reversed head

    return dummy.next;

}

// Add two Numbers:
public Node addTwoNumbers(Node l1 , Node l2){
    Node temp = new Node(0);
    Node curr = temp;

    int carry = 0;

    while(l1 != null || l2 != null || carry != 0){
        int sum = carry;

        if(l1 != null){
            sum+= l1.val;
            l1 = l1.next;
        }
        if(l2!=null){
            sum += l2.val;
            l2 = l2.next;
        }

        carry = sum / 10;
        curr.next = new Node(sum% 10);
        curr = curr.next;
    }
    return temp.next;
}


//delete a node in linked list given access to only that node:
/* 
problem:
You are given a pointer to the node that must be deleted.
You cannot access previous node, so you cannot unlink normally.
solution:
(You are not given head of the list, only the node to be deleted)

trick:
Copy the value of the next node into the current node,
Then skip (delete) the next node.
Because we cannot delete "this node" directly,
so we convert it to the next node.
*/
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;  
    }
}

// swap a dll:


// rotate dll by k nodes:
public class Solution{
    static Node rotate (Node head , int k){
        if(head == null || k == 0 ) return head;

        int n = 0 ; 
        Node temp = head ;
        while(temp != null){
            n++;
            temp = temp.next;
        }
        k = k % n;
        if(k == 0) return head;
        temp = head;
        for(int i = 1 ; i < n-k ; i++){
            temp = temp.next;
        }
        Node newHead = temp.next;
        newHead.prev = null;
        temp.next = null;

        Node tail = newHead;
        while(tail.next != null){
            tail = tail.next;
        }
        tail.next = head;
        head.prev = tail;

        return newHead;
    }
    public void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

// rearrange the even odd nodes of dll
// dll:
static Node rearrangeEvenOdd(Node head){
    if(head == null || head.next == null) return head;

    Node oddHead = null , oddTail = null, evenHead = null , evenTail = null;

    Node curr = head;
    int pos = 1;

    while(curr != null){
        Node next = curr.next; // save next pointer
        //break links
        curr.next = null;
        curr.prev = null;

        if(pos % 2 == 1){
            if(oddHead == null){
                oddHead = oddTail = curr;
            }else{
                oddTail.next = curr;
                curr.prev = oddTail;
                oddTail = curr;
            }
        }else{
            if(evenHead == null){
                evenHead = evenTail = curr;
            }else{
                evenTail.next = curr;
                curr.prev = evenTail;
                evenTail = curr;
            }
        }
        curr = next;
        pos++;
    }
    if(oddHead != null){
        oddTail.next = evenHead;
        if(evenHead!= null){
        evenHead.prev = oddTail; 
        }
    }

    return oddHead;
}

// check if given ll is circular or not :
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class Solution {

    static boolean isCircular(Node head) {
        if (head == null) return false; 

        Node slow = head;       // tortoise
        Node fast = head;       // hare

        while (fast != null && fast.next != null) {
            slow = slow.next;          // move 1 step
            fast = fast.next.next;     // move 2 steps

            if (slow == fast) {        // collision
                return true;           
            }
        }

        // fast reached null → not circular
        return false;
    }

    public static void main(String[] args) {
        // Testing
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        head.next = second;
        second.next = third;
        third.next = head;  // Making it circular

        System.out.println(isCircular(head));  // Output: true
    }
}
