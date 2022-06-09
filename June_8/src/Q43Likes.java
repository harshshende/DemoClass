import java.util.Scanner;

public class Q43Likes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of name: " );
        int len = sc.nextInt();
        String []names = new String[len];

        if(names.length == 0){
            System.out.println("no one likes this");
        }
        else{
            System.out.println("Enter the Names");
            for (int i = 0; i < len; i++) {
                names[i] = sc.next();
            }
            if(names.length == 1){
                System.out.println(names[0] + " likes this");
            }
            else if(names.length == 2){
                System.out.println(names[0]+" and "+ names[1] + " likes this");
            }
            else if(names.length == 3){
                System.out.println(names[0]+","+ names[1] +" and "+names[2]+ " likes this");
            }
            else if(names.length == 4){
                System.out.println(names[0]+","+ names[1]+ " and "+ (names.length - 2)+" others likes this");
            }
            else
                System.out.println(names[0]+","+ names[1]+ " and "+ (names.length - 2)+" others likes this");
        }


    }
}

