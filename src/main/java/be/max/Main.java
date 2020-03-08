package be.max;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Plan plan = new Plan();
        Row row = generateRandomRow(10);
        Row nextRow = Iterator.makeNextRow(row);
        plan.add(row);
        plan.add(nextRow);
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
