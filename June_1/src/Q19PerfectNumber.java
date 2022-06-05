import java.util.Scanner;

public class Q19PerfectNumber {
    public static void main(String[] args) {
        int i, num, sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number: ");
        num= sc.nextInt();
        for(i=1; i<num; i++){
            if(num%i ==0){
                sum +=i;

            }
        }
        if(sum==num)
            System.out.println(num + " is a Perfect Number");
        else
            System.out.println(num + " is not a Perfect Number");
    }
}
