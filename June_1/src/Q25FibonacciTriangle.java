import java.util.Scanner;

public class Q25FibonacciTriangle {
    public static void main(String[] args) {
        int row;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row number: ");
        row= sc.nextInt();
        for(int i = 1; i <= row; i++)
        {
            int term1= 0;
            int term2 = 1;
            for(int j = 1; j <= i; j++)
            {
                int Next = term1 + term2;
                System.out.print(Next + " ");
                term1 = term2;
                term2 = Next;
            }
            System.out.println();
        }
    }
}
