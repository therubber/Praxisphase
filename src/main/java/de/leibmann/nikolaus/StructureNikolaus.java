package de.leibmann.nikolaus;

import de.leibmann.linkedlist.LinkedList;

public class StructureNikolaus {

    LinkedList<Point> connections;
    Point zero = new Point(0);
    Point one = new Point(1);
    Point two = new Point(2);
    Point three = new Point(3);
    Point four = new Point(4);

    public StructureNikolaus() {
        zero.setNext1(one);
        zero.setNext2(three);
        zero.setNext3(four);
        one.setNext1(zero);
        one.setNext2(two);
        one.setNext3(three);
        one.setNext4(four);
        two.setNext1(one);
        two.setNext2(three);
        three.setNext1(zero);
        three.setNext2(one);
        three.setNext3(two);
        three.setNext4(four);
        four.setNext1(zero);
        four.setNext2(one);
        four.setNext3(three);
    }
}
