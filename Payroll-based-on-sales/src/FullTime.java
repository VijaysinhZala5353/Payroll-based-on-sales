public class FullTime extends Employee{
    private double salary;
    private double bonus;
    //calcEarnings {return salary + bonus;}


    //Constructor
    public FullTime(String name, int age, double salary, double bonus) {
        super(name, age);
        this.salary = salary;
        this.bonus = bonus;
    }


    //Getter and Setter Methods
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    //toString Method
    @Override
    public String toString() {
        return super.toString() +
                "salary=" + salary +  "\n" +
                "bonus=" + bonus;
    }

    //calcEarnings() Method to find the total of Fulltime worker
    public double calcEarnings()
    {
        return salary+bonus;
    }
}
