import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int number1 = scanner.nextInt();

        System.out.print("Input the 2nd number: ");
        int number2 = scanner.nextInt();

        System.out.print("Input the 3rd number: ");
        int number3 = scanner.nextInt();

        int greatest = number1; // Assume the first number is the greatest initially

        if (number2 > greatest) {
            greatest = number2; // Update greatest if the second number is larger
        }

        if (number3 > greatest) {
            greatest = number3; // Update greatest if the third number is larger
        }

        System.out.println("The greatest: " + greatest);

        scanner.close();
    }
}
