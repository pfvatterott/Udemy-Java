package Section7.InheritanceChallengePt1;

public class Employee extends Worker {
    private long employeeId;
    private String hireDate;

    private static int employeeNo = 1;

   

    public Employee(String name, String birthDate, String endDate, String hireDate) {
        super(name, birthDate, endDate);
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

}
