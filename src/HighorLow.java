import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        Random gen= new Random();
        int val= gen.nextInt(10)+1;
        boolean done=false;
        String trash="";
        int guessNum=0;

        do
        {
            System.out.print("Enter your guess between [1-10]: ");
            if (in.hasNextInt())
            {
                guessNum=in.nextInt();
                in.nextLine();
                if (guessNum>= 1 && guessNum<=10)
                {
                 done=true;
                }
                else
                {
                    System.out.println("Please enter a valid number in range not: "+guessNum);
                }
            }else
            {
                trash = in.nextLine();
                System.out.println("Please enter a valid number not: "+trash);
            }
        }while (!done);

        System.out.println("The random number was: " + val);

        if (guessNum == val) {
            System.out.println("Congratulations! Your guess was correct!");
        } else if (guessNum < val) {
            System.out.println("Too low!");
        } else {
            System.out.println("Too high!");
        }
    }
}
