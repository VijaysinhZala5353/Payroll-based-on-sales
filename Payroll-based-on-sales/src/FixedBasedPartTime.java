public class FixedBasedPartTime extends PartTime{
    private double fixedAmount;

    //calcEarning return (rate*hoursWorked)+fixedAmount


    //Constructor
    public FixedBasedPartTime(String name, int age, double rate, double hoursWorked, double fixedAmount) {
        super(name, age, rate, hoursWorked);
        this.fixedAmount = fixedAmount;
    }

    //Getter and Setter Methods
    public double getFixedAmount() {
        return fixedAmount;
    }

    public void setFixedAmount(double fixedAmount) {
        this.fixedAmount = fixedAmount;
    }

    //toString Method
    @Override
    public String toString() {
        return super.toString()+
                "fixedAmount=" + fixedAmount ;
    }

    //calcEarnings() method to get the total of earnings of part time fixed based workers
    public double calcEarnings()
    {
        return (super.getRate()*super.getHoursWorked())+fixedAmount;
    }
}
