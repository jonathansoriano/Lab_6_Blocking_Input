import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        double numGallons=0;
        double gasPrice=0;
        double fuelEfficiency=0;
        double costOfTrip=0;
        double carTrip=0;
        String trash= "";
        boolean done= false;

        do {
            System.out.print("Enter the amount of gas your car can take: ");
            if (in.hasNextDouble())
            {
                numGallons= in.nextDouble();
                in.nextLine();
                done=true;
            }
            else
            {
             trash=in.nextLine();
                System.out.println("You entered: "+trash);
                System.out.println("Please try again and enter a valid amount!");
            }
        } while(!done);

        done=false;
        do {
            System.out.print("Enter the your car's fuel efficiency in miles: ");
            if (in.hasNextDouble())
            {
                fuelEfficiency=in.nextDouble();
                in.nextLine();
                done=true;
            }
            else
            {
                trash=in.nextLine();
                System.out.println("You entered: "+trash);
                System.out.println("Please try again and enter a valid amount!");
            }
        } while(!done);

        done=false;
        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (in.hasNextDouble())
            {
             gasPrice=in.nextDouble();
             in.nextLine();
             done=true;
            }
            else
            {
             trash=in.nextLine();
                System.out.println("You entered: "+trash);
                System.out.println("Please try again and enter a valid amount!");
            }
        }while (!done);
        carTrip = fuelEfficiency*numGallons;
        costOfTrip= (gasPrice/fuelEfficiency)*100;

        System.out.println("The car will go this many miles with a full tank of gas: "+ carTrip);
        System.out.printf("The cost per 100 miles is $%.2f\n",costOfTrip);

    }
}
