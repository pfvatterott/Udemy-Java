package Section7.IntroToClassesUsingGetterMethods;

public class Car {
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Blue";
    private int doors = 2;
    private boolean convertible = true;

    public void describeCar() {
        System.out.println(doors + "-Door " + color + " " + make + " " + model + " " + (convertible ? "Convertible" : ""));
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public String getMake() {
        return make;
    }
    
    public String getModel() {
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
