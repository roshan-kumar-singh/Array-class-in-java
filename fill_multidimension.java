import java.util.*;
public class fill_multidimension {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        for (int[] row : arr) {
            Arrays.fill(row, 1);
            System.out.println(Arrays.toString(arr));
        }
    }
}
