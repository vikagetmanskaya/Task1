package by.javacourse.task1.repository;

import by.javacourse.task1.entity.CustomArrayImpl;
import by.javacourse.task1.exception.CustomException;

public interface Specification {
    boolean specify(CustomArrayImpl customArray) throws CustomException;
}
