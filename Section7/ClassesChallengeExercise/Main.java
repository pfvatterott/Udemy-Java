package Section7.ClassesChallengeExercise;

public class Main {
    public static void main(String[] args) {
        BankAccount PaulsAccount = new BankAccount();
        PaulsAccount.setAccountBalance(10000.00);
        PaulsAccount.setCustomerName("Paul");
        PaulsAccount.setEmail("paul@paul.com");
        PaulsAccount.setPhoneNumber("651-485-4822");
        PaulsAccount.setAccountNumber(123123);

        PaulsAccount.depositFunds(PaulsAccount.getAccountBalance(), 5.00);
        PaulsAccount.withdrawFunds(PaulsAccount.getAccountBalance(), 1000.00);
    }
}
