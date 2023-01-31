import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String args[])
    {
        //Scanner, Variables and Arraylist declarations
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> empList = new ArrayList<Employee>();
        ArrayList<Vehicle> vecList = new ArrayList<Vehicle>();
        int addEmployee = 0;
        double payroll = 0;
        boolean noVehicle = false;
        boolean repeat = false;

        //do while to take input from user
        do {
            System.out.println("Enter the name of Employee");
            String name = sc.next();
            System.out.println("Enter the age of Employee");
            int age = sc.nextInt();

            //empList.add(new Employee(name, age));



            //do while loop to enter vehicle details correctly
            do {
                System.out.println("Do you have vehicle? yes/no?");
                String vehicleChoice = sc.next();
                if (vehicleChoice.equalsIgnoreCase("yes"))
                {
                    noVehicle = false;
                    repeat = false;
                    System.out.println("Please enter a make:");
                    String make = sc.next();
                    System.out.println("Please enter a plate:");
                    String plate = sc.next();


                    boolean vehicleRepeat = false;
                    do {
                        vehicleRepeat = false;
                        System.out.println("Please provide type of vehicle \n 1) MotorCycle \n 2) Car");
                        int vehicle = sc.nextInt();
                        if (vehicle == 1)
                        {
                            System.out.println("Please enter a Model Name:");
                            String modelName = sc.next();
                            System.out.println("Please enter a Model Price:");
                            double modelPrice = sc.nextFloat();

                            vecList.add(new Motorcycle(make,plate,modelName,modelPrice));
                        }

                        else if (vehicle == 2)
                        {
                            System.out.println("Please enter a Model Name:");
                            String modelName = sc.next();
                            System.out.println("Please enter a Model Price:");
                            double modelPrice = sc.nextFloat();

                            vecList.add(new Car(make,plate,modelName,modelPrice));
                        }

                        else
                        {
                            vehicleRepeat = true;
                            System.out.println("Please enter a valid number for choice");
                        }
                    }while (vehicleRepeat);
                }
                else if (vehicleChoice.equalsIgnoreCase("no"))
                {
                    repeat = false;
                    noVehicle = true;
                    vecList.add(new Car("","","",0));

                }
                else
                {
                    repeat = true;
                }
            }while (repeat);




            boolean entry = true;

            //Do while loop to take job type data correctly
            do {
                System.out.println("Enter type of job. PartTime, Intern or FullTime");
                String typeOfJob = sc.next();
                entry = true;
                if (typeOfJob.equalsIgnoreCase("parttime"))
                {

                    System.out.println("Enter the rate: ");
                    double rate = sc.nextDouble();

                    System.out.println("Enter the hoursWorked: ");
                    double hoursWorked = sc.nextDouble();

                    System.out.println("Enter 1 for 'Commission based part time' or any number for 'Fixed based part time");
                    int jobType = sc.nextInt();

                    if (jobType == 1)
                    {
                        System.out.println("Enter the commission: ");
                        double commission = sc.nextDouble();

                        empList.add(new CommissionBasedPartTime(name, age, rate, hoursWorked, commission));

                    }
                    else
                    {
                        System.out.println("Enter fixed amount: ");
                        double fixedAmount = sc.nextDouble();
                        empList.add(new FixedBasedPartTime(name, age, rate, hoursWorked, fixedAmount));
                    }
                }

                else if (typeOfJob.equalsIgnoreCase("intern"))
                {
                    System.out.println("Enter the name of school");
                    String schoolName = sc.nextLine();
                    schoolName = sc.nextLine();
                    empList.add(new Intern(name, age, schoolName));
                }

                else if (typeOfJob.equalsIgnoreCase("fulltime"))
                {
                    System.out.println("Enter the salary: ");
                    double salary = sc.nextDouble();
                    System.out.println("Enter the Bonus: ");
                    double bonus = sc.nextDouble();

                    //adding all data to classes Objects
                    empList.add(new FullTime(name, age, salary, bonus));
                }

                else
                {
                    System.out.println("Wrong input!!! Try Again!");
                    entry = false;
                }
            }while (!entry);

            System.out.println("Enter 1 if you want to add Employee or any number for exit");
            addEmployee = sc.nextInt();
        } while (addEmployee==1);


        //to print all data calling printMyData() method
        PrintClass myPig = new PrintClass();
        myPig.printMyData(empList,vecList);

    }


}
