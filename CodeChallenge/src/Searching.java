import java.util.Scanner;

public class Searching {
    public static int Search(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;

        while(left <= right){
            int mid = (left +right)/2;
            if(nums[mid] == target)
                return mid;

            else if(nums[left] <= nums[mid]){
                if(nums[left] <= target && nums[mid] > target){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }
            else if(nums[mid] <= nums[right] ){
                if(nums[mid] < target && nums[right] >= target){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the Length of array: ");
        int len = scan.nextInt();
        int arr[]= new int[len];
        System.out.println("enter " + len + " elements");
        for(int i = 0; i<len; i++){
            arr[i]= scan.nextInt();
        }
        System.out.println("Enter the Target: ");
        int target = scan.nextInt();
        int i = Search(arr, target);
        if(i == -1){
            System.out.println(false);
        }
        else
            System.out.println(true);
    }
}
