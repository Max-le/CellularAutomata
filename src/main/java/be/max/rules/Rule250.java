package be.max.rules;

import be.max.Cell;
import be.max.Rule;

public class Rule250 implements Rule {
    @Override
    public boolean transformState(boolean stateA, boolean stateB, boolean stateC) {
        return stateA || stateC;
    }

    @Override
    public Cell apply(Cell leftCell, Cell middleCell, Cell rightCell) {
        return new Cell(transformState(leftCell.getState(), middleCell.getState(), rightCell.getState()));
    }
}
