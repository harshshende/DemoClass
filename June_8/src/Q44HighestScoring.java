import java.util.Scanner;

public class Q44HighestScoring {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Words");
        String  s = sc.nextLine();
        String highscoreWord= "";
        int maxTotal = 0;

        for (String word : s.split(" ")) {
            int totalOfWord = 0;
            for (char c : word.toCharArray()) {
                totalOfWord += c - 96; // the int value of "a" is 97
            }
            if (totalOfWord > maxTotal) {
                maxTotal = totalOfWord;
                highscoreWord = word;
            }
        }
        System.out.println(highscoreWord);

    }


}
