// import java.util.*;
// public class Java3{
//     public static long lcm_of_array_elements(int[] element_array){
//         long lcm_of_array_elements = 1;
//         int divisor = 2;

//         while(true) {
//             int counter = 0;
//             boolean divisible = false;

//             for( int i = 0; i < element_array.length; i++){
//                 if(element_array[i] == 0){
//                     return 0;
//                 }
//                 else if (element_array[i]<0){
//                     element_array[i] = element_array[i] * (-1);
//                 }
//                 if(element_array[i] == 1){
//                     counter++;
//                 }

//                 if(element_array[i] % divisor == 0){
//                     divisible = true;
//                     element_array[i] = element_array[i]/ divisor;
//                 }
//             }
//             if(divisible){
//                 lcm_of_array_elements = lcm_of_array_elements*divisor;
//             }
//             else{
//                 divisor++;
//             }
//             if(counter == element_array.length) {
//                 return lcm_of_array_elements;
//             }
//         }
//     }
//     public static void main(String args[]){
//         int[] element_array = {6,9,12};
//         System.out.println(lcm_of_array_elements(element_array));
//     }
// }

// import java.util.*;
// public class Java3{

//     public static int gcd(int a, int b){
//         int result= Math.min(a,b);
//         while(result>0){
//             if(a% result == 0 && b% result ==0){
//                 break;
//             }
//             result--;
//         }
//         return result;
//     }
//     public static void main(String args[]){
//      int a = 12, b= 15;
//     System.out.print("GCd of " + a + " and " + b + " is " + gcd(a,b));
//     }
// }    

//------------Addition of two no witout using + operator----------------------

//import java.util.*;

//public class Java3 {

//     public static int add(int a, int b) {

//         for (int i = 1; i <= b; i++)
//             a++;
//         return a;
//     }

//     public static void main(String[] args) {
//         int a = add(34, 56);
//         System.out.print(a);
//     }
// }

// import java.util.*;     
 
import java.util.*; 

class Java3 {
     
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        if((a%11==0) && (a%17==0)){
            System.out.println("Foo Bar");
        } else if(a%11==0){
            System.out.println("Foo");
        } else if(a%17==0){
            System.out.println("Bar");
        }else{
            System.out.println("not divisible plz try again");
        }
    }
}