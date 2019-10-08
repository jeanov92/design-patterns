package FactoryPattern;

public class BasicPlan extends Plan {

    public BasicPlan() {
        setRate();
    }

    @Override
    public void setRate() {
        rate = 2.50;
    }

    @Override
    public String getDescription() {
        return PlanCons.BASIC_PLAN_DESCRIPTION;
    }
}
