package by.javacourse.task1.comparator;

import by.javacourse.task1.entity.CustomArrayImpl;

import java.util.Comparator;

public class ComparatorById implements Comparator<CustomArrayImpl> {
    @Override
    public int compare(CustomArrayImpl o1, CustomArrayImpl o2) {
        return Long.compare(o1.getId(), o2.getId());
    }
}
