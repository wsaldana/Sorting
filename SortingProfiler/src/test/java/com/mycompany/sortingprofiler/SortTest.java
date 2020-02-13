/*
 * Pruebas de JUnit
 */
package com.mycompany.sortingprofiler;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Danilo
 */
public class SortTest {
    
    public SortTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    

    /**
     * Test of selection method, of class Sort.
     */
    @org.junit.jupiter.api.Test
    public void testSelection() {
        System.out.println("selection");
        int[] data = null;
        Sort instance = new Sort();
        instance.selection(data);
        fail("The test case is a prototype.");
    }

    /**
     * Test of mergeSort method, of class Sort.
     */
    @org.junit.jupiter.api.Test
    public void testMergeSort() {
        System.out.println("mergeSort");
        int[] data = null;
        Sort.mergeSort(data);
        fail("The test case is a prototype.");
    }

    /**
     * Test of quickSort method, of class Sort.
     */
    @org.junit.jupiter.api.Test
    public void testQuickSort() {
        System.out.println("quickSort");
        int[] data = null;
        Sort.quickSort(data);
        fail("The test case is a prototype.");
    }

    /**
     * Test of radixSort method, of class Sort.
     */
    @org.junit.jupiter.api.Test
    public void testRadixSort() {
        System.out.println("radixSort");
        int[] data = null;
        Sort.radixSort(data);
        fail("The test case is a prototype.");
    }

    /**
     * Test of bucketPass method, of class Sort.
     */
    @org.junit.jupiter.api.Test
    public void testBucketPass() {
        System.out.println("bucketPass");
        int[] data = null;
        int d = 0;
        Sort.bucketPass(data, d);
        fail("The test case is a prototype.");
    }

    /**
     * Test of digit method, of class Sort.
     */
    @org.junit.jupiter.api.Test
    public void testDigit() {
        System.out.println("digit");
        int n = 0;
        int d = 0;
        int expResult = 0;
        int result = Sort.digit(n, d);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of bubble method, of class Sort.
     */
    @org.junit.jupiter.api.Test
    public void testBubble() {
        System.out.println("bubble");
        int[] data = null;
        Sort instance = new Sort();
        instance.bubble(data);
        fail("The test case is a prototype.");
    }

    /**
     * Test of swap method, of class Sort.
     */
    @org.junit.jupiter.api.Test
    public void testSwap() {
        System.out.println("swap");
        int[] data = null;
        int i = 0;
        int j = 0;
        Sort.swap(data, i, j);
        fail("The test case is a prototype.");
    }
    
}
