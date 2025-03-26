package hard;

import java.util.*;

public class MedianOfTwoSortedArray {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> numbers = new ArrayList<>();
        for (int i : nums1) {
            numbers.add(i);
        }
        for (int j : nums2) {
            numbers.add(j);
        }
        Collections.sort(numbers);

        if (numbers.size() % 2 != 0) {
            return Math.round(numbers.get((numbers.size() / 2)) * 100000.0) / 100000.0;
        }
        int midPositionLeft = numbers.get((numbers.size() / 2) - 1);
        int midPosition = numbers.get(numbers.size() / 2);
        double element = (double) (midPosition + midPositionLeft) / 2;
        return Math.round(element * 100000.0) / 100000.0;
    }


    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{0,0}, new int[]{0, 0}));
    }
}
