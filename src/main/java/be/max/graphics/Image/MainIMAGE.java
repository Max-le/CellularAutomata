package be.max.graphics.Image;


import be.max.Generator;
import be.max.Iterator;
import be.max.Plan;
import be.max.Rule;
import be.max.rules.Rule110;

import java.io.IOException;

public class MainIMAGE {
    public static void main(String[] args) throws IOException {

        int lengthRow = 1000;
        int nbrRows = 500;

        Rule rule = new Rule110();
        Plan plan = Iterator.generatePlan(Generator.oneCellRow(lengthRow),nbrRows, rule);
        ImageCreator.createImage(plan.toArray());
        return;

    }

}
