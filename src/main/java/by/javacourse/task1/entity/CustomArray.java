package by.javacourse.task1.entity;

import by.javacourse.task1.exception.CustomException;

public abstract class CustomArray {
    private int[] array;
    private long id;

    CustomArray() {

    }

    CustomArray(int[] array) {
        this.array = array;
    }

    public CustomArray(int[] array, int id) {
        this.array = array;
        this.id = id;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public abstract void setElement(int element, int changeValue) throws CustomException;

}
