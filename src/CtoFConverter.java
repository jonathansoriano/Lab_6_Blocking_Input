import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        double tempF =0;
        double tempC =0;
        boolean done =false;
        String trash="";
        do {
            System.out.print("Enter the temperature in Celsius: ");
            if (in.hasNextDouble())
            {
                tempC=in.nextDouble();
                in.nextLine();
                done=true;
            }
            else
            {
                trash=in.nextLine();
                System.out.println("You have entered: "+ trash);
                System.out.println("Please enter a valid number and try again!");
            }
        } while (!done);
        tempF= (tempC * 9/5) +32;
        System.out.printf("Your temperature in Fahrenheit is %.2f\n", tempF);
    }












}
