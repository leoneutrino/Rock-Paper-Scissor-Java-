package javaapplication32;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class JavaApplication32 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String computer;
    String user;
    Scanner keyboard = new Scanner(System.in);
    // Play the game as long as there is draw.
    do {
        // Get the computer's choice. 
        computer = computerChoice();        
        // Get the user's choice.
        user = userChoice(keyboard);
        // Determine the winner.
        determineWinner(computer, user);        
    } while (user.equalsIgnoreCase(computer));
    }
    public static String getChoice (int number) {
    String choice;
//assingn the number with letters.
    switch (number) {
        case 1:
            choice = "rock";
            break;
        case 2:
            choice = "paper";
            break;
        case 3:
            choice = "scissors";
            break;
        default:
            choice = null;
    }
    return choice;
}
    public static String computerChoice() {
    // Create a Random number in the range of 3.
    Random rand = new Random();
    int num = rand.nextInt(3) + 1;
    // Return the computer's choice. 
    return getChoice (num) ;
    }
    public static String userChoice(Scanner keyboard) {
    // Ask the user for input in numbers
    System.out.print("Enter 1 - rock, 2 - paper, or 3 - scissors: ");
    int userChoice = keyboard.nextInt();
    String play = getChoice (userChoice);
    // Validate the choice.
    while (play == null) {
        System.out.print("Enter 1 - rock, 2 - paper, or 3 - scissors: ");
        userChoice = keyboard.nextInt();
        play = getChoice (userChoice);
    }
    // Return the user choice.
    return play;
}
    public static void determineWinner (String computerChoice, String userChoice) {
    System.out.print("The computer's choice was " + computerChoice + ".\n");
    System.out.print("The user's choice was " + userChoice + ".\n\n");
    // check logic
    if (computerChoice.equals(userChoice))
            System.out.print( "The game is tied!\nPlay again...\n");        
        else if (computerChoice.equalsIgnoreCase("rock") && userChoice.equalsIgnoreCase("paper"))
            System.out.print("User wins. \n Paper covers rock.\n");
        else if (computerChoice.equalsIgnoreCase("rock") && userChoice.equalsIgnoreCase("scissors"))
            System.out.print( "Computer wins. Rock crushes scissors.\n");
        else if (computerChoice.equalsIgnoreCase("paper") && userChoice.equalsIgnoreCase("rock"))
             System.out.print("Computer wins.  \nPaper covers rock.\n");
        else if (computerChoice.equalsIgnoreCase("paper") && userChoice.equalsIgnoreCase("scissors"))
             System.out.print("User wins. \nScissors cuts paper.\n");
        else if (computerChoice.equalsIgnoreCase("scissors") && userChoice.equalsIgnoreCase("rock"))
             System.out.print("User wins. \nRock crushes scissors.\n"); 
       else
             System.out.print("Computer wins. \nScissors cuts paper.\n");  
}}
