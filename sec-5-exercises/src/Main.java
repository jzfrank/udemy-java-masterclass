public class Main {
    public static void main(String[] args) {
        for (int i = -2; i < 14; i++) {
            int numOfDays = getDaysInMonth(i, 2001);
            System.out.println("month: " + i + " days: " + numOfDays);
        }
    }

    public static int sumOdd(int start, int end) {
        if (end < start || end <= 0 || start <= 0) {
            return -1;
        }
        int res = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                res += i;
            }
        }
        return res;
    }

    public static boolean isOdd(int num) {
        if (num < 0) {
            return false;
        }
        return num % 2 == 1;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }
        int res = 30;
        switch (month) {
            case 2:
                if (isLeapYear(year)) {
                    res = 29;
                } else {
                    res = 28;
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                res = 31;
                break;
            default:
                res = 30;
                break;
        }
        return res;
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


    public static void printNumberInWord(int num) {
        switch (num) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }
}