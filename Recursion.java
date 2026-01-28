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

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
         printName(n); 
         pn(1,n);
    }
}