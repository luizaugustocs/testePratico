package br.com.luizaugustocs.testeelotech;

import br.com.luizaugustocs.testeelotech.exceptions.Exercicio4Exception;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercicio4 {

    private static List<BigDecimal> possibleNotes;

    static {
        possibleNotes = Stream.of(100, 50, 20, 10, 5, 2)
                .map(BigDecimal::valueOf)
                .collect(Collectors.toList());
    }

    public static List<BigDecimal> doChange(Integer amount) {
        if (amount == null || amount < 0) {
            throw new Exercicio4Exception("The amount must be an positive integer.");
        }

        // Um valor menor que 2 (A menor nota) não pode ser representado
        if (amount < 2) {
            return new ArrayList<>();
        }
        return Exercicio4.doChange(BigDecimal.valueOf(amount), 0, new ArrayList<>());
    }

    private static List<BigDecimal> doChange(BigDecimal amount, Integer index, List<BigDecimal> currentChange) {
        if (amount.compareTo(BigDecimal.ZERO) == 0) {
            return currentChange;
        }

        if (amount.compareTo(BigDecimal.ONE) == 0 && index == possibleNotes.size() -1){
            BigDecimal lastChange = currentChange.remove(currentChange.size() -1);
            return Exercicio4.doChange(amount.add(lastChange), possibleNotes.indexOf(lastChange) +1, currentChange);
        }

        if (amount.compareTo(possibleNotes.get(index)) >= 0) {
            BigDecimal nextNote = possibleNotes.get(index);
            currentChange.add(nextNote);
            return Exercicio4.doChange(amount.subtract(nextNote), index, currentChange);
        }
        return Exercicio4.doChange(amount, ++index, currentChange);
    }
}
