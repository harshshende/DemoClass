import java.util.Scanner;

public class Q24FindXPowerY {
    public static void main(String[] args) {
        int x,y;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number for X: ");
        x= scan.nextInt();
        System.out.println("Entre the number for y: ");
        y= scan.nextInt();
        long result= 1;
        for(; y != 0; --y){
            result *= x;
        }
        System.out.println("The result is "+ result);

    }
}
