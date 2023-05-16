import java.util.ArrayList;

public final class ArraysAndLists2 {
    public static void main(String[] args){
        String[] words = {"it","is","this","we","do","how"};
        ArrayList<String> phrase = new ArrayList<String>();
        String word = words[2];
        phrase.add(words[2]);
        phrase.add(words[1]);
        phrase.add(words[words.length-1]);
        phrase.add(words[words.length-3]);
        phrase.add(words[words.length-2]);
        phrase.add(words[0]);
        System.out.println(phrase);
    }
}
