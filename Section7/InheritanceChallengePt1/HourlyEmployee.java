package Section7.InheritanceChallengePt1;

public class HourlyEmployee extends Employee{

    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String endDate, String hireDate,
            double hourlyPayRate) {
        super(name, birthDate, endDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }
    
    public double getDoublePay() {
        return (getHourlyPayRate() * 160);
    }

    @Override
    public double collectPay() {
        return getHourlyPayRate() * 80;
    }

    
}
