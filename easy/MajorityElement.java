package easy;


import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> majority = new HashMap<>();
        Integer maiorValor = 0;
        Integer key = 0;

        for (int num : nums) {
            if (majority.containsKey(num)) {
                Integer elementMajority = majority.get(num);
                majority.replace(num, (elementMajority + 1));
            } else {
                majority.put(num, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : majority.entrySet()) {
            if(entry.getValue() > maiorValor) {
                maiorValor = entry.getValue();
                key = entry.getKey();
            }
        }
        return key;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3};

        System.out.println(majorityElement(nums));
    }
}
