import java.util.InputMismatchException;
import java.util.Scanner;

public class Q40ErrorException {
    public static void main(String[] args) {
        int x,y;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the Number: ");

        try{
            x = scan.nextInt();
            y = scan.nextInt();
            int res = x/y;
            System.out.println("Division = " + res);
        }
        catch (InputMismatchException e){
            System.out.println(e);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
