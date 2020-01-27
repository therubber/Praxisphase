package de.leibmann.nikolaus;

import de.leibmann.linkedlist.LinkedList;

import java.util.Arrays;

public class Nikolaus {

    LinkedList<String> solutions = new LinkedList<>();
    private final boolean[][] adjacence =  {{false, true, false, true, true},
                                            {true, false, true, true, true},
                                            {false, true, false, true, false},
                                            {true, true, true, false, true},
                                            {true, true, false, true, false}};

    public static void main(String[] args) {
        Nikolaus nikolaus = new Nikolaus();
        nikolaus.draw();
        System.out.println(nikolaus.toString());
    }

    public static boolean[][] copy(boolean[][] current) {
        boolean[][] copy = new boolean[current.length][current.length];
        for (int i = 0; i < current.length; i++) {
            for (int j = 0; j < current.length; j++) {
                copy[i][j] = current[i][j];
            }
        }
        return copy;
    }

    public void draw() {
        int[] solution = new int[9];
        draw(adjacence, solution, 0, 0);
    }

    private int draw(boolean[][] current, int[] edges, int cursor, int lineCount) {
        edges[lineCount] = cursor;
        if (lineCount == 8) {
            solutions.add(Arrays.toString(edges));
            return lineCount - 1;
        }

        for(int i = 0; i < 5; i++) {
            if(current[cursor][i]) {
                boolean[][] newEdges = copy(current);
                newEdges[i][cursor] = false;
                newEdges[cursor][i] = false;
                lineCount = draw(newEdges, edges, i, lineCount+1);
            }
        }
        return lineCount - 1;
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder("");
        out.append("Count of solutions found: ");
        out.append(Integer.toString(this.solutions.size()));
        out.append(System.lineSeparator());
        for(String solution : this.solutions) {
            out.append(solution);
            out.append(System.lineSeparator());
        }
        return out.toString();
    }
}
