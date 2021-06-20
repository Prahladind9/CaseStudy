package edu.prahlad.patterns2.observer.push;

//publisher class
public class DataSource extends Subject {

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers(this.value);
    }

}