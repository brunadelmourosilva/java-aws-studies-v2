package medium;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
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

        /*
          2. Arrays.sort Stability Guarantee

          Java’s Arrays.sort on Object arrays (like String[]) is stable.
          This means that if the comparator considers two elements "equal" (i.e., returns 0),
          Arrays.sort keeps them in their original order.
          */
        Arrays.sort(s, new Comparator<String>() {

            @Override
            public int compare(String a, String b) {
                if (a == null || b == null) {
                    return 0;
                }

                BigDecimal bdA = new BigDecimal(a);
                BigDecimal bdB = new BigDecimal(b);

                // Descending order: compare bdB to bdA
                return bdB.compareTo(bdA);
            }
        });

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