package be.max;


public class Cell {

    private boolean state;

    public Cell(boolean state) {
        this.state = state;
    }
    public boolean getState() {
        return state;
    }
    public void setState(boolean state){
        this.state = state;
    }
    public void switchState(boolean state) {
        state = !state;
    }
    @Override
    public String toString() {
        String ALIVE_SYMBOL = "*";
        String DEAD_SYMBOL = "·";
        return (state) ? ALIVE_SYMBOL : DEAD_SYMBOL;
    }
}
