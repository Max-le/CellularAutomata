package be.max.controllers;


import be.max.Generator;
import be.max.Iterator;
import be.max.Plan;
import be.max.mappers.PlanMapper;
import be.max.representations.CellPlan;
import be.max.rules.Rule250;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CellPlanController {

    @CrossOrigin
    @GetMapping("")
    public CellPlan cellPlan(@RequestParam(value ="rule") String rule,
                             @RequestParam(value="number") int nbRows,
                             @RequestParam(value="length") int lengthRow){
        //TODO Mapper le rule String en rule de type Rule
        Plan plan = Iterator.generatePlan(Generator.oneCellRow(lengthRow), nbRows, new Rule250());
        PlanMapper mapper = new PlanMapper();
        return new CellPlan(mapper.toList(plan.toArray()));
    }

}
