import java.util.Scanner;

public class MaxProfit {
    public static void main(String[] args) {
        int n, i, j = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Elements: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " Elements");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int profit = 0;
        for (i = 0; i < n-1; i++) {
            for (j = i + 1; j < n; j++) {
                int diff = arr[j] - arr[i];
                if (diff > profit) {
                    profit = diff;
                }
            }
        }
        System.out.println("The Max Profit is: "+profit);
    }
}
