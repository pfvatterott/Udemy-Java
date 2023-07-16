package Section6;

public class NumberInWord {
    public static void main(String[] args) {
        printNumberInWord(1);
    }

    public static void printNumberInWord(int number1) {

        String wordOfNumber;
        switch (number1) {
            case 0:
                wordOfNumber = "ZERO";
                break;
            case 1:
                wordOfNumber = "ONE";
                break;
            case 2:
                wordOfNumber = "TWO";
                break;
            case 3:
                wordOfNumber = "THREE";
                break;
            case 4:
                wordOfNumber = "FOUR";
                break;
            case 5:
                wordOfNumber = "FIVE";
                break;
            case 6:
                wordOfNumber = "SIX";
                break;
            case 7:
                wordOfNumber = "SEVEN";
                break;
            case 8:
                wordOfNumber = "EIGHT";
                break;
            case 9:
                wordOfNumber = "NINE";
                break;
            default:
                wordOfNumber = "OTHER";
                break;
        }
        ;
        System.out.println(wordOfNumber);
    }
}
