import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        while (true){
            System.out.println("Enter the number");
            String s = scan.nextLine();
            System.out.println("Enter your Choice: ");
            int index = scan.nextInt();
            Validate isvalid = new Validate();
            boolean x = isvalid.validnum(s, index);

            if(s.equals("q")){
                break;
            }
            if (x == true) {
                NumSysCalculation numbersys = new NumSysCalculation();
                numbersys.convetor(s, index);
            } else
                System.out.println("Invalid Number");
        }
    }
}
