package de.leibmann.nikolaus;

import java.util.Objects;

public class Edge {

    Point to, from;

    public Edge(Point from, Point to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edge edge = (Edge) o;
        return Objects.equals(to, edge.to) && Objects.equals(from, edge.from) || Objects.equals(to, edge.from) && Objects.equals(from, edge.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to);
    }

    @Override
    public String toString() {
        return from + "->" + to;
    }
}

