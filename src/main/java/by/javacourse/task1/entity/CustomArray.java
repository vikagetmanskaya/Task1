package by.javacourse.task1.entity;

import by.javacourse.task1.exception.CustomException;

public abstract class CustomArray {
    long id;
    int[] array;
    String name;

    public abstract int[] getArray();

    public abstract void setArray(int[] array) throws CustomException;
}
