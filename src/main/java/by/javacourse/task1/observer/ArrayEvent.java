package by.javacourse.task1.observer;

import by.javacourse.task1.entity.CustomArray;

import java.util.EventObject;

public class ArrayEvent extends EventObject {

    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public ArrayEvent(CustomArray source) {
        super(source);
    }

    @Override
    public CustomArray getSource() {
        return (CustomArray) super.getSource();
    }
}
