import java.util.*;

public class Part4 {
    private static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //4.1
        int[] arr = initArrayWithRandomInts(10, 10, 99);
        System.out.println(Arrays.toString(arr));
        System.out.println("Give num");
        int num = scanner.nextInt();
        System.out.println(checkContains(num, arr));

        //4.2
        System.out.println();
        int[] arr2 = initArrayWithRandomInts(10, 10, 99);
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("Sorted is\n" + Arrays.toString(arr2));

        //4.3
        System.out.println();
        int[] arr3 = initArrayWithRandomInts(10, 10, 99);
        System.out.println(Arrays.toString(arr3));
        Arrays.sort(arr3);
        reverseArray(arr3);
        System.out.println("Sorted in desc\n" + Arrays.toString(arr3));

        //4.4
        System.out.println();
        int[] arr4 = initArrayWithRandomInts(10, 10, 99);
        System.out.println(Arrays.toString(arr4));
        System.out.println("Give num");
        int num4 = scanner.nextInt();
        System.out.println("Index is " + findIndex(num4, arr4));

        //4.5
        System.out.println();
        int[][] matrix = initMatrixWithRandomInts(10, 15, 10, 99);
        printMatrix(matrix);
        System.out.println("Max is " + findMaxOfMatrix(matrix));

        //4.6
        System.out.println();
        int[][] matrix2 = initMatrixWithRandomInts(10, 15, 10, 99);
        printMatrix(matrix2);
        System.out.println("Give row index");
        int row = scanner.nextInt();
        System.out.println("Row sum is " + getSum(matrix2[row]));

        //4.7
        System.out.println();
        int[][] matrix3 = initMatrixWithRandomInts(10, 15, 10, 99);
        printMatrix(matrix3);
        int[][] rotated = rotateMatrix90Degrees(matrix3);
        System.out.println("\nRotated by 90degrees to clockwise");
        printMatrix(rotated);

        //4.8
        System.out.println();
        int[][] matrix4 = initMatrixWithRandomInts(10, 15, 10, 99);
        printMatrix(matrix4);
        int[][] rotated2 = rotateMatrix180Degrees(matrix4);
        System.out.println("\nRotated by 180degrees to clockwise");
        printMatrix(rotated2);

        //4.9
        System.out.println();
        int[][] matrix5 = initMatrixWithRandomInts(10, 15, 10, 99);
        printMatrix(matrix5);
        int[][] rotated3 = rotateMatrix270Degrees(matrix5);
        System.out.println("\nRotated by 270degrees to clockwise");
        printMatrix(rotated3);

        //4.10
        System.out.println();
        int[][] matrix6 = initMatrixWithRandomInts(5, 5, 10, 99);
        printMatrix(matrix6);
        int selection = 0;
        int[][] rotatedMatrix;
        while (selection != 4) {

            System.out.println(" ");
            System.out.println("———————- MENU —————-\n" +
                    "1 For rotating 90*\n" +
                    "2 For rotating 180*\n" +
                    "3 For rotating 270*\n" +
                    "4 For Exit\n");

            selection = scanner.nextInt();

            switch (selection) {
                case 1:
                    rotatedMatrix = rotateMatrix90Degrees(matrix6);
                    printMatrix(rotatedMatrix);
                    break;
                case 2:
                    rotatedMatrix = rotateMatrix180Degrees(matrix6);
                    printMatrix(rotatedMatrix);
                    break;
                case 3:
                    rotatedMatrix = rotateMatrix270Degrees(matrix6);
                    printMatrix(rotatedMatrix);
                    break;
                case 4:
                    selection = 4;
                    break;
            }
        }


    }

    private static int[] initArrayWithRandomInts(int length, int low, int high) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(high - low) + low;
        }
        return arr;
    }

    private static int[][] initMatrixWithRandomInts(int rows, int cols, int low, int high) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(high - low) + low;
            }
        }
        return matrix;
    }

    private static boolean checkContains(int num, int[] arr) {
        for (int value : arr) {
            if (value == num) {
                return true;
            }
        }
        return false;
    }

    private static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    private static int findIndex(int num, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    private static int findMaxOfMatrix(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int getSum(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }

    private static int[][] rotateMatrix90Degrees(int[][] matrix) {
        int[][] rotated = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                rotated[j][matrix.length - 1 - i] = matrix[i][j];
            }
        }
        return rotated;
    }

    private static int[][] rotateMatrix180Degrees(int[][] matrix) {
        int[][] rotated = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            reverseArray(matrix[i]);
            rotated[rotated.length - 1 - i] = matrix[i];
        }
        return rotated;
    }

    private static int[][] rotateMatrix270Degrees(int[][] matrix) {
        int[][] rotatedBy180 = rotateMatrix180Degrees(matrix);
        return rotateMatrix90Degrees(rotatedBy180);
    }
}
