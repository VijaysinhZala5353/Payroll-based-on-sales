public class Motorcycle extends Vehicle {
    private String name;
    private double price;


    //Constructot
    public Motorcycle(String make, String plate, String name, double price) {
        super(make, plate);
        this.name = name;
        this.price = price;
    }

    //getter and setter method
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //toString method
    @Override
    public String toString() {
        return "Employee has a Motorcycle" + "\n"+
                super.toString() +
                "Motorcycle name='" + name + '\'' +  "\n"+
                "Motorcycle price=" + price;
    }
}