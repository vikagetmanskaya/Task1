package by.javacourse.task1.service;

import by.javacourse.task1.entity.CustomArrayImpl;
import by.javacourse.task1.exception.CustomException;

import java.util.Arrays;

public interface WorkWithArray {
    int searchMinElement(CustomArrayImpl array);

    int searchMinStream(CustomArrayImpl array);

    int searchMaxElement(CustomArrayImpl array);

    int searchMaxStream(CustomArrayImpl array);

    CustomArrayImpl changeElements(CustomArrayImpl array, int element);

    double averageValueOfElement(CustomArrayImpl array) throws CustomException;

    double searchAverageStream(CustomArrayImpl array);

    int sumOfElements(CustomArrayImpl array);

    int searchSumStream(CustomArrayImpl array);

    int amountOfPositiveElements(CustomArrayImpl array);

    int amountOfNegativeElements(CustomArrayImpl array);

    CustomArrayImpl bubbleSort(CustomArrayImpl array);

    CustomArrayImpl insertionSort(CustomArrayImpl array);

    CustomArrayImpl selectionSort(CustomArrayImpl array);
}
