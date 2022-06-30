import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1+2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);

        result = result - 1; //  3 - 1 = 2
        System.out.println("result = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("result = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("result = " + result);

        result = result % 3; // 4 % 3 = 1 the remainer of (4 % 3) is 1
        System.out.println("result = " + result);

        // result = result + 1
        result++; // 1 + 1 = 2
        System.out.println("result = " + result);

        result--; // 2 - 1 = 1
        System.out.println("result = " + result);

        // result = result + 2;
        result += 2; // 1 + 2 = 3
        System.out.println("result = " + result);

        // result = result * 10
        result *= 10; // 3 * 10 = 30
        System.out.println("result = " + result);

        // result = result / 3
        result /= 3; // 30 / 3 = 10
        System.out.println("result = " + result);

        // result = result - 2
        result -= 2; // 10 - 2 = 8
        System.out.println("result = " + result);

        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an error");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }
        isCar = true;

        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        double a = 20.00d;
        double b = 80.00d;
        double c = (a + b) * 100d;

        double rem = c % 40.00d;
        boolean isZero = rem == 0;
        System.out.println("isZero, " + isZero);
        if (!isZero) {
            System.out.println("Got some remainder");
        }
        System.out.println(rem);




    }
}