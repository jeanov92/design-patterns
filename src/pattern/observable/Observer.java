package pattern.observable;

public abstract class Observer {
    Subject subject;

    public abstract void update();
}
