package be.max;

import be.max.rules.Rule250;
import be.max.rules.Rule30;
import be.max.rules.Rule90;

public class Iterator {

    /**
     * Computes the next state of a row.
     * @param row the current status of the row.
     * @param evolutionRule the rule to follows to create the next row.
     * @return next state of the row.
     */
    private static Row makeNextRow(Row row, Rule evolutionRule){
        Row nextRow = new Row();
        for (int i = 0; i < row.size(); i++) {

            boolean notOnLimits = i > 0 && i < row.size()-1;
            if (notOnLimits)
            {
                nextRow.add(evolutionRule.apply(row.get(i-1), row.get(i), row.get(i+1)).getState());
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
    public static Plan generatePlan(Row initialRow, int nbrRows, Rule rule){
        Plan plan = new Plan();
        Row currentRow = initialRow;
        plan.add(currentRow);
        for (int i = 0; i < nbrRows-1; i++) {
            Row nextRow = makeNextRow(currentRow, rule);
            plan.add(nextRow);
            currentRow = nextRow;
        }
        return plan;
    }
}
