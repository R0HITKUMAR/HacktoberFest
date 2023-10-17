// // public class OOPS1{
// //     public static void main (String args[]) {
// //         Pen p1 = new Pen();
// //         p1.setColor("Blue");
// //         System.out.println(p1.color);
// //         p1.setTip(3);
// //         System.out.println(p1.tip);

// //     }
// // }

// // class BankAccount{
// //     public String username;
// //     private String password;
// // }

// // class Pen{
// //     String color;
// //     int tip;

// //     void setColor(String newColor) {
// //         color =newColor;

// //     }
// //     void setTip (int newTip){
// //         tip = newTip;
// //     }
// // }

// // class Student{
// //     String name;
// //     int age;
// //     float percentage;

// //     void calcPercentage(int phy, int chem, int math){
// //         percentage = (phy + chem + math) / 3;
// //     }
// // }

// //Constructor

// // public class OOPS1{
// //     public static void main(String args[]) {
// //          Dog dobby = new Dog();
// //          dobby.eat();
// //          dobby.legs = 4;
// //          dobby.color = "Black";
// //          System.out.println(dobby.legs);
// //          System.out.println(dobby.color);
// //     }
// // }

// // class Animal{
// //     String color;

// //     void eat(){
// //         System.out.println("eats");
// //     }

// //     void breathe(){
// //         System.out.println("braethes");
// //     }

// // }

// // class Mammals extends Animal{
// //     int legs;
// // }
// // class Dog extends Mammals{
// //     String breed;
// // }

// // class Fish extends Animal{
// //     int fins;
// //     void swim(){
// //         System.out.println("swim");
// //     }
// // }

// // public class OOPS1{
// //     public static void main( String args[]){
// //          Deer d = new Deer();
// //          d.eat();
// //     }
// // }

// // class Animal{
// //     void eat(){
// //         System.out.println("eats anything");
// //     }
// // }

// // class Deer extends Animal{
// //     void eat(){
// //         System.out.println("eats grass");
// //     }
// // }
// // class Calculator{
// //     int sum(int a, int b){
// //         return a + b;
// //     }
// //     float sum(float a, float b){
// //         return a + b;
// //     }
// //     int sum( int a, int b, int c){
// //         return a + b + c;
// //     }
// // }

// public class OOPS1 {
//     public static void main(String args[]) {
//         Horse h = new Horse();
//         h.eat();
//         h.walk();

//         Chicken c = new Chicken();
//         c.eat();
//         c.walk();

//     }
// }

// abstract class Animal {
//     void eat() {
//         System.out.println("animals eats");
//     }

//     abstract void walk();
// }

// class Horse extends Animal {
//     void walk() {
//         System.out.println("walks on 4 leg");
//     }
// }

// class Chicken extends Animal {
//     void walk() {
//         System.out.println("walk on 2 legs");
//     }
// }

// JAVA code to find
// duplicates in O(n) time

// class Leet442 {

// 	public static void main(String args[])
// 	{
// 		int num[] = { 0, 4, 3, 2, 7, 8, 2, 3, 1 };

// 		for (int i = 0; i < num.length; i++) {
// 			num[num[i] % num.length] += num.length;
// 		}
// 		System.out.println("The repeating elements are : ");
// 		for (int i = 0; i < num.length; i++) {
// 			if (num[i] >= num.length * 2) {
// 				System.out.println(i + " ");
// 			}
// 		}
// 	}
// }

//Interfaces

// public class OOPS1{
// 	public static void main(String args[]) {
// 		Beer b = new Beer ();
// 		b.eat();
// 	}
// }

// interface Carnivore{
// 	void eat ();
// }

// interface Herbivore {
// 	void eat();
// }

// class Beer implements Herbivore, Carnivore {
// 	public void eat(){
// 		System.out.println("eat both meat and grass");
// 	}
// }

// interface ChessPlayer {
// 	void moves();

// }

// class Queen implements ChessPlayer {
// 	public void moves(){
// 		System.out.println("up,down, left,right,diagonal ( in all direction)");
// 	}
// }

// class Rook implements ChessPlayer {
// 	public void moves(){
// 		System.out.println("up,down, left,right,diagonal ( in all direction)");
// 	}
// }

// class King implements ChessPlayer {
// 	public void moves(){
// 		System.out.println("up,down, left,right, diagonal(in one direction");
// 	}
// }

// Merge Sort
public class OOPS1 {
	public static void printArr(int arr[]) {
		for ( int i = 0; i <arr.length; i++){
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}

	public static void mergeSort(int arr[], int si, int ei){
		if(si>=ei){
			return;
		}
		int mid = (si + ei)/2;
		mergeSort(arr, si, mid);// left part
		mergeSort(arr, mid + 1, ei);//Right part

		merge(arr, si, mid, ei);
	}

	public static void merge( int arr[], int si, int mid, int ei){
		int temp[] = new int[ei-si+1];
		int i = si;
		int j = mid +1;
		int k = 0;

		while ( i <= mid && j <= ei){
			if(arr[i]< arr[j]){
				temp[k]=arr[i];
				i++;
			}else{
				temp[k]=arr[j];
				j++;
			}
			k++;

		}
		while(i<= mid){
			temp[k++]= arr[i++];
		}
		while(j<=ei){
			temp[k++]=arr[j++];
		}
		for(k=0, i=si; k<temp.length; k++,i++){
			arr[i]=temp[k];
		}

	}


		public static void main(String args[]) {
			int arr[] = { 5,3,6,9,2,0,1, -9,-2};
			mergeSort(arr, 0, arr.length-1 );
			printArr(arr);
	}
}
