package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int counter = 1;
        StringBuilder word = new StringBuilder();
        while (counter <= chars.length) {
            word.append(chars[counter]);
            counter++;
        }
        System.out.println(word);
    }
}
