package com.sda.and1.various;

import java.util.Stack;

public class ReversePolishNotation {

    public static void main(String[] args) {

        String exp = "5 1 2 + 4 * + 3 -";
        String exp2 = "12 2 3 4 * 10 5 / + * +";

        System.out.println(revert(exp));
        System.out.println(revert(exp2));
    }

    private static double revert(String exp) {

        Stack<Double> stack = new Stack<>();
        String[] expArr = exp.split("\\s+");

        for (String e : expArr) {
            if (e.matches("\\d+")) {
                stack.push(Double.valueOf(e));
            } else {
                double a = stack.pop();
                double b = stack.pop();

                switch (e) {
                    case "+":
                        stack.push(b + a);
                        break;
                    case "-":
                        stack.push(b - a);
                        break;
                    case "*":
                        stack.push(b * a);
                        break;
                    case "/":
                        stack.push(b / a);
                        break;
                }
            }
        }

        return stack.pop();
    }
}
