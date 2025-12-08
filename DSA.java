//swap the sub array in a array till k where k is 3
// import java.util.Arrays;
// public class SlidingWindow{
//     public static void swapSubArray(int[] arr , int k){
//         int n = arr.length;
//         for(int i = 0 ; i < n ; i+=k){
//             int left = i ;
//             int right = Math.min(i+k-1, n-1);
//             while(left < right && right < n){
//                 int temp = arr[left];
//                 arr[left] = arr[right];
//                 arr[right] = temp;
//                 left++;
//                 right--;
//             }
//         }
//     }
// }

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
