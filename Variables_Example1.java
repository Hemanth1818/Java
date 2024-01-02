public class Variables_Example1 {
    public static void main(String[] args) {
        int number1 = 12;
        int number2 = 13;
        int number3 = 11;

        int sum_result = number1 + number2 + number3;
        double average = (double) sum_result / 3;
        int sub_result = number1 - number2 - number3;
        int mul_result = number1 * number2 * number3;

        System.out.println("Sum of three numbers is: " + sum_result);
        System.out.println("Average of three numbers is: " + average);
        System.out.println("Subtraction of three numbers is: " + sub_result);
        System.out.println("Multiplication of three numbers is: " + mul_result);
    }
}
