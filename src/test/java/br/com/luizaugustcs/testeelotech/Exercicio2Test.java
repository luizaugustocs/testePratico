package br.com.luizaugustcs.testeelotech;

import br.com.luizaugustocs.testeelotech.Exercicio2;
import br.com.luizaugustocs.testeelotech.exceptions.Exercicio2Exception;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Exercicio2Test {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
       System.setOut(new PrintStream(outContent));
    }

    @Test
    public void test2Levels(){
        Exercicio2.printStairs(2);
        assertEquals(" #\n##\n", outContent.toString());
    }

    @Test
    public void test5Levels(){
        Exercicio2.printStairs(5);
        assertEquals("    #\n   ##\n  ###\n ####\n#####\n", outContent.toString());
    }

    @Test
    public void testLessThan2Levels(){
        try {
            Exercicio2.printStairs(1);
            fail();
        } catch (Exception ex) {
            assertEquals(Exercicio2Exception.class, ex.getClass());
            assertEquals("The stair must have at least 2 levels.", ex.getMessage());
        }
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

}