import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person a, b, c;

    @BeforeEach
    void setUp() {
        a = new Person("Horst", 65);
        b = new Person("Tom", 25);
        c = new Person("Philipp", 37);
    } // end of setUp

    @Test
    void testAges() {
        assertEquals(a.getAge(), 65);
        assertEquals(b.getAge(), 25);
        assertEquals(c.getAge(), 37);
    } // end of testPerson

    @Test
    void testFirstnames() {
        assertEquals(a.getFirstname(), "Horst");
        assertEquals(b.getFirstname(), "Tom");
        assertEquals(c.getFirstname(), "Philipp");
    } // end of testFirstnames

} // end of class PersonTest