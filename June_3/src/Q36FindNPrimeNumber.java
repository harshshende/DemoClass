import java.util.Scanner;

public class Q36FindNPrimeNumber {
    public static void main(String[] args) {
        int n, num = 0, count, i;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n for nth prime number: ");
        n = scan.nextInt();
        count = 0;

        while(count < n){
            num += 1;
            for (i = 2; i<= num; i++){
                if(num % i == 0){
                    break;
                }
            }
            if(i == num){
                count += 1;
            }

        }
        System.out.println("The nth Prime number is : "+ num);

    }
}

