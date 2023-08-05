package Section7.ClassesUsingSettersAndCreatingObjects;

public class Main {
    public static void main(String[] args) {
        
        Car car = new Car();
        car.setColor("Red");
        car.setMake("Porsche");
        car.setModel("Cayenne");
        car.setConvertible(false);
        car.setDoors(4);
        System.out.println("make = " + car.getMake());
        car.describeCar();

        Car targa = new Car();
        targa.setColor("Blue");
        targa.setModel("Targa");
        targa.describeCar();
    }
}
