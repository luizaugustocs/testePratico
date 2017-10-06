package br.com.luizaugustcs.testeelotech;

import br.com.luizaugustocs.testeelotech.Exercicio5;
import br.com.luizaugustocs.testeelotech.exceptions.Exercicio5Exception;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exercicio5Test {


    @Test
    public void testGetRecurrence() {
        Integer result = Exercicio5.countWords("Programador Programação", "ama");

        assertNotNull(result);
        assertEquals(Integer.valueOf(2), result);
    }
    @Test
    public void testGetRecurrenceDontFind() {
        Integer result = Exercicio5.countWords("Programador Programação", "axa");

        assertNotNull(result);
        assertEquals(Integer.valueOf(0), result);
    }
    @Test
    public void testGetRecurrenceEmptyString() {
        Integer result = Exercicio5.countWords("", "");

        assertNotNull(result);
        assertEquals(Integer.valueOf(0), result);
    }

    @Test
    public void testGetRecurrenceEmptyString2() {
        Integer result = Exercicio5.countWords("aaa", "");

        assertNotNull(result);
        assertEquals(Integer.valueOf(0), result);
    }
    @Test
    public void testGetNullPhrase(){
        try{
            Exercicio5.countWords(null,"teste");
            fail();
        } catch (Exception ex){
            assertEquals(Exercicio5Exception.class, ex.getClass());
            assertEquals("The phrase can not be null.", ex.getMessage());
        }
    }
    @Test
    public void testGetNullWord(){
        try{
            Exercicio5.countWords("teste",null);
            fail();
        } catch (Exception ex){
            assertEquals(Exercicio5Exception.class, ex.getClass());
            assertEquals("The word can not be null.", ex.getMessage());
        }
    }

}