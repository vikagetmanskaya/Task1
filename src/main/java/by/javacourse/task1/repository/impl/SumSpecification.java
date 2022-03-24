package by.javacourse.task1.repository.impl;

import by.javacourse.task1.entity.CustomArray;
import by.javacourse.task1.repository.Specification;
import by.javacourse.task1.service.impl.WorkWithArrayImpl;

public class SumSpecification implements Specification {
    private int sum;

    public SumSpecification(int sum) {
        this.sum = sum;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        WorkWithArrayImpl workWithArray = new WorkWithArrayImpl();
        boolean result = workWithArray.sumOfElements(customArray) > sum;
        return result;
    }
}
