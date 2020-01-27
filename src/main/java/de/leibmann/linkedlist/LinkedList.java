package de.leibmann.linkedlist;

import javax.swing.text.Element;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<E> implements Iterable<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size;

    /** Default constructor **/
    public LinkedList() {
    }

    /** Creates a LinkedList and fills it with Elements containing all Objects in the Array
     * @param objects Array of objects to add to the list
     */
    public LinkedList(E[] objects) {
        for (int i = 0; i < objects.length; i++) {
            add(objects[i]);
        }
    }

    public Iterator<E> iterator() {
        return new ListIterator<>(head);
    }

    static class ListIterator<E> implements Iterator<E> {

        private Node<E> current;

        public ListIterator(Node<E> head) {
            current = head;
        }

        public boolean hasNext() {
            return current != null;
        }

        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            E out = current.getValue();
            current = current.getNext();
            return out;
        }
    }

    /**
     * Returns the size of the list
     * @return Returns the int size of the list
     */
    public int size() {
        return size;
    }

    /**
     * Adds an element at the end of the list
     * @param object Element that is added to the list
     */
    public void add(E object) {
        Node<E> node = new Node<>(object);
        if (head == null) {
            head = node;
            tail = head;
        } else {
            tail.setNext(node);
            tail = node;
        }
        size += 1;
    }

    /**
     * Adds an element at the index of the int parameter
     * @param object Figure that is added to the list
     * @param index Index where the element is added
     * @throws IndexOutOfBoundsException if there is no element at index
     */
    public void add(int index, E object) {
        Node<E> node = new Node<>(object);
        if (size >= 2 && index < size && index > 0) {
            Node<E> before = getElement(index - 1);
            node.setBefore(before);
            node.setNext(before.getNext());
            before.setNext(node);
        } else if (index == 0) {
            node.setNext(head);
            head = node;
        } else if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
    }

    /** Adds a node to the beginning of the list
     * @param object node to add to the beginning
     */
    public void addFirst(E object) {
        add(0, object);
    }

    /**
     * Gets an element at the index of the parameter
     * @param index Int index of the object you want returned
     **/
    public E get(int index) {
        Node<E> current = head;
        if (index > 0 && index < size()) {
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
        } else if (index == 0) {
            return getFirst();
        } else {
            throw new IndexOutOfBoundsException();
        }
        return current.getValue();
    }

    private Node<E> getElement(int index) {
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    /**
     * Gets the first element of the list
     * @return First element in the list
     */
    Node<E> getFirstElement() {
        return head;
    }

    E getFirst() {
        return head.getValue();
    }

    /**
     * Gets the last element of the list
     * @return Last element in the list
     */
    public Node<E> getTailElement() {
        return tail;
    }

    public E getTail() {
        return get(size - 1);
    }

    /**
     * Checks whether an element is contained in the list
     * @param object Figure whose containment is checked
     * @return Boolean whether the element is contained
     */
    public boolean contains(E object) {
        Node<E> node = new Node<>(object);
        boolean contains = false;
        Node<E> current = head;
        for (E value : this) {
            if (current.equals(node)) {
                contains = true;
            }
            current = current.getNext();
        }
        return contains;
    }

    /**
     * Checks what index the parameter element has in the list
     * @param object Element whose index is returned if contained
     * @return Index of the element in the list
     */
    public int indexOf(E object) {
        Node<E> node = new Node<>(object);
        int index = 0;
        int temp = 0;
        if (contains(object)) {
            Node<E> current = head;
            for (E value : this) {
                if (current.equals(node)) {
                    index = temp;
                }
                current = current.getNext();
                temp++;
            }
        } else {
            index = -1;
        }
        return index;
    }

    /**
     * Removes the first element in the list
     */
    public void removeFirst() {
        head = head.getNext();
        head.setBefore(null);
        size--;
    }

    public void removeLast() {
        // TODO: Doppelverkettung einbauen
        if (head != null) {
            remove(size - 1);
        } else {
            head = null;
        }
    }

    /**
     * Removes any elements equal to the parameter element unless it isn't contained in the list.
     * @param object element that is removed
     */
    public void remove(E object) {
        // TODO: Doppelverkettung
        remove(indexOf(object));
    }

    /**
     * Reads an int parameter and removes the element at that index out of the list
     * @param index Index at which an element is removed
     * @throws IndexOutOfBoundsException If there is no element at index
     */
    public void remove(int index) {
        // TODO: Doppelverkettung
        if (size > 2) {
            if (index < size - 1) {
                if (index > 0) {
                    Node<E> before = getElement(index - 1);
                    before.setNext(getElement(index + 1));
                    size--;
                } else if (index == 0){
                    removeFirst();
                    size--;
                } else {
                    throw new IndexOutOfBoundsException();
                }
            } else if (index == size - 1) {
                removeLast();
                size--;
            } else {
                throw new IndexOutOfBoundsException();
            }
        } else {
            if (index == 1) {
                head.setNext(null);
                size = 1;
            } else {
                clear();
            }
        }
    }

    /**
     * Clears the list of all elements
     */
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    /**
     * Checks whether the list is empty
     * @return Boolean whether the list is empty
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Returns the list as string
     * @return String of all elements in the list
     */
    @Override
    public String toString() {
        StringBuilder complete = new StringBuilder("[");
        for (E value : this) {
            complete.append(value);
            complete.append(", ");
        }
        if (this.size != 0) {
            complete.replace(complete.length() - 2,complete.length(), "]");
        } else {
            complete.append("]");
        }
        return complete.toString();
    }
}
