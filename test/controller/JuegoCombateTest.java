/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Federico
 */
public class JuegoCombateTest {
    
    public JuegoCombateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * TIene que decir falso hasta que se agregan mas de 4
     */
    @Test
    public void testAgregarJugador() {
        System.out.println("agregarJugador");
        JuegoCombate instance= new JuegoCombate();
        boolean result = instance.agregarJugador("a");
        assertTrue(result);
         boolean result1 = instance.agregarJugador("b"); 
    }

}
