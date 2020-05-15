import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.1
        int num1 = 74;
        int num2 = 36;
        System.out.println(num1 + num2);

        //1.2
        int n1 = 50;
        int n2 = 3;
        System.out.println(n1 / n2);

        //1.3
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + -3 * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);

        //1.4
        System.out.println("Give num1");
        int a = scanner.nextInt();
        System.out.println("Give num2");
        int b = scanner.nextInt();
        System.out.println(a * b);

        //1.5
        System.out.println("Give a number");
        int num = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num*i);
        }

        //1.6
        double r = 7.5;
        System.out.println("Perimeter is -" + 2 * Math.PI * r);
        System.out.println("Area is -" + Math.PI * r * r);

        //1.7
        System.out.println("Input a degree in Fahrenheit:");
        double fDegree = scanner.nextDouble();
        double cDegree = (fDegree - 32) * 5 / 9;
        System.out.println(fDegree + "degree Fahrenheit is equal to " + cDegree + "in Celsius");

        //1.8
        System.out.println("Input a value for inch:");
        double inchValue = scanner.nextDouble();
        System.out.println(inchValue + " inch is " + inchValue * 0.0254 + " meters");

        //1.9
        System.out.println("Input number");
        double input = scanner.nextDouble();
        if (input > 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative or 0");
        }

        //1.10
        System.out.println("Input the 1st number");
        int input1 = scanner.nextInt();
        System.out.println("Input the 2st number");
        int input2 = scanner.nextInt();
        System.out.println("Input the 3rd number");
        int input3 = scanner.nextInt();
        System.out.println("The greatest is " + Math.max(Math.max(input1, input2), input3));

        //1.11
        System.out.println("Input the 5 numbers ");
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            int n = scanner.nextInt();
            sum += n;
        }
        double avg = sum / 5;
        System.out.println("The sum of 5 no is : " + sum + "\n The Average is : " + avg);

        //1.12
        System.out.println("Input");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}