package basic;

import java.util.Arrays;
import java.util.Scanner;

public class MyNumber {

    int number;

    public MyNumber(int number) {
        this.number = number;
    }

    public boolean isPrime() {

        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                return true;
            }
        }

        return false;
    }

    public int sumUptoN() {
        int sum = 0;

        for (int i = 1; i < number - 2; i++) {
            sum = sum + i;
            System.out.print(i + " ");
        }

        return sum;
    }

    public int sumOfDivisors() {
        int sum = 0;

        for (int i = 1; i < number - 1; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        return sum;
    }


    public void printANumberTriangle() {
        //1
        //1 2
        //1 2 3
        //1 2 3 4
        //1 2 3 4 5

        for(int i = 1; i<= number; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber(9);
        boolean isPrime = myNumber.isPrime();
        System.out.println("isPrime " + isPrime);
        int sum = myNumber.sumUptoN();
        System.out.println("sum = " + sum);

        int sumOfDivisors = myNumber.sumOfDivisors();
        System.out.println("sumOfDivisors = " + sumOfDivisors);

        myNumber.printANumberTriangle();


    }

}
