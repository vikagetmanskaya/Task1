package by.javacourse.task1.repository;

import by.javacourse.task1.entity.CustomArrayImpl;

@FunctionalInterface
public interface Specification {
    boolean specify(CustomArrayImpl customArray);
}
