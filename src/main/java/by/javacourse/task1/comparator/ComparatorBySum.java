package by.javacourse.task1.comparator;

import by.javacourse.task1.entity.CustomArrayImpl;
import by.javacourse.task1.service.impl.WorkWithArrayImpl;

import java.util.Comparator;

public class ComparatorBySum implements Comparator<CustomArrayImpl> {
    @Override
    public int compare(CustomArrayImpl o1, CustomArrayImpl o2) {
        WorkWithArrayImpl workWithArray = new WorkWithArrayImpl();
        return workWithArray.sumOfElements(o1) - workWithArray.sumOfElements(o2);
    }
}
