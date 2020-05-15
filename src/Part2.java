import java.util.Random;
import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        //2.1
        int randomNumber1 = random.nextInt(90) + 10;
        int randomNumber2 = random.nextInt(90) + 10;
        int sum = randomNumber1 + randomNumber2;
        long l = sum;
        System.out.println(l);

        //2.2
        int rNumber1 = random.nextInt(90) + 10;
        int rNumber2 = random.nextInt(90) + 10;
        int product = rNumber1 * rNumber2;
        if (product % 2 == 0) {
            long l1 = product;
        } else {
            double d = product;
        }
        System.out.println(product);

        //2.3
        int rN = random.nextInt(90) + 10;
        double square = Math.pow(rN, 2);
        String str = String.valueOf(square);
        System.out.println(str);

        //2.4
        System.out.println("Input");
        int a = sc.nextInt();
        int randomInt;
        if (a > 100) {
            randomInt = random.nextInt(a - 50) + 50;
        }else{
            randomInt = random.nextInt(a);
        }
        String str2 = String.valueOf(randomInt);
        System.out.println(str2);

        //2.5
        System.out.println("Input num1");
        int num1 = sc.nextInt();
        System.out.println("Input num2");
        int num2 = sc.nextInt();
        System.out.println("Input operator +, -, * or /");
        sc.nextLine();
        String operator = sc.nextLine();
        double result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        System.out.println(result);

        //2.6
        System.out.println("Give weekday number");
        int num = sc.nextInt();
        String day;
        switch (num) {
            case 1:
                day = "monday";
                break;
            case 2:
                day = "tuesday";
                break;
            case 3:
                day = "wednesday";
                break;
            case 4:
                day = "thursday";
                break;
            case 5:
                day = "friday";
                break;
            case 6:
                day = "saturday";
                break;
            case 7:
                day = "sunday";
                break;
            default:
                day = "someday";
        }
        System.out.println(day);

        //2.7
        System.out.println("Give month name");
        sc.nextLine();
        String monthName = sc.nextLine();
        switch (monthName.toLowerCase()) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                System.out.println(31);
                break;
            case "february":
                System.out.println(28);
                break;
            case "april":
            case "june":
            case "september":
            case "november":
                System.out.println(30);
                break;
            default:
                System.out.println(0);
        }

        //2.8
        System.out.println("------------MENU-----------\n" +
                "---> enter 1 for calculating area of the circle\n" +
                "---> enter 2 for calculating perimeter of the circle\n" +
                "---> enter 3 for exit.\n");
        int choice = sc.nextInt();
        int r = 5;
        switch (choice) {
            case 1:
                System.out.println("Area is " + Math.PI * r * r);
                break;
            case 2:
                System.out.println("Perimeter is " + 2 * Math.PI * r);
                break;
            case 3:
                System.out.println("Exiting...");
                break;
        }

    }
}
