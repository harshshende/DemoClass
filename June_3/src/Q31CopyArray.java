import java.util.Scanner;

public class Q31CopyArray {
    public static void main(String[] args) {
        int n, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Elements: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter" + n + " Elements");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int arr2[] = new int[arr.length];
        System.out.println("Element in new array");
        for (i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
            System.out.println(arr2[i]);
        }


    }
}
