import java.util.*;
public class binary_search_java {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the value for array");
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }

        System.out.println(Arrays.binarySearch(arr,20));
        System.out.println(Arrays.binarySearch(arr, 0, 3, 25));
        System.out.println(Arrays.binarySearch(arr, 22));

    }
}
