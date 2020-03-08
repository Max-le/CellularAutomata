package be.max;

import java.util.Random;

/**
 * Provides methods to generate an initial row.
 */
public class Generator {
    public static Row generateRandomRow(int size) {
        Row row = new Row();
        for (int i = 0; i < size; i++) {
            Random rgn = new Random();
            row.add(new Cell(rgn.nextBoolean()));
        }
        return row;
    }
    public static Row oneCellRow(int size){
        Row row = new Row();
        for (int i = 0; i < size; i++) {
            if (i == size/2){
                row.add(true);
            }
            else{
                row.add(false);
            }
        }
        return row;
    }
}
