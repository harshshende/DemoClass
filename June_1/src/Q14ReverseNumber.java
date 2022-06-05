import java.util.Scanner;

public class Q14ReverseNumber {
    public static void main(String[] args) {
        int num, digit;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the Number: ");
        num= sc.nextInt();
        int reversed=0;
        while(num != 0) {
            digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
