public class ComputerMove {

    public String computerMove(){
        int randomValue = (int) (Math.random() * 3);
        String computerMove = "";

        if (randomValue == 0) {
            computerMove = "rock";
        } else if (randomValue == 1) {
            computerMove = "paper";
        } else {
            computerMove = "scissors";
        }
        System.out.println("Computer Move: " + computerMove);
        return computerMove;
    }

}
