package be.max;

import be.max.mappers.PlanMapper;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestMapper {

    boolean[][] generatePlan(){
        boolean[][] myPlan = new boolean[3][2];

        myPlan[0][0] = false;myPlan[0][1] = true;
        myPlan[1][0] = true; myPlan[1][1] = true;
        myPlan[2][0] = true; myPlan[2][1] = false;

        return myPlan;
    }

    @org.junit.jupiter.api.Test
    void mapPlanCorrectly(){
        PlanMapper mapper = new PlanMapper();
        List<String> mappedPlan = mapper.toList(generatePlan());
        List<String> expectedPlan = new ArrayList<>();
        expectedPlan.add("01");
        expectedPlan.add("11");
        expectedPlan.add("10");
        assertLinesMatch(expectedPlan, mappedPlan);

    }
}
