package de.leibmann.praxis1;

public class SumRecursive {

    public int sum(int counter) {
        return (counter >= 0) ? counter + sum(--counter) : 0;
    } // end of sum

} // end of sumRecursive
