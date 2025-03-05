public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        String normalString = String.valueOf(x);
        String reverseString = "";
        for (int i = normalString.length() - 1; i >= 0; i--){
            reverseString = reverseString + normalString.charAt(i);
        }
        return (normalString.equals(reverseString));
    }

    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println(isPalindrome(10));

    }
}
