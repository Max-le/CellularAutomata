package be.max;

public class Main {

    public static void main(String[] args) {

        Row row = Generator.generateRandomRow(100);
        Plan plan = Iterator.generatePlan(row, 400);
        System.out.println(plan.toString());

    }

}
