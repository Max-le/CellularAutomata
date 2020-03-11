package be.max.rules;

import be.max.Cell;
import be.max.Rule;

public class Rule110 implements Rule {
    @Override
    public boolean transformState(boolean stateA, boolean stateB, boolean stateC) {
        return ((stateA||stateB) ^ (stateA & stateB & stateC)); // Rule 110: Xor[Or[p, q], And[p, q, r]]
    }

    @Override
    public Cell apply(Cell leftCell, Cell middleCell, Cell rightCell) {
        return new Cell(transformState(leftCell.getState(), middleCell.getState(), rightCell.getState()));
    }
}
