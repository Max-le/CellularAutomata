package be.max;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Row row = generateRandomRow(10);
        Plan plan = Iterator.generatePlan(row, 5);
        System.out.println(plan.toString());

    }

    private static Row generateRandomRow(int size) {
        Row row = new Row();
        for (int i = 0; i < size; i++) {
            Random rgn = new Random();
            row.add(new Cell(rgn.nextBoolean()));
        }
        return row;
    }
}
