package chapter2.item5;

public class Test {
    public static void main(String[] args) {
        Lexicon lexicon = new KoreanDictionary();
        SpellChecker spellChecker = new SpellChecker(() -> lexicon);
        spellChecker.getDictionary();
    }
}
