package by.javacourse.task1.observer;

import by.javacourse.task1.entity.CustomArrayImpl;
import org.w3c.dom.events.Event;

import java.util.EventObject;

public class ArrayEvent extends EventObject {

    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public ArrayEvent(CustomArrayImpl source) {
        super(source);
    }

    @Override
    public CustomArrayImpl getSource() {
        return (CustomArrayImpl) super.getSource();
    }
}
