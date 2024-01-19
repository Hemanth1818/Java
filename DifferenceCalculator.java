public class DifferenceCalculator {
    public int calculateDifference(int n) {
        if (n <= 0) {
            return 0;
        }

        // Calculate the sum of the squares
        int sumOfSquares = 0;
        for (int i = 1; i <= n; i++) {
            sumOfSquares += i * i;
        }

        // Calculate the square of the sum
        int sum = (n * (n + 1)) / 2; // Sum of the first n natural numbers
        int squareOfSum = sum * sum;

        // Find the difference
        return sumOfSquares - squareOfSum;
    }

    public static void main(String[] args) {
        int nValue = 10;  // Replace with your desired value of n
        DifferenceCalculator calculator = new DifferenceCalculator();
        int result = calculator.calculateDifference(nValue);
        System.out.println("The difference for the first " + nValue + " natural numbers is: " + result);
    }
}
