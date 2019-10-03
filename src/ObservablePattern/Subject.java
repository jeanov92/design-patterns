package ObservablePattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<>();
    private int state;

    public void add(Observer observer) {
        this.observers.add(observer);
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.execute();
    }

    private void execute () {
        this.observers.forEach(Observer::update); // Notify all observers, something changed
    }
}
