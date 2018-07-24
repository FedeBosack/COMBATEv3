/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Federico
 */
public class JugadorTest {
    
    public JugadorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getIndiceJugador method, of class Jugador.
     */
    @Test
    public void testGetIndiceJugador() {
        System.out.println("getIndiceJugador");
        Jugador instance = new Jugador("Fede", 1);
        int expResult = 1;
        int result = instance.getIndiceJugador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getNombre method, of class Jugador.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Jugador instance = new Jugador("Raul" , 2);
        String expResult = "Raul";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Como esta recien creado el jugador esperamos que el numero de ejercitos sea 1
     */
    @Test
    public void testGetNumeroDeEjercitos() {
        System.out.println("getNumeroDeEjercitos");
        Jugador instance = new Jugador("raul", 3);
        int expResult = 0;
        int result = instance.getNumeroDeEjercitos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Vemos que la variable ejercitos cambia cuando se le a;aden ejercitos
     */
 

    @Test
    public void testAñadirEjercitos() {
        System.out.println("a\u00f1adirEjercitos");
        Jugador instance = new Jugador("marta", 6);
        int prueba= instance.getNumeroDeEjercitos();
        instance.añadirEjercitos(2);
        int prueba1=instance.getNumeroDeEjercitos();
        assertNotEquals(prueba, prueba1);
        // TODO review the generated test code and remove the default call to fail.
       
    }

  
    /**
     * Test of ejercitoPerdido method, of class Jugador.
     */
    @Test
    public void testEjercitoPerdido() {
        System.out.println("ejercitoPerdido");
        Jugador instance = new Jugador("Raquel", 5);
        int prueba= instance.getNumeroDeEjercitos();
        instance.ejercitoPerdido();
        int prueba1=instance.getNumeroDeEjercitos();
        assertNotEquals(prueba, prueba1);
    }
    
}
