import java.util.Scanner;

public class Q21ArmstrongBetweenInterval {
    public static void main(String[] args) {
        int lower, upper;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Lower and Upper Limits: ");
        lower = sc.nextInt();
        upper = sc.nextInt();
        for (int i = lower; i < upper; i++) {
            int check, rem, sum = 0;
            check = i;
            while (check != 0) {
                rem = check % 10;
                sum = sum + (rem * rem * rem);
                check = check / 10;
            }
            if (sum == i) {
                System.out.println("" + i + " is an Armstrong number.");
            }
        }
    }
}

