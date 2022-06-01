import java.util.Scanner;
public class Q3ReverseNumber {
    public static void main(String arg[])
    {
        int num, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER:-");
        num = sc.nextInt();
        System.out.println("BEFORE REVERSE VALUE IS:- "+num);
        System.out.print("AFTER REVERSE RESULT IS:- ");
        temp = num%10;
        System.out.print(temp);
        temp = num/10;
        temp = temp%10;
        System.out.print(temp);
        temp = num/10;
        temp = temp/10;
        System.out.print(temp);
    }
}

