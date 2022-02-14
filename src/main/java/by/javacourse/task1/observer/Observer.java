package by.javacourse.task1.observer;

import by.javacourse.task1.exception.CustomException;

public interface Observer {
    void parameterChanged(ArrayEvent arrayEvent) throws CustomException;
}
