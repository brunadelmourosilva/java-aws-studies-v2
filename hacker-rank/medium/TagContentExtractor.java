package medium;

import java.util.Scanner;

public class TagContentExtractor {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while (testCases > 0) {
            String line = in.nextLine();

            boolean isTagValid = validateIfTagsAreEquals(line);

            //// TODO: 3/30/2024 uncompleted
            if(isTagValid) {
                int firstStartTag = line.indexOf(">");
                int secondStartTag = line.indexOf("</");
                String sentence = "";

                if (firstStartTag != -1 && secondStartTag != -1) {
                    sentence = line.substring(firstStartTag + 1, secondStartTag);
                }

                // Validate if still there is any tag present in the sentence
                int validateAnyTagInSentence = sentence.indexOf(">");
                if (validateAnyTagInSentence != -1) {
                    System.out.println(sentence.substring(validateAnyTagInSentence + 1));
                } else {
                    System.out.println(sentence);
                }
            } else {
                System.out.println("None");
            }

            testCases--;
        }
    }

    private static boolean validateIfTagsAreEquals(String sentence) {
        int firstStartTag = sentence.indexOf("<");
        int firstEndTag = sentence.indexOf(">", firstStartTag);
        String firstTag = "";

        if (firstStartTag != -1 && firstEndTag != -1) {
            firstTag = sentence.substring(firstStartTag + 1, firstEndTag);
        }

        int secondStartTag = sentence.indexOf("</");
        int secondEndTag = sentence.indexOf(">", secondStartTag);
        String secondTag = "";

        if (secondStartTag != -1 && secondEndTag != -1) {
            secondTag = sentence.substring(secondStartTag + 2, secondEndTag);
        }

        return firstTag.equals(secondTag);
    }
}
