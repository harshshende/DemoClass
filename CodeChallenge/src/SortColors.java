import java.util.Scanner;

public class SortColors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int len = scan.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter " + len + " number of elements: ");
        for (int i = 0; i < len; i++) {
            int x = scan.nextInt();
            if(x != 0 || x!=1 || x!=2){
                break;
            }
            else
                arr[i] = x;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            System.out.println(arr[i]);

        }
    }
}
