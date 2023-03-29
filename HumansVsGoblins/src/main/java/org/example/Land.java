package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.IntStream;

public class Land {

    int size = 8;
    String emptyCharacter = "0";

    public String drawLand() {
        ArrayList<ArrayList<String>> landMap= new ArrayList<>();
        for (int i = 0; i < size; i++) {
            ArrayList<String> row = new ArrayList<>();
            for (int j = 0; j <  size; j++) {
                row.add(emptyCharacter);
            }
            landMap.add(row);
        }
        for (ArrayList<String> row : landMap) System.out.println(row);
        return "Here is the starting map";
    }
}
