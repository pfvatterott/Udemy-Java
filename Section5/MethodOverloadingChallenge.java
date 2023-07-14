package Section5;

public class MethodOverloadingChallenge {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(6, 10));
    }

    public static double convertToCentimeters(int heightInInches) {
        // converts inches to centimeters
        double heightInCentimeters = ((double) heightInInches) * 2.54;
        return heightInCentimeters;
    }

    public static double convertToCentimeters(int heightInFeet, int remainingInches) {
        // combines parameters to just inches
        // calls the other method to get number of centimeters and returns that value as a double
        int feetToInches = heightInFeet * 12;
        int combinedValue = feetToInches + remainingInches;
        double valueInCentimeters = convertToCentimeters(combinedValue);
        return valueInCentimeters;
    }
}
