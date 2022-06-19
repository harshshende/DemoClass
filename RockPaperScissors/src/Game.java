import java.io.IOException;

public class Game{

    int score = 0;
    public void result(String move, String computer) throws IOException {
        if(move.equals(computer))
        {
            System.out.println("Its a tie");
            System.out.println(score);
        }
    else
        if ((move.equals("rock") && computer.equals("scissors")) || (move.equals("scissors") && computer.equals("paper")) || (move.equals("paper") && computer.equals("rock"))) {
            System.out.println("You Won! ");
            score++;


        } else {
            System.out.println("You Lost!");
            System.out.println(score);

        }


    }



}



