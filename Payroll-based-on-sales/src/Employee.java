public abstract class Employee {
    private String name;
    private int age;
    //calcBirthYear (return-2021)
    //calcEarnings() return 1000


    //construtor
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //toString method
    @Override
    public String toString() {
        return "";
    }

    public double calcEarnings()
    {
        return 1000;
    }
}
