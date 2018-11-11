package codetest;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void printTestOne() {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("b");
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Fizz");
            } else if (i % 3 != 0 && i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    @Test
    public void printTestTwo() {
        for (int i = 1; i < 100; i++) {
            if ((i % 3 == 0 || i / 10 == 3 || i % 10 == 3)) {
                if (i % 5 == 0 || i / 10 == 5 || i % 10 == 5) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Fizz");
                }
            } else if ((i % 5 == 0 || i / 10 == 5 || i % 10 == 5)) {
                if (i % 3== 0 || i / 10 == 3 || i % 10 == 3) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Buzz");
                }
            } else {
                System.out.println(i);
            }
        }

    }
}
