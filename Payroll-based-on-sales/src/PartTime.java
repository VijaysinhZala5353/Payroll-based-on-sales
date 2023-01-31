import java.net.PortUnreachableException;

public abstract class PartTime extends Employee{
    private double rate;
    private double hoursWorked;

    //Constructor
    public PartTime(String name, int age, double rate, double hoursWorked) {
        super(name, age);
        this.rate = rate;
        this.hoursWorked = hoursWorked;
    }

    //Getter and Setter Methods
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }


    //toString Method
    @Override
    public String toString() {
        return super.toString() +
                "rate=" + rate + "\n" +
                "hoursWorked=" + hoursWorked + "\n";
    }

    //calcEarnings() Method to find earnings of part time employees
    public double calcEarnings()
    {
        return 0;
    }
}
