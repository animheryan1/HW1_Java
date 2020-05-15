import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Part3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //3.1
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }

        //3.2
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }

        //3.3
        for (int i = 0; i <= 80; i += 2) {
            System.out.println(i-20);
        }

        //3.4
        for (int i = 1; i <= 80; i += 2) {
            System.out.println(i-20);
        }

        //3.5
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum+=i;
        }
        System.out.println(sum);

        //3.6
        int sum1 = 0;
        for (int i = 1; i <= 100; i+=2) {
            sum1 += i;
        }
        System.out.println(sum);

        //3.7
        int sum2 = 0;
        int count = 0;
        for (int i = 0; i <= 100; i += 2) {
            sum2 += i;
            count++;
        }
        System.out.println(sum / count);

        //3.8
        System.out.println("Input the 10 numbers ");
        double sum3 = 0;
        for (int i = 0; i < 5; i++) {
            int n = scanner.nextInt();
            sum3 += n;
        }
        double avg = sum3 / 5;
        System.out.println("The sum of 5 no is : " + sum + "\n The Average is : " + avg);

        //3.9
        System.out.println("Input number of terms");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println("Number is : " + i + " and cube of the " + i + " is :" + Math.pow(i, 3));
        }

        //3.10
        //see problem 1.5))

        //3.11
        System.out.println("Give num");
        int num2 = scanner.nextInt();
        if (num2 == 1) {
            System.out.println(num2 + " is not prime");
        }
        for (int i = 2; i < Math.sqrt(num2); i++) {
            if (num2 % i == 0) {
                System.out.println(num2 + " is not prime");
            }
        }
        System.out.println(num2 + " is prime number");

        //3.12
        System.out.println("Give number");
        int n = scanner.nextInt();
        int[] fibArr = new int[n];
        fibArr[0] = 0;
        fibArr[1] = 1;
        for (int i = 2; i < n; i++) {
            fibArr[i] = fibArr[i - 1] + fibArr[i - 2];
        }
        System.out.println(Arrays.toString(fibArr));

        //3.13
        String str = "ROBOTS_WILL_KILL_ALL_HUMANZ";
        int len = str.length();
        StringBuilder reverse = new StringBuilder(len);
        for (int i = (len - 1); i >= 0; i--) {
            reverse.append(str.charAt(i));
        }

        System.out.println(reverse.toString());

        //3.14
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        //3.15
        int[] arr2 = new int[4];
        for (int i = 0; i < 4; i++) {
            arr2[i] = random.nextInt();
        }
        for (int i = 3; i >= 0; i--) {
            System.out.println(arr2[i]);
        }

        //3.16
        int[] arr3 = new int[4];
        int sum4 = 0;
        for (int i = 0; i < 4; i++) {
            arr3[i] = random.nextInt();
            sum += arr3[i];
        }
        System.out.println(sum4);

        //3.17
        int[] arr4 = new int[4];
        int[] copyArr = new int[arr4.length];
        for (int i = 0; i < 4; i++) {
            arr4[i] = random.nextInt();
            copyArr[i] = arr4[i];
        }

        //3.18
        int[] arr5 = new int[4];
        for (int i = 0; i < 4; i++) {
            arr5[i] = random.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Min is "+ arr5[0]);
        System.out.println("Max is "+ arr5[arr.length-1]);
    }

}

