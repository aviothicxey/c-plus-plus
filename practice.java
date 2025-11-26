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