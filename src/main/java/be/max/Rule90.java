package be.max;

public class Rule90 implements Rule {

    //In the case of Rule 90, each cell's new value is the exclusive or of the two neighboring values.
    public boolean transformState(boolean stateA, boolean stateB, boolean stateC){
        return stateA ^ stateC;
    }

    public Cell apply(Cell cell1, Cell cell2, Cell cell3){
        return new Cell(transformState(cell1.getState(), cell2.getState(), cell3.getState()));
    }
}
