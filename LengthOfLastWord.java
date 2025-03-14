public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        int lengthOfLastWord = 0;
        int lastIndexCharOccurrence = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                lastIndexCharOccurrence = i;
            }
        }

        for (int j = lastIndexCharOccurrence; j >= 0; j--) {
            if (s.charAt(j) == ' ') {
                break;
            }
            lengthOfLastWord++;
        }

        return lengthOfLastWord;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("a"));
    }
}
