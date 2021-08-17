package chapter2.item5;

import java.util.Objects;
import java.util.function.Supplier;

public class SpellChecker {
    private final Lexicon dictionary;

    public SpellChecker(Supplier<Lexicon> dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary.get());
    }

    public void getDictionary() {
        System.out.println("dictionary = " + dictionary.getClass());
    }

}

