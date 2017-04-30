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
        }

        Random randNum = new Random();
        Word randWord = words.get(randNum.nextInt(words.size()));
        String hiddenWord = randWord.getWord();
        System.out.println("\nGuess a letter for the hidden word. The word has " + hiddenWord.length() + " letters.\n");

        ArrayList<Character> characters = new ArrayList<>();
        ArrayList<String> underscores = new ArrayList<>();

        hiddenWord.chars().mapToObj(c -> (char) c).forEach(i -> characters.add(i));
        characters.forEach(x -> underscores.add("_ "));

        characters.forEach(System.out::print);

        Scanner scanner = new Scanner(System.in);
        Character input = scanner.nextLine().toLowerCase().charAt(0);

        underscores.forEach(System.out::print);

        for (int i = 0; i < characters.size(); i++) {
            if (input == characters.get(i)) {
                underscores.set(i, input.toString());
            }
            break;
        }

        underscores.forEach(System.out::print);


    }

}