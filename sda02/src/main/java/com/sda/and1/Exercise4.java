package com.sda.and1;

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
        while (num > 0.0) {
            BigDecimal number = new BigDecimal(num);
            number.setScale(2, RoundingMode.FLOOR);
            BigDecimal divisor = new BigDecimal(NOMINALS[iterator]);
            divisor.setScale(2, RoundingMode.FLOOR);
            int count = number.divide(divisor, BigDecimal.ROUND_FLOOR).intValue();
            BigDecimal countDec = new BigDecimal(count);
            countDec.setScale(2);
            number = number.subtract(countDec.multiply(divisor));
            if(count > 0){
                System.out.println(count + " x " + NOMINALS[iterator] + "");
            }
            num = number.doubleValue();
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
