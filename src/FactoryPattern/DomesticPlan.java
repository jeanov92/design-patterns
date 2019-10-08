package FactoryPattern;

public class DomesticPlan extends Plan {

    public DomesticPlan() {
        this.setRate();
    }

    @Override
    public void setRate() {
        rate = 4.0;
    }

    @Override
    public String getDescription() {
        return PlanCons.DOMESTIC_PLAN_DESCRIPTION;
    }
}
