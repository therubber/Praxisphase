package de.leibmann.nikolaus;

import java.util.Objects;

public class Point {
    int location;
    Point next1, next2, next3, next4;

    public Point(int location) {
        this.location = location;
    }

    public Point(int location, Point next1, Point next2) {
        this.location = location;
        this.next1 = next1;
        this.next2 = next2;
    }

    public Point(int location, Point next1, Point next2, Point next3) {
        this.location = location;
        this.next1 = next1;
        this.next2 = next2;
        this.next3 = next3;
    }

    public Point(int location, Point next1, Point next2, Point next3, Point next4) {
        this.location = location;
        this.next1 = next1;
        this.next2 = next2;
        this.next3 = next3;
        this.next4 = next4;
    }

    public void nextNull() {
        if (next1 != null) {
            setNext1(null);
        } else if (next2 != null) {
            setNext2(null);
        } else if (next3 != null) {
            setNext3(null);
        } else if (next4 != null) {
            setNext4(null);
        }
    }

    public void setNext1(Point next1) {
        this.next1 = next1;
    }

    public void setNext2(Point next2) {
        this.next2 = next2;
    }

    public void setNext3(Point next3) {
        this.next3 = next3;
    }

    public void setNext4(Point next4) {
        this.next4 = next4;
    }

    public boolean hasNext() {
        if (next1 != null || next2 != null || next3 != null || next4 != null) {
            return true;
        }
        return false;
    }

    public Point moveNext() {
        if (next1 != null) {
            return next1;
        } else if (next2 != null) {
            return next2;
        } else if (next3 != null) {
            return next3;
        } else if (next4 != null) {
            return next4;
        }
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return location == point.location;
    }

    @Override
    public int hashCode() {
        return Objects.hash(location);
    }

    @Override
    public String toString() {
        return Integer.toString(location);
    }
}
