import java.util.Scanner;

class demo{
    demo(int num){
        int i;
        for(i=1; i<= num; i++){
            if(num%i == 0){
                System.out.println(i);
            }
        }
    }
}
 
public class Q27Factor {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num = sc.nextInt();
        demo f = new demo(num);

    }
}
