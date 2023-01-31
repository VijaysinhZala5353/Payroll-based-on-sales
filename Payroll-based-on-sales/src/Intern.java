public class Intern extends Employee{

    private String schoolName;

    //Getter and Setter method
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }


    //Constructor
    public Intern(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;

    }

    //toString Method
    @Override
    public String toString() {
        return super.toString() +
                "schoolName='" + schoolName + '\'' ;
    }

    //calcEarnings() Method to calculate the total earnings of intern
    public double calcEarnings()
    {
        return 1000;
    }
}
