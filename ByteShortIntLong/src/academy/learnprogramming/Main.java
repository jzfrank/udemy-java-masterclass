package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum value = " + myMinIntValue);
        System.out.println("Integer Maximum value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte minimum Value = " + myMinByteValue);
        System.out.println("Byte maximum Value = " + myMaxByteValue);

        Short myMinShortValue = Short.MIN_VALUE;
        Short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short minimum Value = " + myMinShortValue);
        System.out.println("Short maximum Value = " + myMaxShortValue);

        long myLongValue = 100L;
        Long myMinLongValue = Long.MIN_VALUE;
        Long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long minimum Value = " + myMinLongValue);
        System.out.println("Long maximum Value = " + myMaxLongValue);

        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);

        // challenge
        byte myByte = 0;
        short myShort = 200;
        int myInt = 1000142123;

        long myLong = (50000L  + 10L * (myByte + myShort + myInt));

        System.out.println(myLong);

        short shortTotal = (short) (50000  + 10 * (myByte + myShort + myInt));

        System.out.println(shortTotal);


    }
}