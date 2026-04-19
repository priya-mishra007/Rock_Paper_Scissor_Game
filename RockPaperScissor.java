import java.util.Random;
import java.util.Scanner;
class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        String[] choices = {"Rock", "Paper", "Scissors"};
        System.out.println("Welcome to stone , paper , scissor game!!");
        System.out.println("Enter your choice: ");
        System.out.println("0 - Stone");
        System.out.println("1 - Paper");
        System.out.println("2 - Scissors");
        int userChoice = s.nextInt();
        if (userChoice < 0 || userChoice > 2){
            System.out.println("Invalid choice! ,Please try again!");
            return;
        }
        int computerChoice = r.nextInt(3);
        System.out.println("User choice: " + choices[userChoice]);
        System.out.println("Computer choice: " + choices[computerChoice]);
        if (userChoice == computerChoice){
            System.out.println("Its draw!");
        }
        else if((userChoice == 0 && computerChoice==2) || (userChoice == 2 && computerChoice==0) || (userChoice == 2 && computerChoice == 1)){
            System.out.println("You winn!!!!");
        }
        else{
            System.out.println("Computer win!!");
        }
        s.close();
    }
}
