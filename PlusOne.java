import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1] += 1;
        } else {
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] == 9) {
                    digits[i] = 0;

                } else {
                    digits[i] += 1;
                    return digits;
                }
            }
            digits = new int[digits.length + 1];
            for (int i = 0; i < digits.length - 1; i++) {
                if (i == 0) digits[i] = 1;
                else digits[i] = 0;
            }

        }
        return digits;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9, 9})));
    }
}
