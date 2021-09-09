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
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author Elev
 */
public class MyMathTest {
    
    @Rule
    public ExpectedException exception = ExpectedException.none();
    
    public MyMathTest() {
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
     * Test of add method, of class MyMath.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String a = "12";
        String b = "12";
        MyMath instance = new MyMath();
        int expResult = 24;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAdd_Exception(){
        System.out.println("add-Exception");
        exception.expect(NumberFormatException.class);
        exception.expectMessage("Du måste ha siffror");
        String a = "Noll";
        String b = "Tre";
        MyMath instance = new MyMath();
        instance.add(a, b);
    }

    /**
     * Test of isEqual method, of class MyMath.
     */
    @Test
    public void testIsEqual() {
        System.out.println("isEqual");
        int a = 2;
        int b = 2;
        MyMath instance = new MyMath();
        boolean expResult = true;
        boolean result = instance.isEqual(a, b);
        assertEquals(expResult, result);
    }

    @Test
        public void testIsEqualFalse() {
        System.out.println("isEqual");
        int a = 3;
        int b = 2;
        MyMath instance = new MyMath();
        boolean expResult = false;
        boolean result = instance.isEqual(a, b);
        assertEquals(expResult, result);
    }
    /**
     * Test of difference method, of class MyMath.
     */
    @Test
    public void testDifference_int_int() {
        System.out.println("difference high, low");
        int a = 2;
        int b = 4;
        MyMath instance = new MyMath();
        int expResult = 2;
        int result = instance.difference(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void testDifference2_int_int() {
        System.out.println("difference low, high");
        int a = 4;
        int b = 2;
        MyMath instance = new MyMath();
        int expResult = 2;
        int result = instance.difference(a, b);
        assertEquals(expResult, result);
    }
    /**
     * Test of difference method, of class MyMath.
     */
    @Test
    public void testDifference_String_String() {
        System.out.println("difference lowString highString");
        String a = "4";
        String b = "2";
        MyMath instance = new MyMath();
        int expResult = 2;
        int result = instance.difference(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDifference2_String_String() {
        System.out.println("difference highString, lowString");
        String a = "2";
        String b = "4";
        MyMath instance = new MyMath();
        int expResult = 2;
        int result = instance.difference(b, a);
        assertEquals(expResult, result);
    }    
    
    @Test
    public void return0() {
        System.out.println("return 0");
        String a = "4";
        String b = "4";
        MyMath instance = new MyMath();
        int expResult = 0;
        int result = instance.difference(b, a);
        assertEquals(expResult, result);
    } 
    
   @Test
    public void testDifference_int_int2() {
        System.out.println("return 0");
        int a = 2;
        int b = 2;
        MyMath instance = new MyMath();
        int expResult = 0;
        int result = instance.difference(a, b);
        assertEquals(expResult, result);
    } 
}
