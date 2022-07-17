import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = scan.nextInt();
        ArrayList<Integer> L1 = new ArrayList<Integer>();
        System.out.println("enter the number" );
        while(L1.size() != n){
            int i = scan.nextInt();
            L1.add(i);
        }
        System.out.println("The original List: " + L1);
        HashSet<Integer> setlist = new HashSet<>(L1);
        System.out.println("The List without Duplicate: "+setlist);
    }
}
