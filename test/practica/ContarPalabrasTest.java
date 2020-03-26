/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author migue
 */
public class ContarPalabrasTest {
    
    public ContarPalabrasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of contarNumeroPalabras method, of class ContarPalabras.
     */
    @Test
    public void testContarNumeroPalabras() {
        System.out.println("contarNumeroPalabras");
        String cadena = "";
        ContarPalabras instance = new ContarPalabras();
        int expResult = 0;
        int result = instance.contarNumeroPalabras(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contarCaracteresTotal method, of class ContarPalabras.
     */
    @Test
    public void testContarCaracteresTotal() {
        System.out.println("contarCaracteresTotal");
        String cadena = "";
        ContarPalabras instance = new ContarPalabras();
        int expResult = 0;
        int result = instance.contarCaracteresTotal(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contarTodosCaracteres method, of class ContarPalabras.
     */
    @Test
    public void testContarTodosCaracteres() {
        System.out.println("contarTodosCaracteres");
        String cadena = "";
        ContarPalabras instance = new ContarPalabras();
        int[] expResult = null;
        int[] result = instance.contarTodosCaracteres(cadena);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
