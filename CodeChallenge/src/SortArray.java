import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        char temp;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The String: ");
        String str= scan.nextLine();
        char[] chars = str.toCharArray();
        int len = str.length();

        for(int i = 0; i<len; i++){
            for (int j = i+1; j<len; j++){
                if (Character.toLowerCase(chars[i])>Character.toLowerCase(chars[j])){
                    temp = chars[i];
                    chars[i]= chars[j];
                    chars[j] = temp;

                }
            }
        }
        String num ="";
        String letter = "";
        //System.out.println(chars);
        for ( int i = 0; i< chars.length; i++){
            if(Character.isDigit(chars[i])){
                num = num + chars[i];
                continue;
            } else if (Character.isLetter(chars[i])) {
                letter = letter + chars[i];

            }

        }
        System.out.println(letter + num);


    }
}
