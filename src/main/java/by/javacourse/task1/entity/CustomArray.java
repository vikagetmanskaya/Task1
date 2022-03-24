package by.javacourse.task1.entity;

import by.javacourse.task1.exception.CustomException;
import by.javacourse.task1.observer.ArrayEvent;
import by.javacourse.task1.observer.Observer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;


public class CustomArray extends AbstractCustomArray {
    private static final Logger logger = LogManager.getLogger();
    private int[] array;
    private Observer observer;

    public CustomArray() {
        super();
    }

    public CustomArray(int[] array) {
        this.array = array;
    }

    public CustomArray(int[] array, int id) {
        super(id);
        this.array = array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setElement(int element, int changeValue) {
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
                logger.error("Problems with arithmetic ", e);
            }
        }

    }

    @Override
    public int hashCode() {
        int result = array == null ? 0 : array.hashCode();
        result = 31 * result + (int) getId();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        CustomArray customArray = (CustomArray) obj;

        return getId() == customArray.getId() && Arrays.equals(array, customArray.array);
    }

    @Override
    public String toString() {
        if (array == null) {
            return "CustomArray is empty";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i : array) {
            stringBuilder.append(i).append(" ");
        }
        return stringBuilder.toString();
    }
}

