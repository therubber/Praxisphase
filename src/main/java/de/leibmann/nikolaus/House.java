package de.leibmann.nikolaus;

import de.leibmann.linkedlist.LinkedList;

import java.util.Objects;

public class House {
    LinkedList<Edge> edges = new LinkedList<>();

    void clear() {
        edges.clear();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return Objects.equals(edges, house.edges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edges);
    }

    @Override
    public String toString() {
        return "House{" +
                "edges=" + edges +
                '}';
    }
}
