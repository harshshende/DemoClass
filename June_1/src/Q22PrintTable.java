import java.util.Scanner;

public class Q22PrintTable {
    public static void main(String[] args) {
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number: ");
        num= sc.nextInt();
        for(int i = 1; i <= 10; i++){
            int x= num*i;
            System.out.println(num + "*" + i + "= "+ x );
        }
    }
}

