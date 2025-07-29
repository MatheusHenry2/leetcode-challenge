package easy;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> numbers = new HashMap<>();

        for (int num : nums) {
            if (numbers.containsKey(num)) {
                numbers.remove(num);
            } else {
                numbers.put(num, num);
            }
        }
        return numbers.values().iterator().next();
    }


    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1, 2, 3, 2, 3}));
    }
}
