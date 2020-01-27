/*package de.leibmann.nikolaus;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NikolausTest {

    private Haus nikolausZero;
    private Haus nikolausOne;
    private Haus nikolausTwo;

    @BeforeEach
    void setUp() {
        nikolausZero = new Haus();
        nikolausZero.draw(0);
        nikolausOne = new Haus();
        nikolausOne.draw(1);
        nikolausTwo = new Haus();
        nikolausTwo.draw(3);
    }

    @Test
    @DisplayName("Solution count point 0")
    void testSolCountZero() {
        System.out.println(nikolausOne.solutions.toString());
        assertEquals(44, nikolausOne.solutions.size());
    }

    @Test
    @DisplayName("Solution count point 1")
    void testSolCountOne() {
        assertEquals(44, nikolausOne.solutions.size());
    }

    @Test
    @DisplayName("Solution count point 2")
    void testSolCountTwo() {
        assertEquals(0, nikolausTwo.solutions.size());
    }
}

*/