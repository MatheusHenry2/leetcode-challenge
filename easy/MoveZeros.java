package easy;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeros {

    //(0,1,0,3,12)

    public static void moveZeroes(int[] nums) {
        int zeroQuantity = 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int num : nums) {
            if (num != 0) {
                numbers.add(num);
            } else {
                zeroQuantity++;
            }
        }
        if (zeroQuantity != 0) {
            for (int i = 0; i < zeroQuantity; i++) {
                numbers.add(0);
            }
            for (int i = 0; i < nums.length; i++) {
                nums[i] = numbers.get(i);
            }
        }
    }

    public static void main(String[] args) {
        moveZeroes(new int[]{0, 1, 0, 3, 12});
    }
}
