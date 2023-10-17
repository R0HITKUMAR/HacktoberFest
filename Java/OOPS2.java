public class OOPS2 {
import java.util.Arrays;
    public static void main(String[] args) {
        int[] numbers = new int[5];
        String[] names = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        Student nishant;
        System.out.println(Arrays.toString(students));
    }
}
class Student{
    int rno;
    String name;
    float marks;
}
