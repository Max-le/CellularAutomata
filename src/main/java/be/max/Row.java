package be.max;

import java.util.ArrayList;
import java.util.List;

public class Row {

    private List<Cell> cells;

    public Row() {
        this.cells = new ArrayList<Cell>();
    }

    public int size(){
        return cells.size();
    }

    public void add(Cell c){
        cells.add(c);
    }
    //Creates a new cell directly from the state
    public void add(boolean stateNewCell){
        cells.add(new Cell(stateNewCell));
    }
    public Cell get(int index){
        return cells.get(index);
    }


    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Cell c : cells){
            s.append(c.toString()).append(" ");
        }
        return s.toString();
    }
}
