import java.util.ArrayList;

public class PrintClass implements IPrintable{
    @Override

    //printMyData function body to print data
    public void printMyData(ArrayList<Employee> empList, ArrayList<Vehicle> vecList) {
        double payroll = 0;
        for(Employee pub: empList){
            System.out.println("Employee Name:"+pub.getName());
            System.out.println("Year of Birth:"+pub.getAge());

            for(Vehicle vec: vecList){
                if (vec.getMake()=="")
                {
                    System.out.println("Employee has no vehicle Registered");
                    vecList.remove(vec);
                }
                else
                {
                    System.out.println(vec);
                    vecList.remove(vec);
                }
                break;
            }


            System.out.println(pub);
            System.out.println("Earnings="+pub.calcEarnings());
            payroll += pub.calcEarnings();
            System.out.println("--------------------");
        }

        //System.out.println("\n");
        System.out.println("Payroll="+payroll);
    }
    }

