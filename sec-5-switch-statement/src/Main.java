public class Main {
    public static void main(String[] args) {
//        int value = 3;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        }
//        else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }
//
//        int switchValue = 3;
//        switch (switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("was a 3, or a 4, or a 5");
//                System.out.println("Actually it was a " + switchValue);
//                break;
//            default:
//                System.out.println("other values");
//                break;
//        }
//
//        char switchChar = 'H';
//        switch (switchChar) {
//            case 'A':
//                System.out.println("Found A");
//                break;
//            case 'B':
//                System.out.println("Found B");
//                break;
//            case 'C':
//                System.out.println("Found C");
//                break;
//            case 'D':
//                System.out.println("Found D");
//                break;
//            case 'E':
//                System.out.println("Found E");
//                break;
//            case 'F': case 'G': case 'H':
//                System.out.println("Found " + switchChar);
//                break;
//            default:
//                System.out.println("Not ABCDE");
//                break;
//        }
//
//        String month = "JuNE";
//        switch (month.toLowerCase()) {
//            case "january":
//                System.out.println("Jan");
//                break;
//            case "june":
//                System.out.println("Jun");
//                break;
//            default:
//                System.out.println("Not Sure");
//                break;
//        }

        for (int i = -2; i < 8; i++) {
            printDayOfTheWeek(i);
        }


    }

    public static void printDayOfTheWeek(int day) {
//        switch (day) {
//            case 0:
//                System.out.println("Sunday");
//                break;
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            default:
//                System.out.println("Invalid day");
//                break;
//        }

        if (day == 0) {
            System.out.println("Sunday");
        } else if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid day");
        }

    }
}