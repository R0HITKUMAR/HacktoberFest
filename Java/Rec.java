//import javax.management.openmbean.OpenDataException;

// Using Recursion
public class Rec {
    public static void printDec(int n) {
        if (n == 1) { // Base Case
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void printInc(int n) {
        if (n == 1) { // Base Case
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1= fact(n - 1);
        int fn = n * fact(n - 1);
        return fn;
    }

    // Sum of Natural numbers-----
    public static int calsum(int n) {
        if (n == 1) {
            return 1;
        }
        int Summ1 = calsum(n - 1);
        int Sn = n + Summ1;
        return Sn;
    }

    // ------fibonacci series
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    // Array is sorted of not
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    // first occurencenin array
    public static int firstOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, key, i + 1);
    }

    // last Occurencen array
    public static int lastOccurence(int arr[], int key, int i) {
        // look forword then look your self
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;

    }

    // power of n
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int xnm1 = power(x, n - 1);
        int xn = x * xnm1;
        return xn;
        // return x * power(x, n-1);
    }

    // power of n in optimized way
    public static int optPower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optPower(a, n / 2);
        int halfPowerSq = halfPower * halfPower;
        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;

    }

    // ------------Tiling Problem-----------
    public static int tilingProblem(int n) {
        // 2 * n (florr size)
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // kaam
        // vertical choice

        int fnm1 = tilingProblem(n - 1);
        // horizontal choice
        int fnm2 = tilingProblem(n - 2);
        int totalways = fnm1 + fnm2;
        return totalways;

    }

    // public static void main(String Args[]) {
    //     // int arr[] = { 1, 2, 3, 4, 2, 6, 7, 2 ,6};
    //     // System.out.println(power(2, 2));

    //     // int a = 2;
    //     // int n = 5;
    //     // System.out.println(optPower(a, n));

    //     System.out.println(tilingProblem(8));
    // }

    // -------------Remove Duplictae in a String--------------
    // public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
    //     if (idx == str.length()) {
    //         return;
    //     }
    //     char currChar = str.charAt(idx);
    //     if (map[currChar - 'a'] == true) {
    //         removeDuplicates(str, idx + 1, newStr, map);
    //     } else {
    //         map[currChar - 'a'] = true;
    //         removeDuplicates(str, idx + 1, newStr.append(currChar), map);
    //     }
    // }

    // public static void main(String args[]) {
    //     String str = "appnacollege";
    //     removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    // }

//----- friends Pairing Problem----------- Goldmen Seche
    public static int friendsPairing(int n) {
        if( n == 0 || n == 1){
            return 1;
        }
        int fnm1 = friendsPairing(n-1);
        int fnm2 = friendsPairing(n-2);
        int pairways  = (n-1) * fnm2;
        int totalways  = fnm1 + pairways;
        return totalways;

    }

// ----------- Binary String Problem------- Paytm
    public static void printBinString(int n, int lastPlace, java.lang.String string) {
       if( n == 0){
        System.out.println(string);
        return ;
       }
            printBinString(n-1, 0, string+"0");
            if( lastPlace == 0) {
                printBinString(n-1, 1, string+"1");
            }

        }
    
    public static void main(String args[]) {
        printBinString(3, 0, "");

    }
}  

