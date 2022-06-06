import java.util.Scanner;

public class Q37TopperNumber {
    public static void main(String[] args) {
        int n, sum= 0,sum1=0, d;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number: ");
        n = sc.nextInt();
        while(n>0){
            d = n%10;
            if(d%2 == 0){
                sum += d;

            }
            else {
                sum1 += d;
            }
            n= n/10;
        }
        if(sum == sum1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
