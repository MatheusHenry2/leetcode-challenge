package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Twosum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numbers.containsKey(nums[i])) {
                return new int[]{numbers.get(nums[i]), i};
            }
            int necessaryKey = target - nums[i];
            numbers.put(necessaryKey, i);
        }
        return nums;
    }
    /**
     * (2,7,11,15)
     * Necessary key  = target - 2 = 7. -> map (7,0)
     * Necessary key = (7, contains map) true
     * so we return, the value map and the i index.
     *
     * @param args
     */
    /**
     * (2,7,11,15,17) -> target = 21.
     *  Necessary key -> 21 - 2 = 19; map (19. 0)   Map final(19,0), (14,1), (10,2), (6,3), (4.4)
     *  if (7 == contains map) false
     *  Necessary key -> 21 - 7 = ; map(14, 1)
     *  if(11 == contains map) false
     *  Necessary key -> 21 - 11 = map(10,2)
     *  if(15 contains map) false
     *  Necessary key -> 21 - 15 = map (6,3)
     *  if 17 contains map false
     *  Necessary key = 21- 17 = map(4,4)
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}
