package Section7.InheritanceChallengePt1;

public class Worker {
    
    private String name; 
    private String birthDate;
    protected String endDate;

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

     public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }
    public String getBirthDate() {
        return birthDate;
    }
    public String getEndDate() {
        return endDate;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        return (2023 - Integer.parseInt(birthDate));
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker [name=" + name + ", birthDate=" + birthDate + ", endDate=" + endDate + "]";
    }

    
    

}
