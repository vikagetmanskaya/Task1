package by.javacourse.task1.comparator;

import by.javacourse.task1.entity.CustomArray;

import java.util.Comparator;

public class ComparatorById implements Comparator<CustomArray> {
    @Override
    public int compare(CustomArray o1, CustomArray o2) {
        return Long.compare(o1.getId(), o2.getId());
    }
}
