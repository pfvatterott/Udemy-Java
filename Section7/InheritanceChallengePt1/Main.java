package Section7.InheritanceChallengePt1;

public class Main {
    
    public static void main(String[] args) {
        HourlyEmployee paul = new HourlyEmployee("Paul", "1990", "", "2023", 25.00);
        System.out.println("Age = " + paul.getAge());
        System.out.println("Pay = " + paul.collectPay());
        System.out.println(paul.getEmployeeId());

        SalariedEmployee tim = new SalariedEmployee("Tim", "1985", "", "2023", 95000, false);

        System.out.println(tim.getEmployeeId());

    }
}
