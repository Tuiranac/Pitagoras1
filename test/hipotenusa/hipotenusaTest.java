/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hipotenusa;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MTUIRAN
 */
public class hipotenusaTest {
    
    public hipotenusaTest() {
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

    @Test
    public void testSomeMethod() {
System.out.println("hipotenusa");
double lado_a = 7;
double lado_b = 24;
double expResult = 25;
double  result = hipotenusa.hipotenusa(lado_a, lado_b);
assertEquals(expResult, result, 0.0);
        
    }
    
}
