package Section7.ConstructorChallenge;

public class Main {
    
    public static void main(String[] args) {
        
        Customer Paul = new Customer("Paul", 1000.00, "paul@test.com");
        System.out.println(Paul.getName() + " " + Paul.getCreditLimit() + " " + Paul.getEmailAddress());

        Customer Default = new Customer();
        System.out.println(Default.getName() + " " + Default.getCreditLimit() + " " + Default.getEmailAddress());

        Customer Tim = new Customer("Tim", "tim@email.com");
        System.out.println(Tim.getName() + " " + Tim.getCreditLimit() + " " + Tim.getEmailAddress());
    }
}
 