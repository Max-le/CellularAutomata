package be.max;

public class Iterator {

    /**
     * Computes the next state of a row.
     * @param row the current status of the row.
     * @return next state of the row.
     */
    public static Row makeNextRow(Row row){
        Row nextRow = new Row();
        for (int i = 0; i < row.size(); i++) {

            boolean notOnLimits = i > 0 && i < row.size()-1;
            if (notOnLimits)
            {
                nextRow.add(Rule30.applyRule(row.get(i-1), row.get(i), row.get(i+1)).getState());
            }
            else{
                nextRow.add(row.get(i).getState());
            }
        }
        return nextRow;
    }


    /**
     * Fills a plan by iteration.
     * @param initialRow the starting row
     * @return A plan filled with rows.
     */
    public static Plan generatePlan(Row initialRow, int nbrRows){
        Plan plan = new Plan();
        Row currentRow = initialRow;
        plan.add(currentRow);
        for (int i = 0; i < nbrRows-1; i++) {
            Row nextRow = makeNextRow(currentRow);
            plan.add(nextRow);
            currentRow = nextRow;
        }
        return plan;
    }
}
