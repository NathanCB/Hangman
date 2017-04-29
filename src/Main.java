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

        ArrayList<Character> characters = new ArrayList<>();
        HashMap<Character,Character> charMap = new HashMap<>();

        hiddenWord.chars().mapToObj(i -> (char) i).forEach(i -> characters.add(i));
        characters.forEach(System.out::println);

        Character underScore = '_';
        characters.forEach((c) -> charMap.put(c, underScore));


        System.out.println("Guess a letter for the hidden word. The word has " + characters.size() + " letters.");

        Scanner scanner = new Scanner(System.in);
        if (!hiddenWord.contains(scanner.nextLine())) {
            System.out.println("Nope, not it. Please guess again.");
            System.out.println("(");  //Todo create a collectoin of characters for graphic representation of hanging man
        }
        //Todo replace underscore with correctly guessed letter
        else if(hiddenWord.contains(scanner.nextLine())){

        }
        //map each character in characters to underscore





//        for (int c = 0; c < characters.size(); c++) {
//
//            System.out.printf("%s ", UNDERSCORE);
//        }


//        else{
//            System.out.println("Good job!");
////            System.out.println(hiddenWord.contains());
//        }


    }

}
