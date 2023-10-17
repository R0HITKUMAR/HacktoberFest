public class HCFCalculator {
    public static int calculateHCF(int num1, int num2) {
        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        while (num2 != 0) {
            int remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }
        return num1;
    }
    
    public static void main(String[] args) {
        int number1 = 675;
        int number2 = 835;
        int hcf = calculateHCF(number1, number2);
        System.out.println("The HCF of " + number1 + " and " + number2 + " is: " + hcf);
    }
}