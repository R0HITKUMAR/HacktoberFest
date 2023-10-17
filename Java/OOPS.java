//  public class OOPS {
    // public static void main(String args[]) {
//         Pen p1 = new Pen();
//         p1.setColor("Blue");
//         System.out.println(p1.color);
//         p1.setTip(5);
//         System.out.print(p1.tip);
//     }

// }
// class Pen {
//     String color;
//     int tip;

//     void setColor(String newColor) {
//         color = newColor;
//     }
//     void setTip(int newTip) {
//         tip = newTip;
//     }
// }

// class BankAccount {
//     public String username;
//     private Sring password; 
// }
// class Student {
//     String name;
//     int age;
//     float percentage;

//     void calcPercentage(int phy, int chem, int maths) {
//         percentage = (phy + chem + math) / 3;
//     }
// }

// Inheritance

// public class OOPS {
//     public static void main(String args[]) {
//         Dog dobby = new Dog();
//         dobby.eat();
//         dobby.legs();
//         //System.out.println(dobby.legs);
//     }
// }
// //Base Class
// class Animal{
//     void color() {
//         System.out.println("Dark Grey");
//     }
//     void eat() {
//         System.out.println("eats");

//     }
//     void breath() {
//         System.out.println("breathes");
//     }

// }

// class Mammals extends Animal{
//     int legs = 4;
//     void legs() {
//         System.out.println("4");
//     }
// }

// class Dog extends Mammals{
//     String breed;
// }

// //Derived class
// // class Fish extends Animal{
// //     int fins;

// //     void Swims(){
// //         System.out.println("seims in water ");
// //     }
// // }
//import java.util.*;

public class OOPS {
    public static void main(String args[]) {
        int n = 5, firstterm =0, secondterm= 1, nextterm;
        System.out.print("firstterm"+ " "+ "terms:");
        for(int i = 0; i<=n; ++i){
            System.out.print(firstterm + " ");

                nextterm = firstterm + secondterm;
                firstterm = secondterm;
                secondterm = nextterm;
             
        }
    }
}

