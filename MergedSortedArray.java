import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergedSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) return;

        List<Integer> finalNumbers = new ArrayList<>();
        int positionToChanged = 0;

        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] == 0 && positionToChanged < n) {
                finalNumbers.add(nums2[positionToChanged]);
                positionToChanged++;
            } else {
                finalNumbers.add(nums1[i]);
            }
        }

        for (int i = 0; i < finalNumbers.size(); i++) {
            nums1[i] = finalNumbers.get(i);
        }

        Arrays.sort(nums1);
    }


    public static void main(String[] args) {
//        System.out.println(merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3));
    }
}
