package br.com.luizaugustcs.testeelotech;

import br.com.luizaugustocs.testeelotech.Exercicio1;
import br.com.luizaugustocs.testeelotech.exceptions.Exercicio1Exception;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class Exercicio1Test {

    @Test
    public void testGetFirstDuplicate() {

        Integer result = Exercicio1.findFirstDuplicate(Arrays.asList(2, 3, 3, 1, 5, 2));
        assertNotNull(result);

        assertEquals(Integer.valueOf(3), result);
    }

    @Test
    public void testGetFirstDuplicateDontFind() {

        Integer result = Exercicio1.findFirstDuplicate(Arrays.asList(2, 3, 7, 1, 5, 4));
        assertNotNull(result);

        assertEquals(Integer.valueOf(-1), result);
    }

    @Test
    public void testNullList() {
        try {
            Exercicio1.findFirstDuplicate(null);
            fail();
        } catch (Exception ex) {
            assertEquals(Exercicio1Exception.class, ex.getClass());
            assertEquals("The list can not be null.", ex.getMessage());
        }
    }

    @Test
    public void testEmptyList() {
        try {
            Exercicio1.findFirstDuplicate(new ArrayList<>());
            fail();
        } catch (Exception ex) {
            assertEquals(Exercicio1Exception.class, ex.getClass());
            assertEquals("The list can not be empty.", ex.getMessage());
        }
    }
    @Test
    public void testElementLessThanOne() {
        try {
            Exercicio1.findFirstDuplicate(Arrays.asList(2, 3, 7, 1, 5, -4, 0));
            fail();
        } catch (Exception ex) {
            assertEquals(Exercicio1Exception.class, ex.getClass());
            assertEquals("The list values can not be less than one.", ex.getMessage());
        }
    }

    @Test
    public void testOneElement() {
        Integer result = Exercicio1.findFirstDuplicate(Collections.singletonList(2));
        assertNotNull(result);

        assertEquals(Integer.valueOf(-1), result);
    }
}