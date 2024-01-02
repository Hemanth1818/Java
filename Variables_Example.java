public class Variables_Example {
    public static void main(String[] args) {
        byte number1 = 12;
        byte number2 = 13;
        byte number3 = 100;
        byte number4 = 100;
        String result1;
        String result2;

        if (number1 == number2) {
            result1 = "number1 and number2 values are equal";
        } else {
            result1 = "number1 and number2 values are not equal";
        }
        
        if (number3 == number4) {
            result2 = "number3 and number4 values are equal";
        } else {
            result2 = "number3 and number4 values are not equal";
        }

        System.out.println(result1);
        System.out.println(result2);
    }
}
