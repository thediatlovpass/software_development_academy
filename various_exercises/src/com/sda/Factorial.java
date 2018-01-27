package com.sda;

public class Factorial {
    public static void main(String[] args){
        System.out.println(computeFactorial(5));
        System.out.println("recursively " + computeFactorialRecursively(5));
    }

    private static int computeFactorial(int num){
        int product = 1;
        for(int j = 1; j <= num; j++){
            product = product * j;
        }
        return product;
    }

    private static int computeFactorialRecursively(int num){
        if(num == 1){
            return 1;
        }
        return num * computeFactorialRecursively(num - 1);
    }
}
