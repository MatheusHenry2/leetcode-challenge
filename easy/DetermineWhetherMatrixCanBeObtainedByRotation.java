package easy;

public class DetermineWhetherMatrixCanBeObtainedByRotation {

    public static boolean findRotation(int[][] mat, int[][] target) {
        /**
         * Rotates a square matrix 90 degrees clockwise.
         * Logic: newMatrix[j][N - 1 - i] = matrix[i][j];
         */
        for (int k = 0; k < 4; k++) {
            if (isMatrixEqual(mat, target)) {
                return true;
            }
            mat = rotate90(mat);
        }

        return false;
    }

    private static int[][] rotate90(int[][] mat) {
        int linhas = mat.length;
        int colunas = mat[0].length;
        int[][] newMatrix = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                newMatrix[j][linhas - 1 - i] = mat[i][j];
            }
        }
        return newMatrix;
    }

    private static boolean isMatrixEqual(int[][] matrix, int[][] target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[][] matrix = new int[2][2];
        matrix[0][0] = 0;
        matrix[0][1] = 1;
        matrix[1][0] = 1;
        matrix[1][1] = 0;

        int[][] target = new int[2][2];
        target[0][0] = 1;
        target[0][1] = 0;
        target[1][0] = 0;
        target[1][1] = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println(findRotation(matrix, target));

    }
}

