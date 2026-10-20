import java.util.Random;
import java.util.Scanner;

public class Craps
{
    static void main()
    {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        String playAgain = "y";

        while (playAgain.equalsIgnoreCase("y"))
        {

            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int sum = die1 + die2;

            IO.println("First Roll: ");
            IO.println("Die 1 = " + die1);
            IO.println("Die 2 = " + die2);
            IO.println("Sum = " + sum);

            // Craps
            if (sum == 2 || sum == 3 || sum == 12) {
                IO.println("Craps! You lost.");

            }
            // Natural
            else if (sum == 7 || sum == 11) {
                IO.println("Natural! You won.");

            }
            // Point established
            else
            {
                int point = sum;

                IO.println("Point is now " + point);

                boolean rolling = true;

                while (rolling)
                {

                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    sum = die1 + die2;

                    IO.println("\nTrying for point: ");
                    IO.println("Die 1 = " + die1);
                    IO.println("Die 2 = " + die2);
                    IO.println("Sum = " + sum);

                    if (sum == point)
                    {
                        IO.println("Made the point! You won.");
                        rolling = false;
                    }
                    else if (sum == 7)
                    {
                        IO.println("Got a seven! You lost.");
                        rolling = false;
                    }
                }
            }

            IO.print("Play again? [YN]: ");
            playAgain = in.nextLine();
        }

        IO.println("Thanks for playing!");
        in.close();
    }
}
