import javax.management.StringValueExp;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Rock, Paper, Scissors");
        System.out.println("Enter your Name: ");
        String name = scan.nextLine();
        String path ="C://Users//ASUS//Desktop//RockPaper.txt";
        File obj = new File(path);
        obj.createNewFile();
        SaveFile s = new SaveFile();
        boolean player = s.PlayerAlreadyExists(name);
        if(player == true){
            String high_score= s.GetHighestScore(name);
            System.out.println("player exists");
            System.out.println(high_score);
        }
        else{
            System.out.println("0");
        }

        Game x = new Game();

        while (true) {
            System.out.println(name + " What is your Move?");
            System.out.println("The Computer has made choice");
            System.out.println("To make a move enter rock, paper, or scissors: ");
            System.out.println("To quit the game, Enter q: ");
            String Move = scan.nextLine();

            if (Move.equals("q")) {
                System.out.println("Thank you for playing");
                break;
            }
            if (!Move.equals("rock") && !Move.equals("paper") && !Move.equals("scissors")) {
                System.out.println("Invalid Move");
            } else {
                ComputerMove y = new ComputerMove();
                String computer = y.computerMove();
                x.result(Move, computer);
            }


        }
        s.saveplayer(name, x.score);
    }
}
