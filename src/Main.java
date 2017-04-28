import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public final static String UNDERSCORE = "_";
    public final static String DEFAULT_WORD = "bicycle";


    public static void main(String[] args) {
        Word word = new Word();

        word.setWord(DEFAULT_WORD);

        int wordLength = word.getWord().toString().length();

        System.out.println("Guess a letter for the hidden word. The word has " + wordLength + " letters.");

        for (int c = 0; c < DEFAULT_WORD.length(); c++) {
            System.out.printf("%s ", UNDERSCORE);
        }








    }


}
