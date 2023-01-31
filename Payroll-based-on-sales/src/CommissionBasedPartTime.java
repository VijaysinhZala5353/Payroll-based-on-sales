public class CommissionBasedPartTime extends PartTime{
    private double commission;

     //calcEarnings return (rate*hoursWorked) + commission


    public CommissionBasedPartTime(String name, int age, double rate, double hoursWorked, double commission) {
        super(name, age, rate, hoursWorked);
        this.commission = commission;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    public String toString() {
        return super.toString() +
                "commission=" + commission + "%" ;
    }

    public double calcEarnings()
    {
        return (super.getRate()*super.getHoursWorked())+(super.getRate()*super.getHoursWorked())*(commission/100);
    }
}
