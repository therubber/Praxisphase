package de.leibmann.praxis1;

public class StringLineReverser {

    public String reverse(String input) {
        String[] split = input.split(System.lineSeparator());
        String[] out = new String[split.length];
        int i = 0;
        int j = split.length - 1;
        for (String line : split) {
            out[j--] = line;
        }
        /*for (int i = 0; i < split.length; i++) {
            String temp = split[j];
            out[i] = temp;
            j--;
        } // end of for */
        return String.join(System.lineSeparator(), out);
    } // end of reverse

    /* public String reverseCharArray(String input) {
        StringLineReverser stringLineReverser = new StringLineReverser();
        char[] inputChar = input.toCharArray();
        char[] reverse = new char[inputChar.length];
        int j = reverse.length - 1;
        for (int i = 0; i < reverse.length; i++) {
            if (inputChar[j] != '\r' && inputChar[j] != '\n') {
                    reverse[i] = inputChar[j];
                    j--;
            } else {
                reverse[i] = '%';
                i++;
                j--;
                reverse[i] = 'n';
                j--;
            } // end of if-else
        } // end of for
        String s = new String(reverse);
        String out = String.format(s);
        return out;
    } // end of reverseCharArray */
} // end of StringLineReverser
