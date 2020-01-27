package de.leibmann.linkedlist;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    private LinkedList<String> stringLinkedList;
    private LinkedList<Figure> figureLinkedList;

    @BeforeEach
    void setUp() {
        stringLinkedList = new LinkedList<String>();
        stringLinkedList.add("ABC");
        stringLinkedList.add("CDE");
        stringLinkedList.add("EFG");
        figureLinkedList = new LinkedList<Figure>();
        figureLinkedList.add(new Triangle(5));
        figureLinkedList.add(new Square(10));
        figureLinkedList.add(new Triangle(7));
    }

    @Nested
    @DisplayName("Figure")
    class figureTests {
        @Test
        @DisplayName("Test size")
        void testSize() {
            assertEquals(3, figureLinkedList.size());
            figureLinkedList.add(new Triangle(7));
            assertEquals(4, figureLinkedList.size());
            figureLinkedList.removeFirst();
            assertEquals(3, figureLinkedList.size());
        }

        @Test
        @DisplayName("Test get")
        void testGet() {
            assertEquals(new Triangle(5), figureLinkedList.get(0));
            assertEquals(new Square(10), figureLinkedList.get(1));
        }

        @Nested
        @DisplayName("IndexOf Tests")
        class testIndexOf {
            @Test
            @DisplayName("Index 0")
            void testIndex0() {
                assertEquals(0, figureLinkedList.indexOf(new Triangle(5)));
            }

            @Test
            @DisplayName("Index 1")
            void testIndex1() {
                assertEquals(1, figureLinkedList.indexOf(new Square(10)));
            }

            @Test
            @DisplayName("Index 2")
            void testIndex2() {
                assertEquals(2, figureLinkedList.indexOf(new Triangle(7)));
            }

            @Test
            @DisplayName("Not Contained")
            void testNotContained() {
                assertEquals(-1, figureLinkedList.indexOf(new Triangle(700)));
            }
        }

        @Test
        @DisplayName("Test contains")
        void testContains() {
            assertFalse(figureLinkedList.contains(new Triangle(100)));
            assertTrue(figureLinkedList.contains(new Triangle(5)));
            assertTrue(figureLinkedList.contains(new Square(10)));
        }

        @Nested
        @DisplayName("Test add methods")
        class addTests {
            @Test
            @DisplayName("Add()")
            void testAdd() {
                figureLinkedList.add(new Triangle(10));
                assertTrue(figureLinkedList.contains(new Triangle(10)));
                assertEquals(3, figureLinkedList.indexOf(new Triangle(10)));
            }

            @Test
            @DisplayName("Add(index)")
            void testAddIndex() {
                figureLinkedList.add(1, new Triangle(15));
                assertEquals(1, figureLinkedList.indexOf(new Triangle(15)));
                figureLinkedList.add(2, new Square(100));
                assertEquals(2, figureLinkedList.indexOf(new Square(100)));
            }

            @Test
            @DisplayName("Add(index out of bounds)")
            void testAddIndexOutOfBounds() {
                try {
                    figureLinkedList.add(90, new Square(90));
                } catch (IndexOutOfBoundsException ioobe) {
                    System.out.println("Index out of bounds! No element was added.");
                }
            }
        }

        @Nested
        @DisplayName("Test remove methods")
        class testRemoveIndex {
            @Test
            @DisplayName("Remove index normal")
            void removeIndexNormal() {
                figureLinkedList.remove(1);
                assertFalse(figureLinkedList.contains(new Square(10)));
                figureLinkedList.remove(1);
                assertFalse(figureLinkedList.contains(new Triangle(7)));
            }

            @Test
            @DisplayName("Remove index 0")
            void removeIndexZero() {
                figureLinkedList.remove(0);
                assertFalse(figureLinkedList.contains(new Triangle(5)));
            }

            @Test
            @DisplayName("Remove all index")
            void removeAllIndex() {
                figureLinkedList.remove(2);
                figureLinkedList.remove(1);
                figureLinkedList.remove(0);
                assertTrue(figureLinkedList.isEmpty());
            }

            @Test
            @DisplayName("Remove index out of bounds")
            void removeIndexOutOfBounds() {
                try {
                    figureLinkedList.remove(-10);
                } catch (IndexOutOfBoundsException ioobe){
                    System.out.println("Index out of bounds! No element was removed.");
                }
            }

            @Test
            @DisplayName("Remove triangle")
            void removeTriangle() {
                figureLinkedList.remove(new Triangle(5));
                assertFalse(figureLinkedList.contains(new Triangle(5)));
            }

            @Test
            @DisplayName("Remove square")
            void removeSquare() {
                figureLinkedList.remove(new Square(10));
                assertFalse(figureLinkedList.contains(new Square(10)));
            }

            @Test
            @DisplayName("Remove all figure")
            void removeAllFigure() {
                figureLinkedList.remove(new Triangle(5));
                figureLinkedList.remove(new Square(10));
                figureLinkedList.remove(new Triangle(7));
                figureLinkedList.clear();
                assertTrue(figureLinkedList.isEmpty());
            }
        }

        @Test
        void testToString() {
            System.out.println(figureLinkedList.toString());
        }
    }

    @Nested
    @DisplayName("String")
    class stringTests {
        @Test
        void testSize() {
            assertEquals(3, stringLinkedList.size());
            stringLinkedList.add("EFG");
            assertEquals(4, stringLinkedList.size());
            stringLinkedList.removeFirst();
            assertEquals(3, stringLinkedList.size());
        }

        @Test
        void testGet() {
            assertEquals("ABC", stringLinkedList.get(0));
            assertEquals("CDE", stringLinkedList.get(1));
        }

        @Nested
        @DisplayName("IndexOf Tests")
        class testIndexOf {
            @Test
            void testIndex0() {
                assertEquals(0, stringLinkedList.indexOf("ABC"));
            }

            @Test
            void testIndex1() {
                assertEquals(1, stringLinkedList.indexOf("CDE"));
            }

            @Test
            void testIndex2() {
                assertEquals(2, stringLinkedList.indexOf("EFG"));
            }

            @Test
            void testNotContained() {
                assertEquals(-1, stringLinkedList.indexOf(new String("NOT CONTAINED")));
            }
        }

        @Test
        void testContains() {
            assertFalse(stringLinkedList.contains("XYZ"));
            assertTrue(stringLinkedList.contains("ABC"));
            assertTrue(stringLinkedList.contains("CDE"));
        }

        @Test
        void testAdd() {
            stringLinkedList.add("GHI");
            assertEquals(3, stringLinkedList.indexOf("GHI"));
            assertTrue(stringLinkedList.contains("GHI"));
        }

        @Test
        @DisplayName("Add(index)")
        void testAddIndex() {
            stringLinkedList.add(1, "IJK");
            assertEquals(1, stringLinkedList.indexOf("IJK"));
            stringLinkedList.add(2, "KLM");
            assertEquals(2, stringLinkedList.indexOf("KLM"));
        }

        @Test
        @DisplayName("Add(index out of bounds)")
        void testAddIndexOutOfBounds() {
            try {
                stringLinkedList.add(90, "OUT OF BOUNDS!");
            } catch (IndexOutOfBoundsException ioobe) {
                System.out.println("Index out of bounds! No element was added.");
            }
        }

        @Nested
        class testRemoveIndex {
            @Test
            void removeIndexNormal() {
                stringLinkedList.remove(1);
                assertFalse(stringLinkedList.contains("CDE"));
            }

            @Test
            void removeIndexZero() {
                stringLinkedList.remove(0);
                assertFalse(stringLinkedList.contains("ABC"));
            }

            @Test
            @DisplayName("Remove index out of bounds")
            void removeIndexOutOfBounds() {
                try {
                    stringLinkedList.remove(-10);
                } catch (IndexOutOfBoundsException ioobe){
                    System.out.println("Index out of bounds! No element was removed.");
                }
            }

            @Test
            void removeAllIndex() {
                stringLinkedList.remove(2);
                stringLinkedList.remove(1);
                stringLinkedList.remove(0);
                assertTrue(stringLinkedList.isEmpty());
            }
        }

        @Nested
        class testRemoveElement {
            @Test
            void removeTriangle() {
                stringLinkedList.remove("ABC");
                assertFalse(stringLinkedList.contains("ABC"));
            }

            @Test
            void removeSquare() {
                stringLinkedList.remove("CDE");
                assertFalse(stringLinkedList.contains("CDE"));
            }

            @Test
            void removeAllFigure() {
                stringLinkedList.remove("ABC");
                stringLinkedList.remove("CDE");
                stringLinkedList.remove("EFG");
                stringLinkedList.clear();
                assertTrue(stringLinkedList.isEmpty());
            }
        }

        @Test
        void testStringUpdate() {
            String alt = stringLinkedList.get(1);
            String neu = alt + ".";
            stringLinkedList.add(1, neu);
            assertEquals("CDE.", stringLinkedList.get(1));
            assertEquals("[ABC, CDE., CDE, EFG]", stringLinkedList.toString());
        }

        @Test
        void testToString() {
            assertEquals("[ABC, CDE, EFG]", stringLinkedList.toString());
        }
    }

    @Test
    void iterator() {
        assertEquals(3, stringLinkedList.size());

        String completeString = "";
        for (String string : stringLinkedList) {
            completeString += string;
        }

        assertEquals("ABCCDEEFG", completeString);
    }

    @Test
    void toString_empty() {
        LinkedList<String> list = new LinkedList<>();
        assertEquals("[]", list.toString());
    }

    @Test
    void removeLast() {
        int size = stringLinkedList.size();
        stringLinkedList.removeLast();
        assertEquals(size - 1, stringLinkedList.size());
    }
}