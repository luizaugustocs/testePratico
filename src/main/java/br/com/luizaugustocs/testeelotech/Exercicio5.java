package br.com.luizaugustocs.testeelotech;

import br.com.luizaugustocs.testeelotech.exceptions.Exercicio5Exception;

public class Exercicio5 {

    public static Integer countWords(String phrase, String word){
        if (phrase == null){
            throw new Exercicio5Exception("The phrase can not be null.");
        }

        if (word == null){
            throw new Exercicio5Exception("The word can not be null.");
        }

        if (word.length() == 0){
            return 0;
        }
        return phrase.split(word).length -1;
    }
}
