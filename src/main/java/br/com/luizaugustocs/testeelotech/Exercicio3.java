package br.com.luizaugustocs.testeelotech;

import br.com.luizaugustocs.testeelotech.exceptions.Exercicio3Exception;

import java.util.LinkedList;

public class Exercicio3 {

    public static LinkedList<Integer> removeAllOccurrences(LinkedList<Integer> list, Integer k){

        if (list == null){
            throw new Exercicio3Exception("The list can not be null.");
        }

        while(list.contains(k)){
            list.remove(k);
        }

        return list;
    }
}
