import java.util.Scanner;

public class Q26FibonacciSeries {
    public static void main(String[] args) {
        int num, term1 = 0, term2 = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        num = sc.nextInt();
        for (int i = 1; i <= num; ++i) {
            System.out.print(term1 + ", ");

            // compute the next term
            int nextTerm = term1 + term2;
            term1 = term2;
            term2 = nextTerm;



        }
    }
}
