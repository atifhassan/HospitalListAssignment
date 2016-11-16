/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structures;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Atif Hassan
 */
public class BinarySearchTreeTest {
    
    /**
     *
     */
    public BinarySearchTreeTest() {
    }
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of Add method, of class BinarySearchTree.
     */
    @Test
    public void testAdd() {
        System.out.println("Add");
        BinarySearchTree instance = new BinarySearchTree();
        instance.Add("C");
        instance.Add("O");
        instance.Add("M");
        instance.Add("P");
        instance.Add("A");
        instance.Add("B");
        Object expResult = 6;
        Object result = instance.Size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Remove method, of class BinarySearchTree.
     * @throws java.lang.Exception
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("Remove");
        BinarySearchTree instance = new BinarySearchTree();
        instance.Add("C");
        instance.Add("O");
        instance.Add("M");
        instance.Add("P");
        instance.Add("A");
        instance.Add("B");
        Object expResult = "P";
        Object result = instance.Remove("P");
        assertEquals(expResult, result);
        System.out.println(instance.Size());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Contains method, of class BinarySearchTree.
     * @throws java.lang.Exception
     */
    @Test
    public void testContains() throws Exception {
        System.out.println("Contains");
        BinarySearchTree instance = new BinarySearchTree();
        instance.Add("C");
        instance.Add("O");
        instance.Add("M");
        instance.Add("P");
        instance.Add("A");
        instance.Add("B");
        boolean expResult = true;
        boolean result = instance.Contains("B");
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class BinarySearchTree.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        BinarySearchTree instance = new BinarySearchTree();
        instance.Add("C");
        instance.Add("O");
        instance.Add("M");
        instance.Add("P");
        instance.Add("A");
        instance.Add("B");
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Size method, of class BinarySearchTree.
     */
    @Test
    public void testSize() {
        System.out.println("Size");
        BinarySearchTree instance = new BinarySearchTree();
        instance.Add("C");
        instance.Add("O");
        instance.Add("M");
        instance.Add("P");
        instance.Add("A");
        instance.Add("B");
        int expResult = 6;
        int result = instance.Size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Get method, of class BinarySearchTree.
     * @throws java.lang.Exception
     */
    @Test
    public void testGet() throws Exception {
        System.out.println("Get");
        BinarySearchTree instance = new BinarySearchTree();
        instance.Add("C");
        instance.Add("O");
        instance.Add("M");
        instance.Add("P");
        instance.Add("A");
        instance.Add("B");
        Object expResult = "P";
        Object result = instance.Get("P");
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Reset method, of class BinarySearchTree.
     */
    @Test
    public void testReset() {
        System.out.println("Reset");
        BinarySearchTree instance = new BinarySearchTree();
        instance.Add("C");
        instance.Add("O");
        instance.Add("M");
        instance.Add("P");
        instance.Add("A");
        instance.Add("B");
        instance.Reset();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNext method, of class BinarySearchTree.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetNext() throws Exception {
        System.out.println("getNext");
        BinarySearchTree instance = new BinarySearchTree();
        instance.Add("C");
        instance.Add("O");
        instance.Add("M");
        instance.Add("P");
        instance.Add("A");
        instance.Add("B");
        Object expResult = null;
        Object result = instance.getNext();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
