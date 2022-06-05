import java.util.Scanner;

public class Q35Transpose {
    public static void main(String[] args) {
        int i, j, row, column;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of Rows and Column");
        row= sc.nextInt();
        column= sc.nextInt();
        int arr[][]= new int[row][column];
        System.out.println("Enter Matrix");
        for(i=0; i<row; i++){
            for(j=0; j<column;j++){
                arr[i][j] = sc.nextInt();
                System.out.print(" ");

            }
        }
        System.out.println("The above matrix before Transpose is ");
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < column; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("Matrix After Transpose");
        for(i=0; i<column; i++){
            for(j=0; j<row; j++ ){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println(" ");
        }

    }

}
