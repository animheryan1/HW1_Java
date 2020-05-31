import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Part5 {
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
//        //5.1
//        int num1 = random.nextInt();
//        int num2 = random.nextInt();
//        System.out.println(sum(num1, num2));
//
//        //5.2
//        int num3 = random.nextInt();
//        int num4 = random.nextInt();
//        System.out.println(product(num1, num2));
//
//        //5.3
//        System.out.println("give number");
//        int num5 = scanner.nextInt();
//        System.out.println("give second number");
//        int num6 = scanner.nextInt();
//        int product = product(num5, num6);
//        System.out.println("Cube of product is "+ cube(product));
//
//        //5.4
//        //from HW1.10
//        System.out.println("Input the 1st number");
//        int input1 = scanner.nextInt();
//        System.out.println("Input the 2st number");
//        int input2 = scanner.nextInt();
//        System.out.println("Input the 3rd number");
//        int input3 = scanner.nextInt();
//        System.out.println("The greatest is " + maxOfThree(input1, input2, input3));
//
//        //5.5
//        scanner.nextLine();
//        System.out.println("Inout string");
//        String text = scanner.nextLine();
//        System.out.println("Middle is "+ findMiddleChar(text));

//        //5.6
//        System.out.println("Give sentence");
//        String str = scanner.nextLine();
//        System.out.println("Word count is " + countWords(str));

//        //5.7
//        System.out.println("Enter a year");
//        int year = scanner.nextInt();
//        System.out.println("Is leap year: " + isLeapYear(year));
//
//        //5.8
//        System.out.println("Enter password");
//        String pass = scanner.nextLine();
//        System.out.println("Is valid: " + isValid(pass));

////        5.9
//        System.out.println("Give r");
//        int r = scanner.nextInt();
//        System.out.println("Perimeter is -" + getPerimeter(r));
//        System.out.println("Area is -" + getArea(r));

//        //5.10
//        System.out.println("Give first side of triangle");
//        int side1 = scanner.nextInt();
//        System.out.println("Give second side of triangle");
//        int side2 = scanner.nextInt();
//        System.out.println("Give third side of triangle");
//        int side3 = scanner.nextInt();
//
//        if (isValidTriangle(side1, side2, side3)) {
//            System.out.println("Perimeter is " + getPerimeter(side1, side2, side3));
//            System.out.println("Area is " + getArea(side1, side2, side3));
//        }

//        //5.11
//        int[] arr = new int[10];
//        initArrayWithRandomInts(arr);
//        printArr(arr);

//        //5.12
//        System.out.println();
//        int[] arr2 = new int[10];
//        initArrayWithRandomInts(arr2);
//        int[] sorted = sortAsc(arr2);
//        printArr(sorted);
//
//        //5.13
//        System.out.println();
//        int[] arr3 = new int[10];
//        initArrayWithRandomInts(arr3);
//        int[] sorted2 = sortDesc(arr2);
//        printArr(sorted2);
//
//        //5.14
//        printPrimeNumbers(100);
//        //5.15
//        System.out.println();
//        int[] arr4 = new int[10];
//        initArrayWithRandomInts(arr4);
//        reverseArray(arr4);
//        printArr(arr4);

//        //5.16
//        String str = "abba";
//        boolean isPalindrome = isPalindrome(str);
//        System.out.println("abba is palindrome? :" + isPalindrome);
//
//        //5.17
//        int factorial = calculateFactorial(5);
//        System.out.println("Factorial of 5 is " + factorial);

        //5.18
        System.out.println("Give size");
        int n = scanner.nextInt();
        char[][] matrix = new char[n][n];
        initMatrixRandomly(matrix);
        printMatrix(matrix);

        //5.19
        System.out.println("Give size");
        int n2 = scanner.nextInt();
        int[][] matrix2 = new int[n][n];
        initMatrixWithRandomInts(matrix2, 27, 78);
        rotateMatrix90Degrees(matrix2);
        rotateMatrix180Degrees(matrix2);
        rotateMatrix270Degrees(matrix2);

        //5.20
        int selection = 0;
        while (selection != 4) {
            System.out.println(" ");
            System.out.println("------------------MENU-------------\n" +
                    "Press 1 -  to print “Hello Word”\n" +
                    "Press 2 -  to print “Hello Vorld”\n" +
                    "Press 3 -  to print “Hello Uorld”\n" +
                    "Press 4 -  EXIT\n" +
                    "--------------------------------------------\n");

            selection = scanner.nextInt();

            switch (selection) {
                case 1:
                    System.out.println("Hello World");
                    break;
                case 2:
                    System.out.println("Hello Vorld");
                    break;
                case 3:
                    System.out.println("Hello Uorld");
                    break;
                case 4:
                    selection = 4;
                    break;
            }
        }

        //5.21
        System.out.println();
        System.out.println("give size");
        int n3 = scanner.nextInt();
        int[][] matrix7 = new int[n3][n3];
        initMatrixWithRandomInts(matrix7, 27, 78);
        int selection2 = 0;
        int[][] rotatedMatrix;
        while (selection2 != 4) {

            System.out.println(" ");
            System.out.println("———————- MENU —————-\n" +
                    "1 For rotating 90*\n" +
                    "2 For rotating 180*\n" +
                    "3 For rotating 270*\n" +
                    "4 For Exit\n");

            selection2 = scanner.nextInt();

            switch (selection2) {
                case 1:
                    rotatedMatrix = rotateMatrix90Degrees(matrix7);
                    printMatrix(rotatedMatrix);
                    break;
                case 2:
                    rotatedMatrix = rotateMatrix180Degrees(matrix7);
                    printMatrix(rotatedMatrix);
                    break;
                case 3:
                    rotatedMatrix = rotateMatrix270Degrees(matrix7);
                    printMatrix(rotatedMatrix);
                    break;
                case 4:
                    selection = 4;
                    break;
            }

        }
    }

    private static int sum(int n1, int n2) {
        return n1 + n2;
    }

    private static int product(int n1, int n2) {
        return n1 * n2;
    }

    private static int cube(int n1) {
        return (int) Math.pow(n1, 3);
    }

    private static int maxOfThree(int num1, int num2, int num3) {
        return Math.max(Math.max(num1, num2), num3);
    }

    private static char findMiddleChar(String text) {
        return text.charAt(text.length() / 2);
    }

    private static int countWords(String str) {
        return str.length() - str.replaceAll(" ", "").length() + 1;
    }

    private static boolean isLeapYear(int year) {
        boolean leap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leap = true;
                }
            } else {
                leap = true;
            }
        }
        return leap;
    }

    private static boolean isValid(String password) {
        if (password.length() < 10) return false;

        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (ch >= '0' && ch <= '9') {
                numCount++;
            } else if (Character.toUpperCase(ch) >= 'A' && Character.toUpperCase(ch) <= 'Z') {
                charCount++;
            } else return false;
        }

        return (charCount >= 2 && numCount >= 2);
    }

    private static double getPerimeter(int r) {
        return 2 * Math.PI * r;
    }

    private static double getArea(int r) {
        return Math.PI * r * r;
    }

    private static boolean isValidTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }

    private static int getPerimeter(int a, int b, int c) {
        return a + b + c;
    }

    private static double getArea(int a, int b, int c) {
        double p = (double) getPerimeter(a, b, c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    private static void initArrayWithRandomInts(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }
    }

    private static void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    private static int[] sortAsc(int[] arr) {
        int[] clone = arr.clone();
        Arrays.sort(clone);
        return clone;
    }

    private static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    private static int[] sortDesc(int[] arr) {
        int[] clone = arr.clone();
        Arrays.sort(clone);
        reverseArray(clone);
        return clone;
    }

    private static void printPrimeNumbers(int bound) {
        int num = 0;
        String primeNumbers = "";

        for (int i = 1; i <= bound; i++) {
            int count = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    count = count + 1;
                }
            }
            if (count == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println(primeNumbers);
    }

    private static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    private static int calculateFactorial(int num) {
        if (num == 1) {
            return 1;
        }
        return num * calculateFactorial(num - 1);
    }

    private static void initMatrixRandomly(char[][] matrix) {
        for (char[] row : matrix)
            Arrays.fill(row, '-');

        for (int i = 0; i < matrix.length; i++) {
            int x = random.nextInt(matrix.length);
            int y = random.nextInt(matrix[i].length);
            matrix[x][y] = '+';
        }
    }

    private static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    private static int[][] initMatrixWithRandomInts(int[][] matrix, int low, int high) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = random.nextInt(high - low) + low;
            }
        }
        return matrix;
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
