package de.leibmann.praxis1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringGeneratorRecursiveTest {

    public StringGeneratorRecursive generator;

    @BeforeEach
    void setUp() {
        generator = new StringGeneratorRecursive();
    } // end of setUp

    @Test
    void testFizzBuzz() {
		String expected = "1\r\n2\r\nFizz\r\n4\r\nBuzz\r\nFizz\r\n7\r\n8\r\nFizz\r\nBuzz\r\n11\r\nFizz\r\n13\r\n14\r\nFizzBuzz\r\n16\r\n17\r\nFizz\r\n19\r\nBuzz\r\nFizz\r\n22\r\n23\r\nFizz\r\nBuzz\r\n26\r\nFizz\r\n28\r\n29\r\nFizzBuzz\r\n31\r\n32\r\nFizz\r\n34\r\nBuzz\r\nFizz\r\n37\r\n38\r\nFizz\r\nBuzz\r\n41\r\nFizz\r\n43\r\n44\r\nFizzBuzz\r\n46\r\n47\r\nFizz\r\n49\r\nBuzz\r\nFizz\r\n52\r\n53\r\nFizz\r\nBuzz\r\n56\r\nFizz\r\n58\r\n59\r\nFizzBuzz\r\n61\r\n62\r\nFizz\r\n64\r\nBuzz\r\nFizz\r\n67\r\n68\r\nFizz\r\nBuzz\r\n71\r\nFizz\r\n73\r\n74\r\nFizzBuzz\r\n76\r\n77\r\nFizz\r\n79\r\nBuzz\r\nFizz\r\n82\r\n83\r\nFizz\r\nBuzz\r\n86\r\nFizz\r\n88\r\n89\r\nFizzBuzz\r\n91\r\n92\r\nFizz\r\n94\r\nBuzz\r\nFizz\r\n97\r\n98\r\nFizz\r\nBuzz\r\n";
		assertEquals(expected, generator.fbRecursive(0, 100));
    } // end of test()

    @Test
    void ajsigas() {
        assertEquals("1" + System.lineSeparator(), generator.fbRecursive(0, 1));
    }

    @Nested
    @DisplayName("Mir eigentlich egal")
    class MirEgal {
        @Test
        @DisplayName("Der Test #1")
        void lksajgs() {
            assertEquals("1" + System.lineSeparator() + "2" + System.lineSeparator(), generator.fbRecursive(0, 1));
        }
    }

    @Test
    @DisplayName("Hallo - das ist ein Name mit Leerzeichen")
    void oksoijgoisaz() {
        assertEquals("1" + System.lineSeparator() + "2" + System.lineSeparator() + "Fizz" + System.lineSeparator(), generator.fbRecursive(0, 3));
    }
} // end of class


