package easy;

import java.util.ArrayList;

public class FindTheDifference {

    public static char findTheDifference(String s, String t) {
        if (s.length() == 1 && t.length() == 1) {
            return t.charAt(0);
        } else {
            ArrayList<Integer> asciiSumFirstString = new ArrayList<>();
            ArrayList<Integer> asciiSumSecondString = new ArrayList<>();

            for (int i = 0; i < s.length(); i++) {
                asciiSumFirstString.add((int) s.charAt(i));
            }

            for (int i = 0; i < t.length(); i++) {
                asciiSumSecondString.add((int) t.charAt(i));
            }
            return (char) (asciiSumSecondString.stream().mapToInt(Integer::intValue).sum() -
                    asciiSumFirstString.stream().mapToInt(Integer::intValue).sum());
        }
    }

    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abcde"));
    }
}
