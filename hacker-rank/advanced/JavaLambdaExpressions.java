package advanced;

import java.util.Scanner;
import java.util.function.Function;

/**
 * https://www.hackerrank.com/challenges/java-lambda-expressions/problem
 * */
public class JavaLambdaExpressions {

    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {

        Integer testCases = Integer.parseInt(SC.nextLine());

        for (int i = 0; i < testCases; i++) {
            String[] input = SC.nextLine().split("\\s+");

            Function<Integer, Boolean> isOdd = checkedValue -> {
                    if(checkedValue % 2 == 0) {
                        return Boolean.FALSE;
                    } else {
                        return Boolean.TRUE;
                    }
            };

            Function<Integer, Boolean> isPrime = checkedValue -> {
                    boolean flag = true;
                    for (int j = 2; j <= checkedValue / 2; ++j) {
                        if (checkedValue % j == 0) {
                            flag = false;
                            break;
                        }
                    }
                    return flag;
            };

            Function<Integer, Boolean> isPalindrome = checkedValue -> {
                int originalNum = checkedValue;
                int reversedNum = 0;

                while (checkedValue > 0) {
                    int digit = checkedValue % 10;
                    reversedNum = reversedNum * 10 + digit;
                    checkedValue /= 10;
                }

                return originalNum == reversedNum;
            };

            if(Integer.parseInt(input[0]) == 1) {
                if(isOdd.apply(Integer.parseInt(input[1]))) {
                    System.out.println("ODD");
                } else {
                    System.out.println("EVEN");
                }
            }

            if(Integer.parseInt(input[0]) == 2) {
                if(isPrime.apply(Integer.parseInt(input[1]))) {
                    System.out.println("PRIME");
                } else {
                    System.out.println("COMPOSITE");
                }
            }

            if(Integer.parseInt(input[0]) == 3) {
                if(isPalindrome.apply(Integer.parseInt(input[1]))) {
                    System.out.println("PALINDROME");
                } else {
                    System.out.println("NOT PALINDROME");
                }
            }
        }
    }
}
