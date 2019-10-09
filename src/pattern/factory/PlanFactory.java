package pattern.factory;

public class PlanFactory {

    public static Plan getPlan(int planType) {
        switch (planType) {
            case PlanCons.BASIC_PLAN:
                return new BasicPlan();
            case PlanCons.DOMESTIC_PLAN:
                return new DomesticPlan();
            case PlanCons.SPECIAL_PLAN:
                return new SpecialPlan();
            default:
                return null;

        }
    }
}
