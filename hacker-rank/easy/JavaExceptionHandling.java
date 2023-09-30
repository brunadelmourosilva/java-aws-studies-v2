package easy;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-exception-handling/problem
 * https://www.researchgate.net/figure/Part-of-Java-exception-tree_fig5_228655465
 */

class MyCalculator {

    public static long power(int n, int p) throws Exception {


        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        } else if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        }

        return (long) Math.pow(n, p);
    }
}

public class JavaExceptionHandling {

    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {

        while (SC.hasNext()) {
            int n = SC.nextInt();
            int p = SC.nextInt();

            try {
                System.out.println(MyCalculator.power(n, p)); //try to print the result, otherwise, shows the exception message on catch
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
