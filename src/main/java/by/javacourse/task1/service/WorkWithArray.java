package by.javacourse.task1.service;

import by.javacourse.task1.entity.CustomArrayImpl;
import by.javacourse.task1.exception.CustomException;

public interface WorkWithArray {
    int searchMinElement(CustomArrayImpl array);

    int searchMaxElement(CustomArrayImpl array);

    CustomArrayImpl changeElements(CustomArrayImpl array, int element);

    double averageValueOfElement(CustomArrayImpl array) throws CustomException;

    int sumOfElements(CustomArrayImpl array);

    int amountOfPositiveElements(CustomArrayImpl array);

    int amountOfNegativeElements(CustomArrayImpl array);

    CustomArrayImpl bubbleSort(CustomArrayImpl array);

    CustomArrayImpl insertionSort(CustomArrayImpl array);

    CustomArrayImpl selectionSort(CustomArrayImpl array);
}
