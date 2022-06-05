import java.util.Scanner;

public class Q6GrossSalary {
    public static void main(String[] args) {
        double basic, DA, TA, HRA, PF, Bonus, gross;
        Scanner sc = new Scanner(System.in);;
        System.out.println("Enter Basic Salary: ");
        basic = sc.nextDouble();
        DA = 0.10 * basic;
        TA = 0.15 * basic;
        HRA = 0.2 * basic;
        PF = 0.12 * basic;

        if(basic >= 20000){
            Bonus = 0.1 * basic;
        }
        else {
            Bonus = 0.2 * basic;
        }

        gross = basic + TA + DA + HRA + Bonus - PF;
        System.out.println("Gross Salary is: "+ gross);

    }
}

