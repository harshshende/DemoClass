import java.util.Scanner;

public class Q42StringReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string of digit: ");
        String s = sc.next();
        String output =  new String("");
        for(int i = 0; i < s.length();i++){

            if(Character.getNumericValue(s.charAt(i)) < 5){
               output +="0";
            }
            else
                output +="1";
        }
        System.out.println(output);

    }
}
