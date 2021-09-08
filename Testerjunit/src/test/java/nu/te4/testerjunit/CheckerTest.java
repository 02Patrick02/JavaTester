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
public class CheckerTest {
    
    public CheckerTest() {
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
    public void isPalindrome() {
        System.out.println("isPalindrome");
        String input = "ABBA";
        Checker checker = new Checker();
        assertEquals(checker.isPalindrome(input), true);
    }
    
    @Test
    public void testNull(){
        System.out.println("isNull");
        Checker checker = new Checker();
        assertThrows(IllegalArgumentException.class, () ->{
        checker.isPalindrome(null);
        });
    }
    
    @Test
    public void testNotPalindrome(){
        System.out.println("isNull");
        Checker checker = new Checker();
        assertEquals(checker.isPalindrome("NOT"), false);
    }
    
    @Test
    public void isLessThan0(){
        System.out.println("isLess");
        Checker checker = new Checker();
        assertThrows(IllegalArgumentException.class, () ->{
            checker.isPrimeNumber(-1);
        });
    }
    
}
