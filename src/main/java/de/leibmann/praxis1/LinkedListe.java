package de.leibmann.praxis1;
import java.sql.SQLOutput;
import java.util.LinkedList;
public class LinkedListe {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        int counter = 50;
        for(int i = 0; i < counter; i++) {
            list.add(Integer.valueOf(i * i));
        } // end of for
        System.out.println(list);
        System.out.println(list.contains(Integer.valueOf(400)));
        System.out.println(list.size());
    } // end of main
} // end of LinkedList