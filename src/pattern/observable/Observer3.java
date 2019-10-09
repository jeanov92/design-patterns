package pattern.observable;

public class Observer3 extends Observer {

    public Observer3(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("From " + this.getClass().getName() + " state is -> " + this.subject.getState());
    }
}