/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calcrpn;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author C0467277
 */
public class CalcRPNOperationsTest {
    
    public CalcRPNOperationsTest() {
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
     * Test of digit method, of class CalcRPNOperations.
     */
    @Test
    public void testDigit() {
        System.out.println("digit");
        String digit = "";
        CalcRPNOperations instance = new CalcRPNOperationsImpl();
        String expResult = "";
        String result = instance.digit(digit);
        assertEquals(expResult, result);
    }

    /**
     * Test of operator method, of class CalcRPNOperations.
     */
    @Test
    public void testOperator() {
        System.out.println("operator");
        String op = "";
        CalcRPNOperations instance = new CalcRPNOperationsImpl();
        String expResult = "";
        String result = instance.operator(op);
        assertEquals(expResult, result);
    }

    /**
     * Test of clearEntry method, of class CalcRPNOperations.
     */
    @Test
    public void testClearEntry() {
        System.out.println("clearEntry");
        CalcRPNOperations instance = new CalcRPNOperationsImpl();
        String expResult = "";
        String result = instance.clearEntry();
        assertEquals(expResult, result);
    }

    /**
     * Test of clear method, of class CalcRPNOperations.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        CalcRPNOperations instance = new CalcRPNOperationsImpl();
        String expResult = "";
        String result = instance.clear();
        assertEquals(expResult, result);
    }

    /**
     * Test of enterPressed method, of class CalcRPNOperations.
     */
    @Test
    public void testEnterPressed() {
        System.out.println("enterPressed");
        CalcRPNOperations instance = new CalcRPNOperationsImpl();
        String expResult = "";
        String result = instance.enterPressed();
        assertEquals(expResult, result);
    }

    /**
     * Test of addDecimal method, of class CalcRPNOperations.
     */
    @Test
    public void testAddDecimal() {
        System.out.println("addDecimal");
        CalcRPNOperations instance = new CalcRPNOperationsImpl();
        String expResult = "";
        String result = instance.addDecimal();
        assertEquals(expResult, result);

    }

    public class CalcRPNOperationsImpl implements CalcRPNOperations {

        public String digit(String digit) {
            return "";
        }

        public String operator(String op) {
            return "";
        }

        public String clearEntry() {
            return "";
        }

        public String clear() {
            return "";
        }

        public String enterPressed() {
            return "";
        }

        public String addDecimal() {
            return "";
        }
    }
    
}
