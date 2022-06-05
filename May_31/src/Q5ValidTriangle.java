import java.util.Scanner;

public class Q5ValidTriangle {
    public static void main(String[] args) {
        int ang1, ang2, ang3, total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Triangle Angles: ");
        ang1 = sc.nextInt();
        ang2 = sc.nextInt();
        ang3 = sc.nextInt();
        total = ang1 + ang2 + ang3;
        if(total == 180){
            System.out.println("It is valid Triangle");
        }
        else{
            System.out.println("It is not Valid Triangle");
        }
    }
}
