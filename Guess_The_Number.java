
import java.util.Random;
import java.util.Scanner;

public class Game_3
{
    public static void main(String args[])
    {
        
        System.out.println("Welcome");
        
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        
        int n = rand.nextInt(50);
        // " limit can be changed by replacing "50" present above "
        
        int guess = -1;

        while(guess != n)
        {
            
            System.out.println("Your try");
            guess = in.nextInt();
            
            //false choices to proceed
            if(guess > n)
            System.out.println("Too High");
            if(guess < n)
            System.out.println("Too Low");
            
        }
        
        //in.close();
        //System.out.println("You won");
        //System.out.println("Credit: 25061-CS-010     3rd Successful Project");
    }
}
