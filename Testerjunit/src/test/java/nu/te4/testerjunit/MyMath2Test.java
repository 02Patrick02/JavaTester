/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.testerjunit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Elev
 */
public class MyMath2Test {
    
    public MyMath2Test() {
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
     * Test of convertToFarenheit method, of class MyMath2.
     */
   @Test
    public void testConvertToFarenheit() {
        System.out.println("convertToFarenheit 0c");
        double c = 0;
        MyMath2 instance = new MyMath2();
        double expResult = 32;
        double result = instance.convertToFarenheit(c);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testConvertToFarenheit2() {
        System.out.println("convertToFarenheit 10c");
        double c = 10;
        MyMath2 instance = new MyMath2();
        double expResult = 50;
        double result = instance.convertToFarenheit(c);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of compareTo method, of class MyMath2.
     */
    
    @Test
    public void testCompareToHighToLow() {
        System.out.println("compareTo high, low");
        int a = 3;
        int b = 2;
        MyMath2 instance = new MyMath2();
        int expResult = 1;
        int result = instance.compareTo(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCompareToEqual() {
        System.out.println("compareTo equal");
        int a = 2;
        int b = 2;
        MyMath2 instance = new MyMath2();
        int expResult = 2;
        int result = instance.compareTo(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCompareToLowToHigh() {
        System.out.println("compareTo Low, high");
        int a = 2;
        int b = 3;
        MyMath2 instance = new MyMath2();
        int expResult = -1;
        int result = instance.compareTo(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void IllegalThrow(){
        System.out.println("Illegal throw");
        MyMath2 instance = new MyMath2();
        assertThrows(IllegalArgumentException.class, () ->{
            instance.convertToFarenheit(-285);
        });
    }
}
