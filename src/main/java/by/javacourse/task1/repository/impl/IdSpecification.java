package by.javacourse.task1.repository.impl;

import by.javacourse.task1.entity.CustomArray;
import by.javacourse.task1.repository.Specification;

public class IdSpecification implements Specification {
    private long id;

    public IdSpecification(long id) {
        this.id = id;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        boolean result = customArray.getId() == id;
        return result;
    }
}
