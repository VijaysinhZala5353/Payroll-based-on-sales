public abstract class Vehicle {
    private String make;
    private String plate;

    //Constructot
    public Vehicle(String make, String plate) {
        this.make = make;
        this.plate = plate;
    }

    //getter and setter methods
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    //toString method

    @Override
    public String toString() {
        return  "make='" + make + '\'' + "\n" +
                "plate='" + plate + '\'' + "\n";
    }
}