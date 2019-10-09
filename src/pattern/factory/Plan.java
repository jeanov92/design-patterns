package pattern.factory;

public abstract class Plan {
    public double rate;

    public double calculateSalary(double salary) {
        return salary + (salary * rate / 100);
    }

    public abstract void setRate();

    public abstract String getDescription();
}
