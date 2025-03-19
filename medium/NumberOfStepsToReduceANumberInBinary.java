package medium;

import java.math.BigInteger;

public class NumberOfStepsToReduceANumberInBinary {

    public static int numSteps(String s) {
        BigInteger decimal = new BigInteger(s, 2);
        int numberOfSteps = 0;

        while (!decimal.equals(BigInteger.ONE)) {
            if (decimal.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
                decimal = decimal.divide(BigInteger.TWO);
            } else {
                decimal = decimal.add(BigInteger.ONE);
            }
            numberOfSteps++;
        }

        return numberOfSteps;
    }


    public static void main(String[] args) {
        System.out.println(numSteps("10"));
    }

}
