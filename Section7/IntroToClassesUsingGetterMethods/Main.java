package Section7.IntroToClassesUsingGetterMethods;

public class Main {
    public static void main(String[] args) {
        
        Car car = new Car();
        car.setColor("Red");
        System.out.println("make = " + car.getMake());
        car.describeCar();
    }
}
