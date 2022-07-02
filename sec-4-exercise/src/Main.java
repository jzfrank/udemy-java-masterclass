public class Main {
    public static void main(String[] args) {
//        System.out.println( isLeapYear(-1600) );
//        System.out.println( isLeapYear(1600) );
//        System.out.println( isLeapYear(2017) );
//        System.out.println( isLeapYear(2000) );
//        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
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
        return (int)(num1 * 1000) == (int)(num2 * 1000);
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