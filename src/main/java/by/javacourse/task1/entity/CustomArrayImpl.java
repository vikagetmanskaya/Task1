package by.javacourse.task1.entity;

import by.javacourse.task1.exception.CustomException;
import by.javacourse.task1.observer.ArrayEvent;
import by.javacourse.task1.observer.Observable;
import by.javacourse.task1.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayImpl extends CustomArray implements Observable {
    private List<Observer> observers = new ArrayList<>();

    public CustomArrayImpl() {

    }

    public CustomArrayImpl(int[] array) {
        this.array = array;
    }

    public CustomArrayImpl(int[] array, int id, String name) {
        this.array = array;
        this.id = id;
        this.name = name;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public void setElement(int element, int changeValue) throws CustomException {
        getArray()[element] = changeValue;
        notifyObservers();

    }

    @Override
    public void attach(Observer observer) {
        if (observer != null) {
            observers.add(observer);
        }
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() throws CustomException {
        ArrayEvent arrayEvent = new ArrayEvent(this);
        for (Observer observer : observers) {
            observer.parameterChanged(arrayEvent);
        }
    }
}

