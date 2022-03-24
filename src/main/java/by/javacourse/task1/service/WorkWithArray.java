package by.javacourse.task1.service;

import by.javacourse.task1.entity.CustomArray;
import by.javacourse.task1.exception.CustomException;

public interface WorkWithArray {
    int searchMinElement(CustomArray array);

    int searchMinStream(CustomArray array);

    int searchMaxElement(CustomArray array);

    int searchMaxStream(CustomArray array);

    CustomArray changeElements(CustomArray array, int element);

    double averageValueOfElement(CustomArray array) throws CustomException;

    double searchAverageStream(CustomArray array);

    int sumOfElements(CustomArray array);

    int searchSumStream(CustomArray array);

    int amountOfPositiveElements(CustomArray array);

    int amountOfNegativeElements(CustomArray array);

    CustomArray bubbleSort(CustomArray array);

    CustomArray insertionSort(CustomArray array);

    CustomArray selectionSort(CustomArray array);
}
