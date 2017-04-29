import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public final static String UNDERSCORE = "_";
    public final static String DEFAULT_WORD = "bicycle";

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("ShortWordList.txt");
        ArrayList<Word> words = new ArrayList<>();

        Scanner s = new Scanner(f);
        String[] wordArray = new String[0];
        while (s.hasNext()) {
            String line = s.next();
            wordArray = line.split("\\,");
        }

        for (String wd : wordArray) {
            Word word = new Word(wd);
            words.add(word);
//            System.out.println(wd);
        }

        Random randNum = new Random();
        Word randWord = words.get(randNum.nextInt(words.size()));
        String HIDDEN_WORD = randWord.toString();

        System.out.println("Guess a letter for the hidden word. The word has " + HIDDEN_WORD.length() + " letters.");

        for (int c = 0; c < HIDDEN_WORD.length(); c++) {
            System.out.printf("%s ", UNDERSCORE);
        }

    }

}
