package easy;

import java.util.Arrays;

public class RunningSumOf1dArray {

    public static int[] runningSum(int[] nums) {
        if (nums.length == 1) return nums;

        else {
            int[] sumArray = new int[nums.length];
            int sumUntilPosition = 0;
            int putInCorrectPosition = 0;
            int sum = 0;
            while (sumUntilPosition < nums.length) {
                sumUntilPosition = sumUntilPosition + 1;
                for (int i = 0; i < sumUntilPosition; i++) {
                    System.out.println(nums[i]);
                    sum = sum + nums[i];
                }
                sumArray[putInCorrectPosition] = sum;
                putInCorrectPosition = putInCorrectPosition + 1;
                sum = 0;
            }
            return sumArray;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[]{1,2,3,4})));
    }
}
