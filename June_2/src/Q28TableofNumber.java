import java.util.Scanner;

public class Q28TableofNumber {
    static void MultiplicationTable(int num, int i)
    {
        System.out.print("\n");
        System.out.print(num+" X "+i+" = "+num*i);
        if(i<10)
            MultiplicationTable(num, i+1);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num;
        System.out.print("Enter a number:");
        num=scan.nextInt();
        System.out.print("Multiplication Table of "+num+" is:");
        MultiplicationTable(num, 1);

    }
}

