package by.javacourse.task1.comparator;

import by.javacourse.task1.entity.CustomArray;
import by.javacourse.task1.service.impl.WorkWithArrayImpl;

import java.util.Comparator;

public class ComparatorBySum implements Comparator<CustomArray> {
    @Override
    public int compare(CustomArray o1, CustomArray o2) {
        WorkWithArrayImpl workWithArray = new WorkWithArrayImpl();
        return workWithArray.sumOfElements(o1) - workWithArray.sumOfElements(o2);
    }
}
