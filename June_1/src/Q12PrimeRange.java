import java.util.Scanner;

public class Q12PrimeRange {
    public static void main(String[] args) {
        int upper, lower, i, j, temp;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Lower and Higher limit: ");
        lower= sc.nextInt();
        upper= sc.nextInt();
        System.out.println("Prime number between"+ lower + "and" + upper + "is: ");
        for(i= lower; i<= upper; i++){
            if(i==0 || i==1){
                continue;

            }
            temp= 1;
            for(j = 2; j<= i/2; ++j){
                if(i % j == 0){
                    temp = 0;
                    break;
                }
            }
            if(temp==1)
                System.out.println(i);
        }


    }
}
