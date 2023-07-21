package Section6;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(340);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int digitCount = getDigitCount(number);
        int reversedNumber = reverse(number);
        int reversedDigitCount = getDigitCount(reversedNumber);
        String wordsOfNumbers = "";

        switch (reversedNumber % 10) {
            case 0:
                wordsOfNumbers = "Zero";
                break;
            case 1:
                wordsOfNumbers = "One";
                break;
            case 2:
                wordsOfNumbers = "Two";
                break;
            case 3:
                wordsOfNumbers = "Three";
                break;
            case 4:
                wordsOfNumbers = "Four";
                break;
            case 5:
                wordsOfNumbers = "Five";
                break;
            case 6:
                wordsOfNumbers = "Six";
                break;
            case 7:
                wordsOfNumbers = "Seven";
                break;
            case 8:
                wordsOfNumbers = "Eight";
                break;
            case 9:
                wordsOfNumbers = "Nine";
                break;
            default:
                wordsOfNumbers = "";
                break;
        }
        while (reversedNumber >= 10) {
            reversedNumber = reversedNumber / 10;
            String wordOfNumber = "";
            switch (reversedNumber % 10) {
            case 0:
                wordOfNumber = "Zero";
                break;
            case 1:
                wordOfNumber = "One";
                break;
            case 2:
                wordOfNumber = "Two";
                break;
            case 3:
                wordOfNumber = "Three";
                break;
            case 4:
                wordOfNumber = "Four";
                break;
            case 5:
                wordOfNumber = "Five";
                break;
            case 6:
                wordOfNumber = "Six";
                break;
            case 7:
                wordOfNumber = "Seven";
                break;
            case 8:
                wordOfNumber = "Eight";
                break;
            case 9:
                wordOfNumber = "Nine";
                break;
            default:
                wordOfNumber = "";
                break;
        }
            wordsOfNumbers = wordsOfNumbers + " " + wordOfNumber;
        }
        int remainingNumbers = digitCount - reversedDigitCount;
        while (remainingNumbers > 0) {
            wordsOfNumbers = wordsOfNumbers + " Zero";
            remainingNumbers--;
        }
        System.out.println(wordsOfNumbers);
    }

    public static int reverse(int number) {
        boolean isNegative = false;
        if (number < 0) {
            number = (number * -1);
            isNegative = true;
        }
        int lastDigit = number % 10;
        int reverse = lastDigit;
        while (number >= 10) {
            reverse = reverse * 10;
            number = number / 10;
            lastDigit = number % 10;
            reverse += lastDigit;
        }
        if (isNegative == true) {
            reverse = (reverse * -1);
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int lastDigit = 1;
        while (number >= 10) {
            number = number / 10;
            lastDigit++;
        }
        return lastDigit;

    }
}
