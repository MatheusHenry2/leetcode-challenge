package easy;


import java.util.Arrays;

public class SquaresOfSortedArray {

    public static int[] sortedSquares(int[] nums) {



        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.pow(nums[i], 2); //0(N)
        }
        Arrays.sort(nums);                         //n (log(n)
        return nums;
    }

    public static  void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4, -1, 0, 3, 10})));
    }

}
