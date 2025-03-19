package easy;

public class StoneRemovalGame {

    public static boolean canAliceWin(int n) {
        boolean whoWin = true;

        if (n == 10) return true;
        else if (n < 10) return false;

        else {
            int stonesValue, totalToRemoveByTurn = 9;
            stonesValue = n - 10;

            for (int i = 0; i < n; i++) {
                if (totalToRemoveByTurn <= stonesValue) {
                    stonesValue = stonesValue - totalToRemoveByTurn;
                    totalToRemoveByTurn = totalToRemoveByTurn - 1;
                    if(i % 2 ==0 ){
                        whoWin = false;
                    }
                    else {
                        whoWin = true;
                    }
                } else break;
            }
            System.out.println(stonesValue);

        }
        return whoWin;
    }

    public static void main(String[] args) {
        System.out.println(canAliceWin(12));
    }
}
