package be.max;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Row row = generateRandomRow(10);
        Row nextRow = new Row();
        for (int i = 0; i < row.size(); i++) {

            boolean notOnLimits = i > 0 && i < row.size()-1;
            if (notOnLimits)
            {
                nextRow.add(Rule30.applyRule(row.get(i-1), row.get(i), row.get(i+1)).getState());
            }
            else{
                nextRow.add(row.get(i).getState());
            }
        }
        System.out.println(row.toString());
        System.out.println(nextRow.toString());

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
