import java.util.Scanner;

public class Q11PrimeNumber {
    public static void main(String[] args) {
        int i, num;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number: ");
        num = sc.nextInt();
        int count = 0;

        if(num<2){
            System.out.println("The number is Prime: ");
        }
        for(i= 1; i<= num; i++)
        {
            if(num%i==0){
                count++;
                break;
            }

        }
        if(count ==0)
            System.out.println("It is Prime Number");
        else
            System.out.println("It is not Prime Number");
    }
}
