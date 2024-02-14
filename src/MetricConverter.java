import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        String trash="";
        boolean done=false;
        double measureMeter=0;
        double measureMiles=0;
        double measureFeet=0;
        double measureInches=0;

        do {
            System.out.print("Enter your measurement in meters: ");
            if (in.hasNextDouble())
            {
                measureMeter=in.nextDouble();
                in.nextLine();
                done=true;
            }
            else
            {
              trash=in.nextLine();
                System.out.println("You need to enter a valid measurement not: "+trash);
            }
        }while(!done);
        measureMiles= measureMeter/1609;
        measureFeet= measureMeter * 3.281;
        measureInches= measureMeter * 39.37;
        System.out.printf("Your measure converted to miles is %.5f\n", measureMiles);
        System.out.printf("Your measure converted to feet is %.2f\n", measureFeet);
        System.out.printf("Your measure converted to inches is %.2f\n", measureInches);
    }
}
