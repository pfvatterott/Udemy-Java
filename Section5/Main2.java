package Section5;

public class Main2 {
    public static void main(String[] args) {
        int myVariable = 50;
        myVariable++;
        myVariable--;

        System.out.println("This is a test");

        System.out.println("This is" +
            " another" +
            " still more."); // hard to read

        int anotherVariable = 50;myVariable--; System.out.println("myVariable = "+myVariable); // hard to read

        if (myVariable == 0) {
            System.out.println("It's now zero");
        }
    }
}
