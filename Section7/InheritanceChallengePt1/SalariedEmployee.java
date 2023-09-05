package Section7.InheritanceChallengePt1;

public class SalariedEmployee extends Employee {

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String endDate, String hireDate,
            double annualSalary, boolean isRetired) {
        super(name, birthDate, endDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public void setRetired(boolean isRetired) {
        this.isRetired = isRetired;
    }

    public boolean isRetired() {
        return isRetired;
    }

    public void retire() {
        this.isRetired = true;
    }

    @Override
    public double collectPay() {
        return getAnnualSalary() / 24;
    }

    
    
}
