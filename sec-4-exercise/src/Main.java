public class Main {
    public static void main(String[] args) {
//        System.out.println( isLeapYear(-1600) );
//        System.out.println( isLeapYear(1600) );
//        System.out.println( isLeapYear(2017) );
//        System.out.println( isLeapYear(2000) );
//        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));

//        System.out.println(hasTeen(9, 99, 19));
//        System.out.println(hasTeen(23, 15, 42));
//        System.out.println(hasTeen(22, 23, 34));

//        System.out.println(area(5.0));
//        System.out.println(area(-1));
//        System.out.println(area(5.0,4.0));
//        System.out.println(area(-1.0,4.0));

//        printYearsAndDays(525600);
//        printYearsAndDays(1051200);
//        printYearsAndDays(561600);

//        printEqual(1,1,1);
//        printEqual(1,1,2);
//        printEqual(-1,-1,-1);
//        printEqual(1,2,3);

        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,36));
        System.out.println(isCatPlaying(false,35));

    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int lowerLimit = 25;
        int upperLimit = summer ? 45 : 35;
        return temperature >= lowerLimit && temperature <= upperLimit;
    }

    public static void printEqual(int num1, int num2, int num3) {
        if (num1 < 0 || num2 < 0 || num3 < 0) {
            System.out.println("Invalid Value");
        }
        else if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        } else if (num1 != num2 && num1 != num3 && num2 != num3) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long YEAR2MINUTES = 525600;
        long DAY2MINUTES = 1440;
        long years = minutes / YEAR2MINUTES;
        long days = (minutes % YEAR2MINUTES) / DAY2MINUTES;

        String message = (minutes + " min = " + years + " y and " + days + " d");
        System.out.println(message);
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return Math.PI * radius * radius;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        }
        return x * y;
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        }
        return false;
    }

    public static boolean isLeapYear(int year) {
        if (!(year >= 1 && year <= 9999)) {
            return false;
        }
        boolean res = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    res = true;
                }
            } else {
                res = true;
            }
        } else {
            res = false;
        }
        return res;
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        return (int) (num1 * 1000) == (int) (num2 * 1000);
    }

    public static boolean hasEqualSum(int num1, int num2, int num3) {
        return (num1 + num2) == num3;
    }

    public static boolean hasTeen(int age1, int age2, int age3) {
        return isTeen(age1) || isTeen(age2) || isTeen(age3);
    }

    public static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }
}