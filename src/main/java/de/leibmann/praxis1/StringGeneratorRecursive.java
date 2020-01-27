package de.leibmann.praxis1;

public class StringGeneratorRecursive {

    public String output = "";

    public static void main(String[] args) {
        StringGeneratorRecursive s = new StringGeneratorRecursive();
        String o = s.fbRecursive(0, 100);
        System.out.println(o);
    } // end of main

    public String fbRecursive(int min, int max) {
        if (min <= max) {
            if (min == 0) {min += 1;}
            if (min % 3 == 0) {
                if (min % 5 == 0) {
                    output += append("FizzBuzz");
                    fbRecursive(min + 1, max);
                } else {
                    output += append("Fizz");
                    fbRecursive(min + 1, max);
                }  // end of if-else
            } else if (min % 5 == 0) {
                output += append("Buzz");
                fbRecursive(min + 1, max);
            } else {
                output += append(Integer.toString(min));
                fbRecursive(min + 1, max);
            } // end of if-else
        } // end of if
        return output;
    } // end of fbRecursive

    private String append(String add) {
        return add + System.lineSeparator();
    } // end of append

} // end of StringGenerator


