package de.leibmann.linkedlist;

import java.util.Objects;

public class Square implements Figure{
    private double x;
    private double y;
    private String type = "Square";

    public Square(double x) {
        this.x = x;
    } // end of constructor

    public String dimensions() {
        return "x: " + this.x;
    } // end of dimensions

    public double area() {
        return x * x;
    } // end of area

    public double circumference() {
        return 4 * x;
    } // end of circumference

    public String type() {
        return this.type;
    } // end of getType

    @Override
    public String toString() {
        return "Square with side length " + x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.x, x) == 0 &&
                Double.compare(square.y, y) == 0 &&
                Objects.equals(type, square.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, type);
    }
} // end of Square
