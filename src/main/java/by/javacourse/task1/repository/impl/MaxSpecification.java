package by.javacourse.task1.repository.impl;

import by.javacourse.task1.entity.CustomArrayImpl;
import by.javacourse.task1.repository.Specification;
import by.javacourse.task1.service.impl.WorkWithArrayImpl;

public class MaxSpecification implements Specification {
    private int highValue;

    public MaxSpecification(int highValue) {
        this.highValue = highValue;
    }

    @Override
    public boolean specify(CustomArrayImpl customArray) {
        WorkWithArrayImpl workWithArray = new WorkWithArrayImpl();
        boolean result = workWithArray.searchMaxElement(customArray) < highValue;
        return result;
    }
}
