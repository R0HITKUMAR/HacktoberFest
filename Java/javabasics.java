//import java.util.*;

public class javabasics{
    public static void printnishantkumar()  {
        System.out.println("Hello NIshnt ");
        
}

    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
        
          
}
    public static void swap(int a, int b) {
        int temp = a;
        a= b;
        b= temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }
 
    public static int factorial(int n) {
        int f = 1;

        for(int i = 1; i <=n; i++ ){
            f = f * i;
            
        }
        return f;
    }

    // public static int bincoff(int n, int r) {
    //     int fact_n = factorial(n);
    //     int fact_r = factorial(r);
    //     int fact_nmr = factorial(n-r);

    //     int bincoff = fact_n/( fact_r * fact_nmr);
    //     return bincoff;
    // }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b,int c) {
        return a + b +c ;
    }

    // public static boolean isPrime(int n){
    //     boolean isPrime = true;
    //     for(int i = 2; i<=n-1; i++){
    //         if(n % i ==0){
    //             isPrime = false;
    //             break;
    //         }
    //     }
    //     return isPrime;
    // }

    public static boolean isPrime(int n) {
        if(n == 2){
            return true;
        }

        for( int i = 2; i<=Math.sqrt(n); i++){
        if(n % i== 0) {
            return false;
        }
    }
    return true;
    }

    public static void primesInRange(int n) {
        for( int i = 2; i<=n; i++) {
            if(isPrime(i)) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void bintoDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
         
        while(binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println("decimal of " + myNum + " = " + decNum);


    }
    
    public static void dectoBin(int n) {
        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while( n>0 ) {
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            n = n/2;

        }
        System.out.println("binary form to " + myNum +"=" + binNum);
    }

    public static void main(String args[]) {
        System.out.print(factorial(4));
        
    }
}
         