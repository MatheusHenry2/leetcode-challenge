package easy;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        String longestPrefix = strs[0];
        int sizeOfEachWord;
        for (int i = 1; i < strs.length; i++) {
            sizeOfEachWord = strs[i].length();
            for(int j=0; j < longestPrefix.length(); j++) {
                if(j >= sizeOfEachWord || longestPrefix.charAt(j) != strs[i].charAt(j)) {
                    longestPrefix = longestPrefix.substring(0, j);
                    break;
                }
            }
            if(longestPrefix.equals(" ")) {
                return " ";
            }
        }
        return longestPrefix;
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));

    }
}
