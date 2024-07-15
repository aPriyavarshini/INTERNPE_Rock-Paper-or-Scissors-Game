import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] rps = {"Rock", "Paper", "Scissors"};
        int userWins = 0;
        int computerWins = 0;
        int ties = 0;

        System.out.println("Welcome to 'Rock, Paper, Scissors' Game. ");
        System.out.println("Instructions: Enter 'Rock', 'Paper', or 'Scissors' to play.");
        System.out.println("Type 'exit' to quit the game.");

        while (true)
        {
            System.out.print("Enter your move: ");
            String userMove = scanner.nextLine();

            if (userMove.equalsIgnoreCase("exit"))
            {
                System.out.println("Thanks for playing!");
                break;
            }

            if (!userMove.equalsIgnoreCase("Rock") && !userMove.equalsIgnoreCase("Paper") && !userMove.equalsIgnoreCase("Scissors"))
            {
                System.out.println("Invalid move, please try again.");
                continue;
            }

            int computerMoveIndex = random.nextInt(3);
            String computerMove = rps[computerMoveIndex];

            System.out.println("Computer move: " + computerMove);

            if (userMove.equalsIgnoreCase(computerMove))
            {
                System.out.println("It's a tie!");
                ties++;
            }
            else if (userMove.equalsIgnoreCase("Rock"))
            {
                if (computerMove.equals("Scissors"))
                {
                    System.out.println("Rock crushes Scissors. You win!!!");
                    userWins++;
                }
                else
                {
                    System.out.println("Paper covers Rock. You lose!");
                    computerWins++;
                }
            }
            else if (userMove.equalsIgnoreCase("Paper"))
            {
                if (computerMove.equals("Rock"))
                {
                    System.out.println("Paper covers Rock. You win!!!");
                    userWins++;
                }
                else
                {
                    System.out.println("Scissors cuts Paper. You lose!");
                    computerWins++;
                }
            }
            else if (userMove.equalsIgnoreCase("Scissors"))
            {
                if (computerMove.equals("Paper"))
                {
                    System.out.println("Scissors cuts Paper. You win!!!");
                    userWins++;
                }
                else
                {
                    System.out.println("Rock crushes Scissors. You lose!");
                    computerWins++;
                }
            }

            System.out.println("Score: You - " + userWins + " | Computer - " + computerWins + " | Ties - " + ties);
        }

        scanner.close();
    }
}
