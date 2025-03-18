package easy;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    /*
     1 - First possibility: I could iterate through each number in the array.
         For example, starting with the first element, array[0], I would compare it with all the other elements in the array.
         If a duplicate is found, I remove it. By the end of the iteration, only the unique number k would remain because all duplicates were removed.
         *Time Complexity: O(N^2).

     2 - Second possibility: I could use a HashSet to store unique values.
         As I iterate through the array, I attempt to insert each value into the set.
         If a value is already present, it means it's a duplicate. Since the HashSet automatically handles uniqueness,
         by the end of the iteration, it will contain only the unique values.
         **Time Complexity: O(N)*.
    */

    public static int removeDuplicates(int[] nums) {
        Set<Integer> nonDuplicated = new LinkedHashSet<>();

        for (int i = 0; i < nums.length; i++) {
            nonDuplicated.add(nums[i]);
        }

        int index = 0;
        for (int num : nonDuplicated) {
            nums[index++] = num;
        }

        return nonDuplicated.size();
    }

    public static void main(String[] args) {
        int[] expectedNums = {1, 2, 2, 3};
        System.out.println("hello");
        System.out.println("duplicates" + removeDuplicates(expectedNums));
    }
}
