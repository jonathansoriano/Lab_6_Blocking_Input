import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        double height=0;
        double width=0;
        double rectangleArea=0;
        double lengthDiagonal=0;
        double rectanglePerimeter=0;
        String trash="";
        boolean done=false;

        do {
            System.out.print("Enter the height of the rectangle: ");
            if (in.hasNextDouble()){
                height=in.nextDouble();
                in.nextLine();
                done=true;
            }
            else
            {
               trash=in.nextLine();
                System.out.println("You entered: " +trash);
                System.out.println("Please enter a valid value and try again!");
            }
        }while(!done);
        done=false;
        do {
            System.out.print("Enter the width of the rectangle: ");
            if (in.hasNextDouble()){
                width=in.nextDouble();
                in.nextLine();
                done=true;
            }
            else
            {
                trash=in.nextLine();
                System.out.println("You entered: " +trash);
                System.out.println("Please enter an valid value and try again!");
            }
        }while(!done);
        rectangleArea= height*width;
        rectanglePerimeter= (2*height)+(2*width);
        lengthDiagonal= Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));

        System.out.println("The area of the rectangle is: "+rectangleArea);
        System.out.println("The perimeter of the rectangle is: "+rectanglePerimeter);
        System.out.printf("The diagonal of the rectangle is %.2f" ,lengthDiagonal);
    }
}
