import java.util.Scanner;

public class StringToInt {
    public static long GetNumber(String number) {
        long result = 0;
        for (int i = 0; i < number.length(); i++) {
            result = result * 10 + number.charAt(i) - '0';
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 2 Integer Strings: ");
        String s1 = scan.next();
        String s2 = scan.next();
        long i1= GetNumber(s1);
        long i2 = GetNumber(s2);

//        System.out.println(i1);
//        System.out.println(i2);

        long prod = i1 * i2;

        StringBuilder sb = new StringBuilder();
        sb.append(prod);

        String result = sb.toString();
        System.out.println(result+ " is " + result.getClass().getSimpleName()+" type");
    }
}
