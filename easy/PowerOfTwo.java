package easy;

public class PowerOfTwo {

    public static boolean isPowerOfTwo(int n) {
        for (long i = 0; i < n; i++) {
            if ((long) Math.pow(2, i) == n) return true;
            else if ((long) Math.pow(2, i) > n) break;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(4));
    }
}
