import java.util.Scanner;

public class Q34SecondLargest {
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
        n = arr.length;
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (i = 0; i < n; i++) {
            if (arr[i] > highest) {
                secondHighest = highest;
                highest = arr[i];
            }
            if (arr[i] < highest && arr[i] > secondHighest) {
                secondHighest = arr[i];
            }
        }
        System.out.println("Second highest " + secondHighest);
    }
}
