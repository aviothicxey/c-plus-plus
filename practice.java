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
    public start int[][]SUM(int[][])
}