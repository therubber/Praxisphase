package de.leibmann.praxis1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringLineReverserTest {

    private StringLineReverser stringLineReverser = new StringLineReverser();

    @Test
    void reverseFormat() {
        StringLineReverser stringLineReverser = new StringLineReverser();
        String input = String.format("A%nB%nC%nD");
        assertEquals(String.format("D%nC%nB%nA"), stringLineReverser.reverse(input));
    } // end of reverseFormat

    @Test
    void rev() {
        StringLineReverser stringLineReverser = new StringLineReverser();
        String input = String.format("ABC%nDEF");
        assertEquals(String.format("DEF%nABC"), stringLineReverser.reverse(input));

    } // end of rev

    @Test
    void test3() {
        StringLineReverser stringLineReverser = new StringLineReverser();
        String input = String.format("ABC%nDEF%nHALLO%nWIE%nGEHTS?%n");
    } // end of test2
} // end of StringLineReverserTest