package br.com.luizaugustocs.testeelotech;

import br.com.luizaugustocs.testeelotech.exceptions.Exercicio1Exception;

import java.util.List;

public class Exercicio1 {

    public static Integer findFirstDuplicate(List<Integer> list) {

        if (list == null) {
            throw new Exercicio1Exception("The list can not be null.");
        }
        if (list.isEmpty()) {
            throw new Exercicio1Exception("The list can not be empty.");
        }

        if (list.stream().anyMatch(value -> value < 1)){
            throw new Exercicio1Exception("The list values can not be less than one.");
        }

        if (list.size() == 1) {
            return -1;
        }

        for (Integer index = 1; index < list.size(); index++) {
            if (list.subList(0, index).contains(list.get(index))) {
                return list.get(index);
            }
        }

        return -1;
    }
}
