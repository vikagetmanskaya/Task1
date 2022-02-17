package by.javacourse.task1.repository.impl;

import by.javacourse.task1.entity.CustomArrayImpl;
import by.javacourse.task1.repository.Specification;
import by.javacourse.task1.service.impl.WorkWithArrayImpl;

public class MinSpecification implements Specification {
    private int lowValue;
    private int highValue;

    public MinSpecification(int lowValue, int highValue) {
        this.lowValue = lowValue;
        this.highValue = highValue;
    }

    @Override
    public boolean specify(CustomArrayImpl customArray) {
        WorkWithArrayImpl workWithArray = new WorkWithArrayImpl();
        boolean result = workWithArray.searchMinElement(customArray) > lowValue && workWithArray.searchMinElement(customArray) < highValue;
        return result;
    }
}
