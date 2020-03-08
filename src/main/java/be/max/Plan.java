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

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Row row: rows){
            s.append(row.toString()).append("\n");
        }
        return s.toString();
    }
}
