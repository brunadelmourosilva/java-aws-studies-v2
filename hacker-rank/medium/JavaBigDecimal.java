package medium;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class JavaBigDecimal {

    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] s = new String[n + 2];

        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        //Write your code here

        // convert string to bigdecimal and reorder list s
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) { // 0+1, 1+1, 2+1 ...

                BigDecimal bdX = new BigDecimal(s[i]);
                BigDecimal bdY = new BigDecimal(s[j]);

                if (bdX.compareTo(bdY) < 0) {
                    String temp = s[i]; // storing s[i] value before be replaced
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}

// convert to big decimal
// reorder numbers
// original array
//4
//9
//1
//8

// reorder numbers
// first iteration
//9
//4
//1
//8

// second, third...
// there is no value greater than 9

// fourth iteration
//9
//8
//1
//4

// ...