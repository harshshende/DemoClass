import java.util.Scanner;

public class ColumnName {
    public static void main(String[] args) {
        String Column;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the Column: ");
        Column= scan.nextLine();

        int res= 0;
        int ch;
        for(int i=0;i<Column.length(); i++) {
            ch = Column.charAt(i)-64;
            res = res * 26 + ch;
        }
        System.out.println(res);
        
    }
}
