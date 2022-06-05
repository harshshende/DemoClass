import java.util.Scanner;

public class Q33UniqueElement {
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
        int unique= 0;
        for(i= 1; i<arr.length; i++){
            for(j=1; j<i; j ++){
                if(arr[i] == arr[j]){
                    break;
                }

            }
            if(i == j);
            unique++;
        }
        System.out.println(unique);

    }
}
