package be.max.graphics.Image;


import be.max.Generator;
import be.max.Iterator;
import be.max.Plan;

import java.io.IOException;

public class MainIMAGE {
    public static void main(String[] args) throws IOException {

        int lengthRow = 1000;
        int nbrRows = 500;

        Plan plan = Iterator.generatePlan(Generator.oneCellRow(lengthRow),nbrRows);
        ImageCreator.createImage(plan.toArray());
        return;

    }

}
