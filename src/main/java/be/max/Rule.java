package be.max;

public interface Rule {
    /**
     * Contains the actual logic (rule) of evolution : definition of the rule.
     * @return the next state for stateB.
     */
    boolean transformState(boolean stateA, boolean stateB, boolean stateC);

    /**
     * Applies the rule defined in transformState
     * @return the middle cell with it's next state.
     */
    Cell apply(Cell leftCell, Cell middleCell, Cell rightCell);
}
