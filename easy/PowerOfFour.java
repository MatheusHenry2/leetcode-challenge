package easy;

public class PowerOfFour {

    public static boolean isPowerOfFour(int n) {

        for (long i = 0; i < n; i++) {
            if (Math.pow(4, i) == n) return true;
            else if (Math.pow(4, i) > n) break;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(5));
    }
}
