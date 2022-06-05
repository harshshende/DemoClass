import java.util.Scanner;

public class Q23PrintTablesBetweenRange {
    public static void main(String[] args) {
        int num , range;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        num= sc.nextInt();
        System.out.println("Enter the range: ");
        range = sc.nextInt();
        for(int i = 1; i <= range; i++){
            int x= num*i;
            System.out.println(num + "*" + i + "= "+ x );
        }
    }
}
