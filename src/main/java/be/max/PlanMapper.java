package be.max;

import java.util.ArrayList;
import java.util.List;

public class PlanMapper {

    /**
     * @param plan A 2 dim array containing booleans.
     * @return A list containing String : each string represents one row of the plan, where each character represents one cell.
     * <br>A cell with the state false becomes 0, true becomes 1.
     */
    List<String> toList(boolean[][] plan){
        //TODO See if it goes faster with StringBuilder. Can probably be optimized.
        List<String> cellPlan = new ArrayList<>(plan.length);
        for (int i = 0; i < plan.length; i++) {
            StringBuilder s = new StringBuilder();
            for (int j = 0; j < plan[0].length; j++) {
                if (plan[i][j]){
                    s.append(1);
                }
                else{
                    s.append(0);
                }
            }
            cellPlan.add(s.toString());
        }
        return cellPlan;
    }

}
