package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArrayList {

    public static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {

        // linha quantidade de arrays
        Integer numberOfArrays = SC.nextInt();

        // criar partition list para guardar todos os arrays criados abaixo
        List<List<Integer>> partitionList = new ArrayList<>();

        // em cada linha
        // primeira entrada -> quantidade de numeros no array
        for (int i = 0; i < numberOfArrays; i++) {
            // numero de posicoes
            Integer numberOfPositions = SC.nextInt();

            // criar meu array
            List<Integer> arrayOfNumbers = new ArrayList<>();

            for (int j = 0; j < numberOfPositions; j++) {
                // numeros a serem populados no array
                Integer number = SC.nextInt();
                arrayOfNumbers.add(j, number);
            }

            // guardar minha lista criada dentro da partition list
            partitionList.add(i, arrayOfNumbers);

        }

        // linha quantidade de queries
        Integer numberOfQueries = SC.nextInt();

        for (int i = 0; i < numberOfQueries; i++) {
            // 2 inteiros representando uma coordenada
            Integer x = SC.nextInt(); // linha
            Integer y = SC.nextInt(); // coluna

            try {
                List<Integer> getList = partitionList.get(x - 1); // x - 1 pois a posicao do array comeca em 0
                Integer getNumber = getList.get(y - 1); // y - 1 pois a posicao do array comeca em 0

                System.out.println(getNumber);
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
