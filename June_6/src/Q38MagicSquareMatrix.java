import java.util.Scanner;

public class Q38MagicSquareMatrix {
    public static void main(String[] args) {
        int num, i, j, diagonal_sum1 = 0, diagonal_sum2 = 0, row_sum = 0, col_sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        num = sc.nextInt();
        int arr[][] = new int[num][num];
        System.out.println("Enter Matrix");
        for (i = 0; i < num; i++) {
            for (j = 0; j < num; j++) {
                arr[i][j] = sc.nextInt();
                System.out.print("");
            }
        }
        System.out.println("The Matrix is");
        for (i = 0; i < num; i++) {
            for (j = 0; j < num; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (i = 0; i < num; i++) {
            diagonal_sum1 += arr[i][i];
            diagonal_sum2 += arr[i][num - 1 - i];
        }
        if (diagonal_sum1 == diagonal_sum2) {
            for (i = 0; i < num; i++) {
                for (j = 0; j < num; j++) {
                    row_sum += arr[i][j];
                    col_sum += arr[j][i];
                }
                if (row_sum == col_sum && row_sum == diagonal_sum1) {
                    System.out.println("Yes");
                    return;
                }
                else {
                    System.out.println("NO");
                    return;
                }
            }
        }
        else {
            System.out.println("No");
            return;
        }

    }
}
