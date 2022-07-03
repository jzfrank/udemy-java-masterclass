import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your year of birth:");
//
//        boolean hasNextInt = scanner.hasNextInt();
//        if (hasNextInt) {
//            int yearOfBirth = scanner.nextInt();
//            scanner.nextLine(); // handle next line character (enter key)
//
//            System.out.println("Enter your name: ");
//            String name = scanner.nextLine();
//
//            int age = 2022 - yearOfBirth;
//
//            if (age >= 0 && age <= 100) {
//                System.out.println("Hello, " + name + " aged " + age + " years old ");
//            } else {
//                System.out.println("Invalid year of birth");
//            }
//        } else {
//            System.out.println("Unable to parse year of birth");
//        }
//        scanner.close();

//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        int cnt = 0;
//        while (cnt < 10) {
//            System.out.println("Enter " + (cnt+1) + "th number: ");
//            if (scanner.hasNextInt()) {
//                int number = scanner.nextInt();
//                cnt ++;
//                sum += number;
//            } else {
//                System.out.println("Invalid number");
//                scanner.nextLine(); // handle end of line (enter key)
//            }
//        }
//        System.out.println("Sum is " + sum);
//        scanner.close();

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number:");
            boolean isValid = scanner.hasNextInt();
            if (!isValid) {
                break;
            }
            int number = scanner.nextInt();
            maximum = Math.max(maximum, number);
            minimum = Math.min(minimum, number);

            scanner.nextLine(); // handle input 
        }
        System.out.println("Maximum: " + maximum + "  Minimum: " + minimum);
        scanner.close();
    }
}