package dev.angelo;

public class AmrstrongChecker {

    public boolean isArmstrong(int number) {
        String numberStr = Integer.toString(number);
        int numDigits = numberStr.length();
        int sum = 0;

        for (char digitChar : numberStr.toCharArray()) {
            int digit = Character.getNumericValue(digitChar);
            sum += Math.pow(digit, numDigits);
        }

        return sum == number;
    }

}
