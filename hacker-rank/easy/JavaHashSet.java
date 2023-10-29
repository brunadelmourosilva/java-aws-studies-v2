package easy;

import java.util.*;

public class JavaHashSet {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int inputQuantity = s.nextInt();
        String[] pairLeft = new String[inputQuantity];
        String[] pairRight = new String[inputQuantity];

        for (int i = 0; i < inputQuantity; i++) {
            pairLeft[i] = s.next();
            pairRight[i] = s.next();
        }

       Set<String> pairs = new HashSet<>();
        int pairQuantity = 0;
        for (int i = 0; i < inputQuantity; i++) {

            boolean isNewPair = pairs.add(pairLeft[i].concat(" ").concat(pairRight[i]));

            if(isNewPair) {
                pairQuantity++;
            }

            System.out.println(pairQuantity);
        }
        //pairs.forEach(System.out::println);
    }
}

//criar um multimap

