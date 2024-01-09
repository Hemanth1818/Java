import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the 5 numbers: ");
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int number = scanner.nextInt();
            sum += number;
        }

        double average = (double) sum / 5;

        System.out.println("Input the 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            int number = scanner.nextInt();
            System.out.println(number);
        }

        System.out.println("The sum of 5 numbers is: " + sum);
        System.out.println("The Average is: " + average);

        scanner.close();
    }
}
