import java.util.Scanner;

public class Q17PalindromeNumber {
    public static void main(String[] args) {
        int num, number,  sum = 0, temp;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number: ");
        num= sc.nextInt();
        number= num;
        while(number !=0){
            temp= number%10;
            sum = sum * 10 + temp;
            number /= 10;
        }
        if(num == sum)
            System.out.println(num+ " is Panlindrome");
        else
            System.out.println(num+ " is not Palindrome");
    }
}
