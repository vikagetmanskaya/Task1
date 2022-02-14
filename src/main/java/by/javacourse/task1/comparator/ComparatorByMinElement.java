package by.javacourse.task1.comparator;

import by.javacourse.task1.entity.CustomArrayImpl;
import by.javacourse.task1.service.impl.WorkWithArrayImpl;

import java.util.Comparator;

public class ComparatorByMinElement implements Comparator<CustomArrayImpl> {
    @Override
    public int compare(CustomArrayImpl o1, CustomArrayImpl o2) {
        WorkWithArrayImpl workWithArray = new WorkWithArrayImpl();
        return workWithArray.searchMinElement(o1) - workWithArray.searchMinElement(o2);
    }
}
