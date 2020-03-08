package be.max;

public class Rule30 {
    //Contains the actual logic (rule) of evolution
    public static boolean transformState(boolean stateA, boolean stateB, boolean stateC){
        return stateA ^ (stateB || stateC);
    }


    public static Cell applyRule(Cell cell1, Cell cell2, Cell cell3){
        return new Cell(transformState(cell1.getState(), cell2.getState(), cell3.getState()));
    }
}
