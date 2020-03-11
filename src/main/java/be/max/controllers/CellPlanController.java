package be.max.controllers;


import be.max.representations.CellPlan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CellPlanController {

    @GetMapping("")
    public CellPlan cellPlan(@RequestParam(value ="rule") String rule, @RequestParam(value="number") int number){

        List<String> testPlan = new ArrayList<>();
        testPlan.add("00100");
        testPlan.add("00101");
        testPlan.add("0110110");
        System.out.println("Received "+rule);
        System.out.println("Received "+number);

        return new CellPlan(testPlan);
    }

}
