public class Matrix {
    public static void inputMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void createRandomMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = (int) (Math.random() * 100);
            }
        }
    }

    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = (int) (Math.random() * 100);
            }
        }
        return matrix;
    }

    public static boolean haveSameDimension(int[][] matrix1,
                                            int[][] matrix2) {
        if ((matrix1.length == matrix2.length) && (matrix1[0].length == matrix2[0].length)) {
            return true;
        }
        return false;
    }

    public static boolean haveSameDimension(double[][] matrix1,
                                            double[][] matrix2) {
        if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length) {
            return true;
        }
        return false;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        int[][] addMatrix = new int[matrix1.length][matrix1[0].length];
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[0].length; col++) {
                addMatrix[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }
        return addMatrix;
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        double[][] addMatrix = new double[matrix1.length][matrix1[0].length];
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[0].length; col++) {
                addMatrix[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }
        return addMatrix;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        int[][] subtractMatrix = new int[matrix1.length][matrix1[0].length];
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[0].length; col++) {
                subtractMatrix[row][col] = matrix1[row][col] - matrix2[row][col];
            }
        }
        return subtractMatrix;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        double[][] subtractMatrix = new double[matrix1.length][matrix1[0].length];
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[0].length; col++) {
                subtractMatrix[row][col] = matrix1[row][col] - matrix2[row][col];
            }
        }
        return subtractMatrix;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int[][] multiplyMatrix = new int[matrix1.length][matrix2[0].length];
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix2[0].length; col++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    multiplyMatrix[row][col] += matrix1[row][k] * matrix2[k][col];
                }
            }
        }
        return multiplyMatrix;
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        double[][] multiplyMatrix = new double[matrix1.length][matrix2[0].length];
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix2[0].length; col++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    multiplyMatrix[row][col] += matrix1[row][k] * matrix2[k][col];
                }
            }
        }
        return multiplyMatrix;
    }
}




