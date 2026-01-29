import java.util.*;
public class Recursion{
// print name n times:
    static void printName(int n){
        if(n == 0) return;
        System.out.println("Aparna");
        printName(n-1);
    }
    static void pn(int i,int n){
        if(i > n) return;
        System.out.println("Ayush");
        pn(i+1 , n);
    }
// print numbers 1 to n:
    static void printNum(int i , int n){
        if( i > n ) return;
        System.out.println(i);
        printNum(i+1, n);
    }
// with backtracking:
    static void printn(int i , int n){
        if( i < 1) return;
        printn(i-1, n);
        System.out.println(i);
    }
    static void bpn(int i , int n){
        if(i > n) return;
        bpn(i+1 , n);
        System.out.println(i);
    }
    // sum of n numbers:(Paramtrized):
    static void sumOfN(int i , int sum){
        if(i < 1){
            System.out.println(sum);
            return;
        }
        sumOfN(i-1, sum+i);
    }
    // sum of n numbers(functional):
    static int fun(int n){
    if(n == 0) return 0;
    return n+fun(n-1);
    }
    // factorial of ist n numbers:
    static int fact(int n){
        if( n == 0) return 1;
        if( n == 1) return 1;
        return n * fact(n-1);
    }
    //reverse an array :
    static void reverseArray(int i ,int n , int[] arr){
        if( i >= n /2){
            return;
        }
        swap(i, n-i-1 , arr);
        reverseArray(i+1, n, arr);
    }
    static void swap(int i , int j , int[] arr){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
         printName(n); // Aparna n times
         pn(1,n); // ayush n times
         printNum(1, n); //1 to n normal recursion
         printn(n, n); //1 to n(backtracing)
         bpn(1, n);//n to 1 (backtracking)
         sumOfN(n,0);
         int res = fun(n);
         System.out.println(res);
         int factorial = fact(n);
         System.out.println(factorial);
         int[] arr = new int[n];
         for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
         }
         reverseArray(0, n, arr);
         sc.close();
    }
    
}