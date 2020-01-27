package de.leibmann.praxis1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumRecursiveTest {

    public static SumRecursive sumRecursive;

    @BeforeEach
    void setUp() {
        sumRecursive = new SumRecursive();
    }

    @Test
    void test10Recursive() {
        assertEquals(55, sumRecursive.sum(10));
    }

    @Test
    void test5Recursive() {
        assertEquals(15, sumRecursive.sum(5));
    }

    @Test
    void test150Recursive() {
        assertEquals(120, sumRecursive.sum(15));
    }

    @Test
    void test75Recursive() {
        assertEquals(28, sumRecursive.sum(7));
    }
} // end of SumRecursiveTest
