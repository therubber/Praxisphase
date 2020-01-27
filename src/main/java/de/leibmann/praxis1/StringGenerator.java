package de.leibmann.praxis1;

public class StringGenerator {
    public String calculateFizzBuzz(int counter) {
        String output = "";
        for(int i = 1; i <= counter; i++) {
            if(i % 3 == 0) {
                if (i % 5 == 0) {
                    output += append("FizzBuzz");
                } else {
                    output += append("Fizz");
                }  // end of if-else
            } else if(i % 5 == 0) {
                output += append("Buzz");
            } else {
                output += append(Integer.toString(i));
            } // end of if-else
        } // end of for
        return output;
    } // end of fb

    private String append(String add) {
        return add + System.lineSeparator();
    } // end of append
} // end of StringGenerator
