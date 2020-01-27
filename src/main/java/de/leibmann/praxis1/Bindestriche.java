package de.leibmann.praxis1;

public class Bindestriche {

    public static void main(String[] args) {
        Bindestriche bindestriche = new Bindestriche();
        String out = bindestriche.malStriche(100);
        System.out.println(out);
    } // end of main

    /*private String malStriche(int min, int max, String out) {
        if (min <= max) {
            out += "-";
            return malStriche(min + 1, max, out);
        } // end of if
        return out;
    } // end of Bindestriche */

    public String malStriche(int max) {
        if (max <= 0) return "";
        return "-" + malStriche(--max);
    } // end of Bindestriche
} // end of class Bindestriche