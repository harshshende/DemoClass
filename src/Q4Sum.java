import java.util.Scanner;

public class Q4Sum {
    public static void main(String[] args) {
        int num, sum, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();
        int firstDigit = 0;
        int lastDigit = 0;

        lastDigit = num%10;
        temp = num%10;
        temp = num/10;
        temp = temp%10;
        temp = num/10;
        firstDigit = temp/10;
        sum = firstDigit + lastDigit;
        System.out.println(sum);

    }
}
