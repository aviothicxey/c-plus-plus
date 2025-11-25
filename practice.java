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