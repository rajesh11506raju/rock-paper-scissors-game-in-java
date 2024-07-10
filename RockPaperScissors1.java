package RockPaperScissors1;
import java.util.Scanner;

public class RockPaperScissors1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Available moves
            String[] availableMoves = {"Rock", "Paper", "Scissors"};

            // Randomized computer move
            String computerMove = availableMoves[(int) (Math.random() * availableMoves.length)];

            System.out.println("Computer has chosen its move.");
            System.out.println("Now it's your turn to choose. Good luck!");

            // Player move
            String userMove;
            while (true) {
                System.out.println("Please choose your move from these available moves: 'Rock' 'Paper' 'Scissors'");
                System.out.print("Enter your move: ");
                userMove = scanner.nextLine();

                if (userMove.equals("Rock") || userMove.equals("Paper") || userMove.equals("Scissors")) {
                    break;
                }

                System.out.println("Invalid move! Please choose from the available moves.");
            }

            System.out.println("Computer chose: " + computerMove);

            // Compare moves and decide the winner
            if (userMove.equals(computerMove)) {
                System.out.println("It's a tie!");
            } else if ((userMove.equals("Rock") && computerMove.equals("Scissors")) ||
                       (userMove.equals("Paper") && computerMove.equals("Rock")) ||
                       (userMove.equals("Scissors") && computerMove.equals("Paper"))) {
                System.out.println("You won! Congratulations!");
            } else {
                System.out.println("Computer won! Better luck next time!");
            }

            System.out.println();

            // Ask if the player wants to play again
            String playAgain;
            while (true) {
                System.out.print("Do you want to play again? (yes/no): ");
                playAgain = scanner.nextLine().toLowerCase();

                if (playAgain.equals("yes") || playAgain.equals("no")) {
                    break;
                }

                System.out.println("Invalid input. Please type 'yes' or 'no'.");
            }

            if (playAgain.equals("no")) {
                break;
            }

            System.out.println("*****************************************************************************\n");
        }
    }
}
