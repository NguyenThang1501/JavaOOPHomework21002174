public class Test {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        Matrix.createRandomMatrix(matrix);
        int[][] matrix1 = Matrix.createRandomMatrix(3, 4);
        System.out.println("Matrix1:");
        Matrix.inputMatrix(matrix1);
        int[][] matrix2 = Matrix.createRandomMatrix(4, 3);
        System.out.println("Matrix2:");
        Matrix.inputMatrix(matrix2);
        int[][] matrix3 = Matrix.createRandomMatrix(3, 4);
        System.out.println("Matrix3:");
        Matrix.inputMatrix(matrix3);
        if (Matrix.haveSameDimension(matrix1, matrix3)) {
            int[][] sumMatrix = Matrix.add(matrix1, matrix3);
            int[][] subtractMatrix = Matrix.subtract(matrix1, matrix3);
            System.out.println("Matrix1 + Matrix3 = ");
            Matrix.inputMatrix(sumMatrix);
            System.out.println("Matrix1 - Matrix3 = ");
            Matrix.inputMatrix(subtractMatrix);
        } else {
            System.out.println("Tow matrix do not have the same dimension");
        }
        if (matrix1.length == matrix2[0].length) {
            int[][] multiplyMatrix = Matrix.multiply(matrix1, matrix2);
            System.out.println("Matrix1 x Matrix2 = ");
            Matrix.inputMatrix(multiplyMatrix);
        } else {
            System.out.println("Can not multiply two matrix");
        }
    }
}
