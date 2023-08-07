package Section7.ConstructorsPart2;

public class Main {
    
    public static void main(String[] args) {
        // BankAccount PaulsAccount = new BankAccount(134232, 10000.00, "Paul", "paul@test.com", "512-242-2545");

        BankAccount defaultAccount = new BankAccount();


        // PaulsAccount.setAccountBalance(10000.00);
        // PaulsAccount.setCustomerName("Paul");
        // PaulsAccount.setEmail("paul@paul.com");
        // PaulsAccount.setPhoneNumber("651-485-4822");
        // PaulsAccount.setAccountNumber(123123);

        defaultAccount.depositFunds(defaultAccount.getAccountBalance(), 5.00);
        defaultAccount.withdrawFunds(defaultAccount.getAccountBalance(), 1000.00);

        BankAccount timsAccount = new BankAccount("Tim", "tim@email.com", "512-523-5343");
        System.out.println("account number: " + timsAccount.getAccountNumber() + "; name " + timsAccount.getCustomerName());
    }
}
