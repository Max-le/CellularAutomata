package be.max.representations;

import java.util.List;

public class CellPlan {
    private List<String> plan;

    public CellPlan(List<String> plan) {
        this.plan = plan;
    }

    public List<String> getPlan() {
        return plan;
    }

    public void setPlan(List<String> plan) {
        this.plan = plan;
    }
}
