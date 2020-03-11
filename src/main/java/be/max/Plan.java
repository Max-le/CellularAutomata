package be.max;

import java.util.ArrayList;
import java.util.List;

/**
 * A plan is a set of rows.
 */
public class Plan {
    List<Row> rows;

    public Plan() {
        rows = new ArrayList<Row>();
    }

    public void add(Row row) {
        rows.add(row);
    }


    //Represents the plan as a 2 dimension array filled with true and false to indicate the state of the cells.
    public boolean[][] toArray(){
        int nbrRows = rows.size();
        int lengthRows = rows.get(0).size();
        boolean[][] boolsArray = new boolean[nbrRows][lengthRows];
        for (int i = 0; i < nbrRows; i++) {
            Row row = rows.get(i);
            for (int j = 0; j < lengthRows; j++) {
                boolsArray[i][j] = row.get(j).getState();
            }
        }
        return boolsArray;
        
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Row row: rows){
            s.append(row.toString()).append("\n");
        }
        return s.toString();
    }
}
