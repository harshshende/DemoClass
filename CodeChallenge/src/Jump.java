import java.util.Scanner;

public class Jump {
    public static boolean CanJump(int[] num) {
        int jump = 0;
        for (int i = 0; i < num.length; i++)
        {
            if (jump < i)
            {
                break;
            }
            if (jump < i + num[i])
            {
                jump = i + num[i];
            }
            if (jump >= num.length - 1)
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the length of array: ");
        int len = scan.nextInt();
        int arr[] = new int[len];
        System.out.println("enter the array elements: ");
        for(int i = 0; i<len; i++){
            arr[i] = scan.nextInt();
        }
        boolean result = CanJump(arr);
        System.out.println(result);

    }
}
