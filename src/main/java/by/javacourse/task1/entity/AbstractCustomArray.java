package by.javacourse.task1.entity;

import by.javacourse.task1.exception.CustomException;
import by.javacourse.task1.observer.Observable;
import by.javacourse.task1.observer.Observer;

public abstract class AbstractCustomArray implements Observable {
    private long id;

    AbstractCustomArray() {

    }


    public AbstractCustomArray(int id) {
        this.id = id;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public abstract void setElement(int element, int changeValue) throws CustomException;

}
