package Section4;

public class Hello {
    public static void main(String[] args) {
        System.out.println("hello, tim");
        
        boolean isAlien = true;
        if (isAlien == true) {
            System.out.println("It is not an alien!");
            System.out.println("And I'm scared of aliens");
        }

        int topScore = 100;
        if (topScore != 100) {
            System.out.println("You got the high score!");
        }
        else if (topScore > 99) {
            System.out.println("You got the higher score!");
        }
        else if (topScore >= 100) {
            System.out.println("You got the higher score!");
        }
        else if (topScore <= 100) {
            System.out.println("You got the higher score!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.print("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an error");
        }

        boolean isCar = false;
        if (!isCar){
             System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        double doubleVariable = 20.00d;
        double secondDoubleVariable = 80.00d;
        double thirdDoubleVariable = (doubleVariable + secondDoubleVariable) * 100.00d;
        double fourthDoubleVariable = thirdDoubleVariable % 40.00d;
        boolean isZeroRemainder = (fourthDoubleVariable == 0) ? true : false;
        System.out.println(isZeroRemainder);
        if (!isZeroRemainder) {
            System.out.println("got some remainder");
        }
    }
}
