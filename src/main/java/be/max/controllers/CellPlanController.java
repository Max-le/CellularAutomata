package be.max.controllers;


import be.max.Generator;
import be.max.Iterator;
import be.max.Plan;
import be.max.PlanMapper;
import be.max.representations.CellPlan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CellPlanController {

    @GetMapping("")
    public CellPlan cellPlan(@RequestParam(value ="rule") String rule,
                             @RequestParam(value="numberRows") int nbRows,
                             @RequestParam(value="lengthRow") int lengthRow){

        Plan plan = Iterator.generatePlan(Generator.oneCellRow(lengthRow), nbRows);
        PlanMapper mapper = new PlanMapper();
        return new CellPlan(mapper.toList(plan.toArray()));
    }

}
