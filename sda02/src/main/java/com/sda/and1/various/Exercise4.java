package com.sda.and1.various;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exercise4 {

    public static final int[] ZLOTY = {200, 100, 50, 10, 5, 2, 1};
    public static final int[] GROSZE = {50, 20, 10, 2, 1};

    public static final double[] NOMINALS = {200.0, 100.0, 50.0, 20.0, 10.0, 5.0, 2.0, 1.0, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};

    public static void main(String[] args) {
//        calc(1765.54);
        calcDouble(1765.54);

    }

    private static void calcDouble(double num) {
        int iterator = 0;
        BigDecimal number = new BigDecimal(num).setScale(2, RoundingMode.HALF_UP);
        while (number.doubleValue() > 0.0) {
            BigDecimal divisor = new BigDecimal(NOMINALS[iterator]).setScale(2, RoundingMode.HALF_UP);
            BigDecimal count = number.divide(divisor, BigDecimal.ROUND_FLOOR).setScale(0, RoundingMode.FLOOR);
            number = number.subtract(count.multiply(divisor));
            if (count.intValue() > 0) {
                boolean isZloty = divisor.doubleValue() >= 1.0;
                String ending = isZloty ? " zł" : " gr";
                divisor = !isZloty ? divisor.multiply(new BigDecimal(100)) : divisor;
                System.out.println(count.intValue() + " x " + divisor.setScale(0, RoundingMode.HALF_UP) + ending);
            }
            iterator++;
        }
    }

    private static void calc(double num) {
        int grosze = (int) (num * 100 - Math.floor(num) * 100);
        int zloty = (int) ((num * 100 - grosze) / 100);
        printNominals(zloty, ZLOTY, " zł");
        printNominals(grosze, GROSZE, " gr");

    }

    private static void printNominals(int value, int[] nominalsArr, String koncowka) {
        int i = 0;
        while (value > 0) {
            int count = Math.floorDiv(value, nominalsArr[i]);
            value -= count * nominalsArr[i];
            if (count > 0) {
                System.out.println(count + " x " + nominalsArr[i] + koncowka);
            }
            i++;
        }
    }
}
