package by.javacourse.task1.creator.impl;

import by.javacourse.task1.creator.CreatorArray;
import by.javacourse.task1.entity.CustomArray;

public class CreatorArrayImpl implements CreatorArray {
    @Override
    public CustomArray createArray(int[] array) {
        return new CustomArray(array);
    }
}
