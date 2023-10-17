// import java.util.*;

// public class java2 {
//     public static void main(String args[]) {
        // int marks[]= new int[50];
        // System.out.print("length of an array " + marks.length );

        // Scanner sc = new Scanner(System.in);
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();  
        // marks[2] = sc.nextInt();  

        // System.out.println("physisc " + marks[0]);
        // System.out.println("chem " + marks[1]);
        // System.out.println("maths " + marks[2]);   

        // int percentage = (marks[0] + marks[1]+ marks[2]) / 3;
        // System.out.println( "percentage = " + percentage + "%");
        
        
// import java.util.*;

// public class java2 {
//     public static void update(int marks[])  {
//         // for(int i = 0; i<marks.length; i++){
//         //     marks[i] = marks[i] + 1;
//         //       System.out.println(marks[i] + "");
//         // }
//     }
//     public static void main(String args[]) {
//         int marks[] = {67,78,98};
//         update(marks);
//         for(int i = 0; i<marks.length; i++){
//               System.out.println(marks[i] + "");
//         }
//         System.out.println();
//     }
// }


//Linear Search

// import java.util.*;    linear search
// public class java2 {
//     public static int linersearch(int numbers[], int key){
//         for(int i = 0; i <numbers.length; i++ ){
//             if(numbers[i] == key) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String args[]) {
//         int numbers[] = {2,4,6,8,10,12,14,16};
//         int key = 8;
//         int index = linersearch(numbers, key);
//         if(index == -1){
//             System.out.println("Not Found");
//         }else {
//             System.out.println("key is at index : " + index);
//         }

//     }
// }


// import java.util.*;   get largest
// public class java2 {
//     public static int getlargest(int number[]) {
//         int largest = Integer.MIN_VALUE;
//         int smallest = Integer.MAX_VALUE;

//         for(int i = 0; i<number.length; i++) {
//             if(largest < number[i]) {
//                 largest = number[i];
//             }
//             if(smallest > number[i]) {
//                 smallest = number[i];
//             }

//         }
//         System.out.println("smallest number is: " + smallest);
//         return largest;
//     } 
//     public static void main(String args[]) {
//         int number[] = { 1,2,3,5,6,4};
//         System.out.println("largest no is: " + getlargest(number));
//     }
// }

//binary search..

// import java.util.*;    // binary search
// public class java2 {
//     public static int binarySearch(int number[], int key) {
//         int start = 0, end = number.length-1;

//         while(start <= end){
//             int mid = (start + end) / 2;

//             if(number[mid] == key) {
//                 return mid;
//             }
//             if(number[mid] < key) {
//                start = mid+1;
//             } else {
//                 end = end-1;
//             }
//         }
//         return -1;
//     }

//     public static void main(String args[]) {
//         int number[] = {2,4,6,8,10,12,14,16};
//         int key =4;
//         System.out.println("index for key is: " + binarySearch(number, key));
//     }
// }


//Reverse number

// import java.util.*;
// public class java2 {
//     public static void reverse(int numbers[]) {
//         int first = 0, last = numbers.length-1;

//         while(first < last) {
//             int temp = numbers[last];
//             numbers[last] = numbers[first];
//             numbers[first] = temp;

//             first++;
//             last--;
//         }
//     }

//     public static void main(String Args[]){
//         int numbers[] = {2,4,6,8,10};

//         reverse(numbers);
//         for(int i = 0; i < numbers.length; i++){
//             System.out.print(numbers[i]+ " ");
//         }
//         System.out.println();
//     }
// }


//Bubble sort

// import java.util.Arrays;
// public class java2 {
//     public static void bubbleSort(int arr[]) {
//         for( int turn = 0; turn<arr.length-1; turn++){
//             for(int j =0; j<arr.length-1-turn; j++) {
//                 if(arr[j] > arr[j+1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//     }

//     public static void printArr(int arr[]) {
//         for(int i = 0; i <arr.length; i++){
//             System.out.print(arr[i]+ " ");
//         }
//         System.out.println();
//     }


//     //Selection Sort

//     public static void selectionSort(int arr[]) {
//         for ( int i = 0; i<arr.length-1; i++){
//             int minPos = i;
//             for( int j = i+1; j<arr.length; j++){
//                 if(arr[minPos] > arr[j]){
//                     minPos =j;
//                 }
                
//             }
//             int temp = arr[minPos];
//             arr[minPos] = arr[i];
//             arr[i] = temp;
//         }
        
//     }

//     //Insertion Sort

//     public static void insertionSort(int arr[]){
// //         for(int i =1; i<arr.length; i++) {
//             int curr = arr[i];
//             int prev = i-1;
//             //finding out the correct pso to insert
//             while(prev >=0 && arr[prev] > curr) {
//                 arr[prev+1] = arr[prev];
//                 prev--;
//             }
//             arr[prev+1] = curr;
//         }
//     }



//     public static void main(String args[]) {
//         int arr[] ={5,4,1,3,2};
//         insertionSort(arr);
//         //Arrays.sort(arr);
//         printArr(arr);

//     }
// }

////-------------------------------------Matrix---------------------------------------//

//----2D Arrays-------//

//find and create array-----
// import java.util.*;
// public class matrix {
//     public static boolean search(int matrix[][], int key) {
//          for(int i = 0; i<matrix.length; i++ ) {
//             for(int j = 0; j<matrix[0].length; j++) {
//                 if(matrix[i][j] == key) {
//                     System.out.println("found at cell ("+i +","+j+")");
//                     return true;
//                 }
//             } 
//          }
//             System.out.println("key not found");
//             return false;
//          }
    
//     public static void main(String args[]) {
//         int matrix[][] = new int[3][3];
//         int n=3, m=3;

//         Scanner sc = new Scanner(System.in);
//         for(int i = 0; i<n; i++) {
//             for(int j = 0; j<m; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//         for(int i = 0; i<n; i++ ){
//             for(int j = 0; j<n; j ++){
//                 System.out.print(matrix[i][j] +" ");
//             }
//              System.out.println();    
//         }
//         search (matrix, 9);
//     }
// }



//----Spirla matrix-----
public class matrix {
    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol){
            //top
            for(int j = startCol; j<= endCol; j++){
                System.out.print(matrix[startRow][j] + " ");
            }
            //right
            for(int i = startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //bottom
            for(int j= endCol-1; j>=startCol; j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+ " ");
            }
            //left
            for(int i=endRow-1; i>=startRow+1; i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+ " ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;

        }
        System.out.println();
    }


    public static void main(String args[]) {
        int matrix [][] = {{1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12},
                            {13, 14, 15, 16}};
    printSpiral(matrix);
    }
}



//----------- Diagonal Sum-------
// import java.util.*;
// public class matrix {
//     public static int diagonalSum(int matrix[][] ) {
//         int sum =  0;

//         // for(int i = 0; i<matrix.length; i++){
//         //     for( int j = 0; j<matrix[0].length; j++){
//         //         if(i==j){
//         //             sum += matrix[i][j];
//         //         }                                      (O(n^2))
//         //         if(i+j==matrix.length-1){
//         //             sum+= matrix[i][j];
//         //         }
//         //     }
//         // }

//         for(int i = 0; i<matrix.length; i++) {
//             sum +=matrix[i][i];
//             if(i != matrix.length-i-1)
//             sum +=matrix[i][matrix.length-i-1];
        
//       }
//         return sum;
//     }



// public static void main(String args[]) {
//         int matrix [][] = {{1, 2, 3, 4},
//                             {5, 6, 7, 8},
//                             {9, 10, 11, 12},
//                             {13, 14, 15, 16}};
//      System.out.println(diagonalSum(matrix));
//     }
// }


//-----Search in Sorted Array-------

//-------Stair Case Approch


// import java.util.*;
// public class matrix {
//     public static boolean staircaseSearch(int matrix[][], int key) {
//         int row = 0, col = matrix[0].length-1;

//         while(row < matrix.length && col >=0){
//             if(matrix[row][col] == key){
//                 System.out.println("found key at (" + row + "," + col +")");
//                 return true;
//             }
//             else if(key < matrix[row][col]) {
//                 col--;
//             }else{
//                 row++;
//             }
//         }
//         System.out.println("key not found");
//         return false;
//     }

// public static void main(String args[]) {
//         int matrix [][] = {{10, 20, 30, 40},
//                             {15, 25, 35, 45},
//                             {27, 29, 37, 48},
//                             {32, 33, 39, 50}};
//         int key = 33;
//     staircaseSearch(matrix, key);
//     }
// }


 



