public class PowerOfTwoChecker {
    public boolean checkNumber(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int testNumber = 8;  // Replace with your desired number
        PowerOfTwoChecker checker = new PowerOfTwoChecker();
        boolean isPowerOfTwo = checker.checkNumber(testNumber);

        if (isPowerOfTwo) {
            System.out.println(testNumber + " is a power of two.");
        } else {
            System.out.println(testNumber + " is not a power of two.");
        }
    }
}
