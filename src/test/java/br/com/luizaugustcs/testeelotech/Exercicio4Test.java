package br.com.luizaugustcs.testeelotech;

import br.com.luizaugustocs.testeelotech.Exercicio4;
import br.com.luizaugustocs.testeelotech.exceptions.Exercicio4Exception;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

public class Exercicio4Test {


    @Test
    public void teste100(){
        List<BigDecimal> result= Exercicio4.doChange(100);

        assertNotNull(result);
        assertFalse(result.isEmpty());
        assertEquals(1, result.size());
        assertEquals(BigDecimal.valueOf(100), result.get(0));
    }
    @Test
    public void teste70(){
        List<BigDecimal> result= Exercicio4.doChange(70);

        assertNotNull(result);
        assertFalse(result.isEmpty());
        assertEquals(2, result.size());
        assertEquals(BigDecimal.valueOf(50), result.get(0));
        assertEquals(BigDecimal.valueOf(20), result.get(1));
    }

    @Test
    public void teste187(){
        List<BigDecimal> result= Exercicio4.doChange(187);

        assertNotNull(result);
        assertFalse(result.isEmpty());
        assertEquals(6, result.size());
        assertEquals(BigDecimal.valueOf(100), result.get(0));
        assertEquals(BigDecimal.valueOf(50), result.get(1));
        assertEquals(BigDecimal.valueOf(20), result.get(2));
        assertEquals(BigDecimal.valueOf(10), result.get(3));
        assertEquals(BigDecimal.valueOf(5), result.get(4));
        assertEquals(BigDecimal.valueOf(2), result.get(5));
    }

    @Test
    public void testNegative() {

        try {
            Exercicio4.doChange(-1);
            fail();
        } catch (Exception ex) {
            assertEquals(Exercicio4Exception.class, ex.getClass());
            assertEquals("The amount must be an positive integer.", ex.getMessage());
        }
    }

    @Test
    public void testLessThan2(){
        List<BigDecimal> result= Exercicio4.doChange(1);

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void test11(){
        List<BigDecimal> result= Exercicio4.doChange(11);

        assertNotNull(result);
        assertFalse(result.isEmpty());
        assertEquals(4, result.size());
        assertEquals(BigDecimal.valueOf(5), result.get(0));
        assertEquals(BigDecimal.valueOf(2), result.get(1));
        assertEquals(BigDecimal.valueOf(2), result.get(2));
        assertEquals(BigDecimal.valueOf(2), result.get(3));
    }

    @Test
    public void test21(){
        List<BigDecimal> result= Exercicio4.doChange(21);

        assertNotNull(result);
        assertFalse(result.isEmpty());
        assertEquals(5, result.size());
        assertEquals(BigDecimal.valueOf(10), result.get(0));
        assertEquals(BigDecimal.valueOf(5), result.get(1));
        assertEquals(BigDecimal.valueOf(2), result.get(2));
        assertEquals(BigDecimal.valueOf(2), result.get(3));
        assertEquals(BigDecimal.valueOf(2), result.get(4));
    }

    @Test
    public void test101(){
        List<BigDecimal> result= Exercicio4.doChange(101);

        assertNotNull(result);
        assertFalse(result.isEmpty());
        assertEquals(7, result.size());
        assertEquals(BigDecimal.valueOf(50), result.get(0));
        assertEquals(BigDecimal.valueOf(20), result.get(1));
        assertEquals(BigDecimal.valueOf(20), result.get(2));
        assertEquals(BigDecimal.valueOf(5), result.get(3));
        assertEquals(BigDecimal.valueOf(2), result.get(4));
        assertEquals(BigDecimal.valueOf(2), result.get(5));
        assertEquals(BigDecimal.valueOf(2), result.get(6));
    }

}