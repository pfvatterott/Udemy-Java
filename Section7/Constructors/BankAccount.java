package Section7.Constructors;

public class BankAccount {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        System.out.println("Empty Constructor called");
    }

    public BankAccount(int accountNumber, double accountBalance, String customerName, String email, String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    
    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void depositFunds(double accountBalance, double depositAmount) {
        this.accountBalance = accountBalance + depositAmount;
        System.out.println("Deposit of $" + depositAmount + " successful. You now have $" + this.accountBalance);
    }

    public void withdrawFunds(double accountBalance, double withdrawAmount) {
        if (withdrawAmount > accountBalance) {
            System.out.println("You cannot withdraw that amount. You have $" + accountBalance + " in your account");
        }
        else {
            this.accountBalance = accountBalance - withdrawAmount;
            System.out.println("Withdrawal of $" + withdrawAmount + " successful. You now have $" + this.accountBalance);
        }
    }
}
