package Section7.ConstructorChallenge;

public class Customer {
    
    private String name;
    private double creditLimit;
    private String emailAddress;

    public Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public Customer() {
        this("noName", 0.00, "no@emailcom");
    }

    public Customer(String name, String emailAdddress) {
        this(name, 0.00, emailAdddress);
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getName() {
        return name;
    }

}
