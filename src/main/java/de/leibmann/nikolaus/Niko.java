package de.leibmann.nikolaus;

import de.leibmann.linkedlist.LinkedList;

public class Niko {

    LinkedList<House> solutions = new LinkedList<>();
    House house = new House();
    private final boolean[][] adjacence =  {{false, true, false, true, true},
                                            {true, false, true, true, true},
                                            {false, true, false, true, false},
                                            {true, true, true, false, true},
                                            {true, true, false, true, false}};

    public static void main(String[] args) {
        Niko niko = new Niko();
        niko.draw();
        System.out.println(niko.solutions.toString());
    }

    public boolean[][] copy(boolean[][] current) {
        boolean[][] copy = new boolean[current.length][current.length];
        for (int i = 0; i < current.length; i++) {
            for (int j = 0; j < current.length; j++) {
                copy[i][j] = current[i][j];
            }
        }
        return copy;
    }

    public void draw() {
        draw(adjacence, 0, 0);
    }

    private int draw(boolean[][] current, int cursor, int lineCount) {
        if (lineCount == 8) {
            solutions.add(house);
            house.clear();
            return lineCount - 1;
        }

        for (int i = 1; i < 5; i++) {
            if (adjacence[i][lineCount]) {
                boolean[][] copy = copy(current);
                copy[lineCount][i] = false;
                copy[i][lineCount] = false;
                house.edges.add(new Edge(new Point(i), new Point(lineCount)));
                lineCount = draw(copy, i, lineCount + 1);
            } else {
                house.edges.remove(house.edges.size() - 1);
                lineCount = draw(current, cursor, lineCount - 1);
            }
        }
        return lineCount - 1;
    }
}
