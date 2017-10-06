package br.com.luizaugustcs.testeelotech;

import br.com.luizaugustocs.testeelotech.Exercicio3;
import br.com.luizaugustocs.testeelotech.exceptions.Exercicio3Exception;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class Exercicio3Test {


    @Test
    public void testRemoveAllOnes() {

        LinkedList<Integer> initial = new LinkedList<>(Arrays.asList(3, 8, 9, 4, 7, 1, 6, 1));
        LinkedList<Integer> result = Exercicio3.removeAllOccurrences(initial, 1);

        assertNotNull(result);
        assertFalse(result.isEmpty());

        assertEquals(new LinkedList<>(Arrays.asList(3, 8, 9, 4, 7, 6)), result);


    }

    @Test
    public void testRemoveAllOnesNotFind() {

        LinkedList<Integer> initial = new LinkedList<>(Arrays.asList(3, 8, 9, 4, 7, 6));
        LinkedList<Integer> result = Exercicio3.removeAllOccurrences(initial, 1);

        assertNotNull(result);
        assertFalse(result.isEmpty());

        assertEquals(new LinkedList<>(Arrays.asList(3, 8, 9, 4, 7, 6)), result);
    }

    @Test
    public void testRemoveAllOnesOnlyOnes() {

        LinkedList<Integer> initial = new LinkedList<>(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1));
        LinkedList<Integer> result = Exercicio3.removeAllOccurrences(initial, 1);

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testNullList() {
        try {
            Exercicio3.removeAllOccurrences(null, 1);
            fail();
        } catch (Exception ex) {
            assertEquals(Exercicio3Exception.class, ex.getClass());
            assertEquals("The list can not be null.", ex.getMessage());
        }
    }
    @Test
    public void testEmptyList() {
        LinkedList<Integer> result = Exercicio3.removeAllOccurrences(new LinkedList<>(), 1);
        assertNotNull(result);
        assertTrue(result.isEmpty());

    }

}