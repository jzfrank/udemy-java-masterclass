public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest is "
                    + String.format("%.2f", calculateInterest(10_000,  i)));
        }
        System.out.println("-------------------------");
        for (int i = 8; i > 1; i--) {
            System.out.println("10,000 at " + i + "% interest is "
                    + String.format("%.2f", calculateInterest(10_000,  i)));
        }
        System.out.println("-------------------------");
        int cnt = 0;
        for (int i = 79; i < 1000; i++) {
            if (isPrime(i)) {
                System.out.println("Number " + i + " is a prime number");
                cnt ++;
                if (cnt == 3) {
                    break;
                }
            }
        }
        System.out.println("-------------------------");
        int sumOfNums = 0;
        cnt = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i + " could be divided by 3 and 5");
                sumOfNums += i;
                cnt ++;
                if (cnt == 5) {
                    break;
                }
            }
        }
        System.out.println("sum of first " + cnt + " numbers that could be divided by 15 between 1 and 1000: "
                + sumOfNums);
        System.out.println("-------------------------");

    }

    public static boolean isPrime(int n) {
        if (n==1){
            return false;
        }
        for (int i = 2; i <= Math.floor(Math.sqrt(n)) + 1; i ++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest (double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}