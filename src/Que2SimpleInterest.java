import java.util.Scanner;
public class Que2SimpleInterest {
    public static void main(String[] args) {
        float p,t, si, amount;
        float r = 7.5f;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Principal: ");
        p = s.nextFloat();
        System.out.println("Enter the Time Period");
        t = s.nextFloat();
        si = (r * t * p) / 100;
        amount= p + si;
        System.out.println("The simple Interest is: " + si);
        System.out.println("The Final amount is to be Paid: " + amount);

    }

}
