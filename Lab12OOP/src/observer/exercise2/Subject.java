package observer.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers;
    private int state;

    public Subject(){
        observers = new ArrayList<>();
        state = 1;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        if (this.state == state){
            return;
        }
        this.state = state;
        onStateChanged();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    private void onStateChanged(){
        notifyAllObserver();
    }
}
