import java.util.Scanner;

public class Q30ReverseArray {
    public static void main(String[] args) {
        int n, i, j=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Elements: ");
        n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter" + n + " Elements");
        for(i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int rev[] = new int[n];
        System.out.println("Reverse Array is: ");
        for(i=n; i>0; i--, j++){
            rev[j]= arr[i-1];
            System.out.println(rev[j]);
        }

    }
}
