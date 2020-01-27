package de.leibmann.praxis1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BindestricheTest {

    public static Bindestriche bindestriche;

    @BeforeEach
    void setUp() {
        bindestriche = new Bindestriche();
    } // end of setUp

    @Test
    void test5Bindestriche() {
        assertEquals("-----", bindestriche.malStriche(5));
    } // end of testBindestriche

    @Test
    void test10Bindestriche() {
        assertEquals("----------", bindestriche.malStriche(10));
    } // end of test10Bindestriche

    @Test
    void test100Bindestriche() {
        assertEquals("----------------------------------------------------------------------------------------------------", bindestriche.malStriche(100));
    } // end of test100Bindestriche
} // end of BindestricheTest5