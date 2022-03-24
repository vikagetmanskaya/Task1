package by.javacourse.task1.repository;

import by.javacourse.task1.entity.CustomArray;
import by.javacourse.task1.exception.CustomException;

public interface Specification {
    boolean specify(CustomArray customArray) throws CustomException;
}
