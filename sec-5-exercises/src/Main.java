import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
//        for (int i = -2; i < 14; i++) {
//            int numOfDays = getDaysInMonth(i, 2001);
//            System.out.println("month: " + i + " days: " + numOfDays);
//        }
//        System.out.println(isPalindrome(-191100191));

//        System.out.println(sumFirstAndLastDigit(252));
//        System.out.println(sumFirstAndLastDigit(257));
//        System.out.println(sumFirstAndLastDigit(0));
//        System.out.println(sumFirstAndLastDigit(5));
//        System.out.println(sumFirstAndLastDigit(-10));

//        System.out.println(getEvenDigitSum(123456789));
//        System.out.println(getEvenDigitSum(252));
//        System.out.println(getEvenDigitSum(-22));

//        assert hasSharedDigit(12, 23);
//        assert !hasSharedDigit(9, 99);
//        assert hasSharedDigit(15, 55);

//        assert hasSameLastDigit(41, 22, 71);
//        assert hasSameLastDigit(23, 32, 42);
//        assert hasSameLastDigit(9, 99, 999);

//        assert getGreatestCommonDivisor(25, 15) == 5;
//        assert getGreatestCommonDivisor(12, 30) == 6;
//        assert getGreatestCommonDivisor(9, 18) == -1;
//        assert getGreatestCommonDivisor(81, 153) == 9;
//
//        printFactors(6);
//        printFactors(32);
//        printFactors(10);
//        printFactors(-1);

//        System.out.println(isPerfectNumber(6));
//        assert isPerfectNumber(28);
//        assert !isPerfectNumber(5);
//        assert !isPerfectNumber(-1);

//        System.out.println(getDigitCount(0));
//        System.out.println(getDigitCount(120));
//        System.out.println(getDigitCount(-12));
//        System.out.println(getDigitCount(5200));
//
//        System.out.println(reverse(-121));
//        System.out.println(reverse(1212));
//        System.out.println(reverse(1234));
//        System.out.println(reverse(100));

//        numberToWords(123);
//        numberToWords(1010);
//        numberToWords(1000);
//        numberToWords(-12);

//        System.out.println(canPack(1, 0, 4));
//        System.out.println(canPack(1, 0, 5));
//        System.out.println(canPack(0, 5, 4));
//        System.out.println(canPack(2, 2, 11));
//        System.out.println(canPack(-3, 2, 12));

//        System.out.println(getLargestPrime(21));
//        System.out.println(getLargestPrime(217));
//        System.out.println(getLargestPrime(0));
//        System.out.println(getLargestPrime(45));
//        System.out.println(getLargestPrime(-1));

//        for (int i = 5; i < 8; i ++) {
//            printSquareStar(i);
//            System.out.println("--------------");
//        }

//        inputThenPrintSumAndAverage();

        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(3.26, 0.75));
        System.out.println("------------------------------------");
        System.out.println(getBucketCount(-3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));
        System.out.println("------------------------------------");
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));


    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        int numOfBucket = (int) (area / areaPerBucket) + 1;
        return numOfBucket;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        return getBucketCount(width * height, areaPerBucket);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        return Math.max(
                getBucketCount(width * height, areaPerBucket) - extraBuckets,
                0);
    }

    public static void inputThenPrintSumAndAverage() {
        long summation = 0;
        int cnt = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt)  {
                cnt ++;
                summation += scanner.nextInt();
            } else {
                break;
            }
            scanner.nextLine();
        }
        cnt = (cnt == 0 ? 1 : cnt);
        long avg = Math.round(1.0 * summation / cnt);
        System.out.println("SUM = " + summation + " AVG = " + avg);
        scanner.close();
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        for (int row = 1; row <= number; row ++) {
            String lineChars = "";
            for (int col = 1; col <= number; col ++) {
                if (row == 1 || row == number) {
                    lineChars += "*";
                } else if (col == 1 || col == number) {
                    lineChars += "*";
                } else if (col == row || col + row == number + 1) {
                    lineChars += "*";
                } else {
                    lineChars += " ";
                }
            }
            System.out.println(lineChars);
        }
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        for (int i = number; i > 1; i--) {
            if (number % i != 0) continue;
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                return i;
            }

        }
        return -1;
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if (bigCount * 5 + smallCount < goal) {
            return false;
        }
        int remainingGoal = goal;
        if (bigCount * 5 < goal) {
            remainingGoal -= 5 * bigCount;
        } else {
            remainingGoal %= 5;
        }
        return remainingGoal <= smallCount;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        int cnt = 0;
        while (number != 0) {
            cnt ++;
            number /= 10;
        }
        return cnt;
    }

    public static int reverse(int number) {
        int res = 0;
        while (number != 0) {
            res = res * 10 + (number % 10);
            number /= 10;
        }
        return res;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int digitCount = getDigitCount(number);
        int reversed_number = reverse(number);
        int printCount = 0;

        while (reversed_number != 0) {
            printCount ++;
            int digit = reversed_number % 10;
            switch (digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("OTHER");
                    break;
            }
            reversed_number /= 10;
        }
        for (int i = printCount; i < digitCount; i++) {
            System.out.println("Zero");
        }
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
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 1;
        for (int i = 2; i <= (int) Math.sqrt(number); i++) {
            if (number % i == 0) {
                sum += (i + number / i);
            }
        }
        return sum == number;
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        while (first != second) {
            if (first > second) {
                first -= second;
            } else {
                second -= first;
            }
        }
        return first;
    }

    public static boolean isValid(int n) {
        return n >= 10 && n <= 1000;
    }

    public static boolean hasSameLastDigit(int n1, int n2, int n3) {
        if (!isValid(n1) || !isValid(n2) || !isValid(n3)) {
            return false;
        }
        return (n1 % 10 == n2 % 10) || (n1 % 10 == n3 % 10) || (n2 % 10 == n3 % 10);
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num2 < 10 || num1 > 99 || num2 > 99) {
            return false;
        }
        while (num1 != 0) {
            int tmp = num2;
            int digit1 = num1 % 10;
            while (tmp != 0) {
                int digit2 = tmp % 10;
                if (digit2 == digit1) {
                    return true;
                }
                tmp /= 10;
            }
            num1 /= 10;
        }
        return false;
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int res = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                res += digit;
            }
            number /= 10;
        }
        return res;
    }



    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int res = 0;
        res += number % 10;
        while (number != 0) {
            if (number < 10) {
                res += number;
                break;
            } else {
                number /= 10;
            }
        }
        return res;
    }

    public static boolean isPalindrome(int number) {
        long _number; // prevent overflow
        if (number < 0) {
            _number = -number;
        } else {
            _number = number;
        }
        long reversed_number = 0;
        long tmp_number = _number;
        while (tmp_number != 0) {
            reversed_number = reversed_number * 10 + (tmp_number % 10);
            tmp_number /= 10;
        }
        return reversed_number == _number;
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


}