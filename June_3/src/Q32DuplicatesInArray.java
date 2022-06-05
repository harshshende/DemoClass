import java.util.Scanner;

public class Q32DuplicatesInArray {
    public static void main(String[] args) {
        int n, i=0, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Elements: ");
        n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter" + n + " Elements");
        for(i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int count= 0;
        for(i = 1; i < arr.length; i++){
            for(j=i+1; j< arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);



    }

}
