package de.leibmann.linkedlist;

import java.util.Objects;

public class Node<E> {

    private E value;
    private Node<E> next;

    public Node(E value) {
        this.value = value;
    }

    void setNext(Node<E> node) {
        next = node;
    }

    Node<E> getNext() {
        return this.next;
    }

    void setValue(E value) {
        this.value = value;
    }

    E getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node<?> node = (Node<?>) o;
        return Objects.equals(value, node.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
