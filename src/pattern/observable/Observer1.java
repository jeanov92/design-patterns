package pattern.observable;

public class Observer1 extends Observer {

    public Observer1(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("From " + this.getClass().getName() + " state is -> " + this.subject.getState());
    }
}
