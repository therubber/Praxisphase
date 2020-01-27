package de.leibmann.praxis1;

public class StringGeneratorRecursiveTail {

    public static void main(String[] args) {
        StringGeneratorRecursiveTail stringGeneratorRecursiveTail = new StringGeneratorRecursiveTail();
        String out = stringGeneratorRecursiveTail.fbRecursive(100);
        System.out.println(out);
    } // end of main

    public String fbRecursive(int max) {
        int min = 1;
        String output = "";
        return fbRecursive(min, max, output);
    } // end of fbRecursive

    private String fbRecursive(int min, int max, String output) {
        if (min > max) {
            return "";
        } else {
            if (min % 3 == 0) {
                if (min % 5 == 0) {
                    return output += append("FizzBuzz") + fbRecursive(min + 1, max, output);
                } else {
                    return output + append("Fizz") + fbRecursive(min + 1, max, output);
                }  // end of if-else
            } else if (min % 5 == 0) {
                return output + append("Buzz") + fbRecursive(min + 1, max, output);
            } else {
                return output + append(Integer.toString(min)) + fbRecursive(min + 1, max, output);
            } // end of if-else
        } // end of if-else
    } // end of fbRecursive

    private String append(String add) {
        return add + System.lineSeparator();
    } // end of append

} // end of StringGenerator


