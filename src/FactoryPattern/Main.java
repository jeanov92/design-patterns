package FactoryPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        showPlansPrompt();
        int planType = sc.nextInt();

        Plan plan = PlanFactory.getPlan(planType);
        if (plan == null) {
            System.out.println("Plan does not exist");
            return;
        }

        System.out.println("Please insert base salary");
        double baseSalary = sc.nextInt();

        double totalSalary = plan.calculateSalary(baseSalary);

        System.out.println("Total salary is : " + totalSalary + " for " + plan.getDescription());
    }

    private static void showPlansPrompt() {
        System.out.println("Select plan. \n"
                + "1 ----> " + PlanCons.BASIC_PLAN_DESCRIPTION + "\n"
                + "2 ----> " + PlanCons.DOMESTIC_PLAN_DESCRIPTION + "\n"
                + "3 ----> " + PlanCons.SPECIAL_PLAN_DESCRIPTION + "\n"
        );
    }
}
