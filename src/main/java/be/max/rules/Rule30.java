package be.max.rules;

import be.max.Cell;
import be.max.Rule;

public class Rule30 implements Rule {
    //Contains the actual logic (rule) of evolution
    public boolean transformState(boolean stateA, boolean stateB, boolean stateC){
        return stateA ^ (stateB || stateC);
    }

    public Cell apply(Cell cell1, Cell cell2, Cell cell3){
        return new Cell(transformState(cell1.getState(), cell2.getState(), cell3.getState()));
    }
}
