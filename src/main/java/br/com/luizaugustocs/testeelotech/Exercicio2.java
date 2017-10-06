package br.com.luizaugustocs.testeelotech;

import br.com.luizaugustocs.testeelotech.exceptions.Exercicio2Exception;

public class Exercicio2 {

    public static void printStairs(Integer numberOfSteps){

        if (numberOfSteps < 2){
            throw new Exercicio2Exception("The stair must have at least 2 levels.");
        }
        for (Integer step = 1; step <= numberOfSteps; step ++){
            String currentStep = Exercicio2.repeatChar(" ", numberOfSteps - step) +
                    Exercicio2.repeatChar("#", step);
            System.out.println(currentStep);
        }
    }


    private static String repeatChar(String character, Integer numberOfRepeats){
        return numberOfRepeats == 0 ? "": String.format("%"+numberOfRepeats+"s"," ").replaceAll(" ", character);
    }
}
