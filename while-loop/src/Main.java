public class Main {
    public static void main(String[] args) {
//        int count = 1;
//        while (count  != 6) {
//            System.out.println("Count value is " + count);
//             count ++;
//        }
//        System.out.println("--------------");
//        for (count = 1; count !=6 ; count ++) {
//            System.out.println("Count value is " + count);
//        }
//        System.out.println("--------------");
//
//        count = 1;
//        while (true) {
//            if (count == 6) {
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count ++;
//        }
//        System.out.println("--------------");
//        count = 1;
//        do {
//            System.out.println("Count value was " + count);
//            count ++;
//        } while (count !=6);
//        System.out.println("--------------");
//        int number = 4;
//        int finishNumber = 200;
//        int cnt = 0;
//        int sum = 0;
//        while (number < finishNumber) {
////            System.out.println(number++);
//            number++;
//            if (!isEvenNumber(number)) {
//                continue;
//            }
//            sum += number;
//            System.out.println("Even Number " + number);
//            cnt++;
//            if (cnt == 5) {
//                break;
//            }
//        }
//        System.out.println("sum: "  + sum);

        System.out.println(sumDigit(12));

    }

    public static int sumDigit(int num) {
        if (num < 10) {
            return -1;
        }
        int res = 0;
        while (num != 0) {
            res += num % 10;
            num /= 10;
        }
        return res;
    }

    public static boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }
}