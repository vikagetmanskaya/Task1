package by.javacourse.task1.entity;

import by.javacourse.task1.exception.CustomException;
import by.javacourse.task1.observer.ArrayEvent;
import by.javacourse.task1.observer.Observable;
import by.javacourse.task1.observer.Observer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayImpl extends CustomArray implements Observable {
    private static final Logger logger = LogManager.getLogger();
    private Observer observer;
    private List<Observer> observers = new ArrayList<>();

    public CustomArrayImpl() {
        super();
    }

    public CustomArrayImpl(int[] array) {
        super(array);
    }

    public CustomArrayImpl(int[] array, int id) {
        super(array, id);
    }


    public void setElement(int element, int changeValue) throws CustomException {
        getArray()[element] = changeValue;
        notifyObservers();

    }

    @Override
    public void attach(Observer observer) {
        if (this.observer == null) {
            this.observer = observer;
        }

    }

    @Override
    public void detach() {
        if (this.observer != null) {

            this.observer = null;
        }
    }

    @Override
    public void notifyObservers() {
        ArrayEvent arrayEvent = new ArrayEvent(this);
        if (this.observer != null) {
            try {
                observer.parameterChanged(arrayEvent);
            } catch (CustomException e) {
                logger.info("Problems with arithmetic " + e);
            }
        }

    }
}

