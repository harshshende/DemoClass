import java.util.Scanner;

public class Q7CompanyInsurance {
    public static void main(String[] args) {
        int age;
        char gender, marital_status;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age: ");
        age = sc.nextInt();
        System.out.println("Enter the gender(M/F): ");
        gender = sc.next().charAt(0);
        System.out.println("Enter the Marital Status(M/N)");
        marital_status =sc.next().charAt(0);

        if(marital_status == 'M'){
            System.out.println("The Driver is insured");
        }
        else if(gender == 'M' && age > 30 && marital_status == 'N' ){
            System.out.println("The Driver is insured");
        }
        else if(gender == 'F' && age > 25 && marital_status == 'N' ){
            System.out.println("The Driver is insured");
        }
        else{
            System.out.println("The Driver is Not Insured");
        }


    }
}
