package FactoryPattern;

public class SpecialPlan extends Plan {

    public SpecialPlan() {
        this.setRate();
    }

    @Override
    public void setRate() {
        rate = 6.0;
    }

    @Override
    public String getDescription() {
        return PlanCons.SPECIAL_PLAN_DESCRIPTION;
    }
}
