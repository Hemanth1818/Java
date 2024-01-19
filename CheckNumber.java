public class NumberChecker {
    public boolean checkNumber(int number) {
        String numberStr = Integer.toString(number);

        // Iterate through the digits to check if they are in increasing order
        for (int i = 1; i < numberStr.length(); i++) {
            if (Character.getNumericValue(numberStr.charAt(i)) <= Character.getNumericValue(numberStr.charAt(i - 1))) {
                return false;
            }
        }

        // If the loop completes without returning, the number is increasing
        return true;
    }

    public static void main(String[] args) {
        int testNumber = 134468;  // Replace with your desired number
        NumberChecker checker = new NumberChecker();
        boolean isIncreasing = checker.checkNumber(testNumber);

        if (isIncreasing) {
            System.out.println(testNumber + " is an increasing number.");
        } else {
            System.out.println(testNumber + " is not an increasing number.");
        }
    }
}
