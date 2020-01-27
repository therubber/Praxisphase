package de.leibmann.nikolaus;

import de.leibmann.linkedlist.LinkedList;

public class FindHouses {

    LinkedList<House> solutions = new LinkedList<>();
    StructureNikolaus nikolaus = new StructureNikolaus();

    public static void main(String[] args) {
        FindHouses findHouses = new FindHouses();
        findHouses.draw();
    }

    public void draw() {
        draw(new House(), nikolaus.zero, 0);
    }

    private int draw(House house, Point cursor, int lineCount) {
        if (lineCount == 8) {
            solutions.add(house);
            return lineCount - 1;
        }

        if(cursor.hasNext()) {
            if (house.edges.contains(new Edge(cursor, cursor.moveNext()))) {
                cursor = house.edges.getTail().from;
                house.edges.removeLast();
                lineCount = draw(house, cursor, lineCount - 1);
            } else {
                house.edges.add(new Edge(cursor, cursor.moveNext()));
                Point tempCursor = cursor.moveNext();
                lineCount = draw(house, tempCursor, lineCount + 1);
            }
        }
        return lineCount - 1;
    }
}
