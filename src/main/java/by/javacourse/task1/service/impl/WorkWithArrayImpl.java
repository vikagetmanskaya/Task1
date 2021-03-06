package by.javacourse.task1.service.impl;

import by.javacourse.task1.creator.impl.CreatorArrayImpl;
import by.javacourse.task1.entity.CustomArray;
import by.javacourse.task1.exception.CustomException;
import by.javacourse.task1.service.WorkWithArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class WorkWithArrayImpl implements WorkWithArray {

    private static final Logger logger = LogManager.getLogger();
    CreatorArrayImpl creatorArray = new CreatorArrayImpl();

    @Override
    public int searchMinElement(CustomArray array) {
        int minElement = array.getArray()[0];
        for (int i = 1; i < array.getArray().length; i++) {
            if (array.getArray()[i] < minElement) {
                minElement = array.getArray()[i];
            }
        }
        return minElement;
    }

    public int searchMinStream(CustomArray array) {
        int min = Arrays.stream(array.getArray()).min().getAsInt();
        return min;
    }


    @Override
    public int searchMaxElement(CustomArray array) {
        int maxElement = array.getArray()[0];
        for (int i = 1; i < array.getArray().length; i++) {
            if (array.getArray()[i] > maxElement) {
                maxElement = array.getArray()[i];
            }
        }
        return maxElement;
    }

    public int searchMaxStream(CustomArray array) {
        int min = Arrays.stream(array.getArray()).max().getAsInt();
        return min;
    }

    @Override
    public CustomArray changeElements(CustomArray array, int element) {
        int[] arr = array.getArray();
        for (int i = 0; i < arr.length; i++) {
            if (array.getArray()[i] < 0) {
                array.getArray()[i] = element;
            }
        }
        return creatorArray.createArray(arr);
    }

    @Override
    public double averageValueOfElement(CustomArray array) throws CustomException {
        double sum = 0;
        double averageValue;
        for (int i = 0; i < array.getArray().length; i++) {
            sum = sum + array.getArray()[i];
        }
        try {
            averageValue = sum / array.getArray().length;
        } catch (ArithmeticException e) {
            logger.error("Division by zero", e);
            throw new CustomException("Array length = 0 ", e);
        }

        return averageValue;
    }

    public double searchAverageStream(CustomArray array) {
        double average = Arrays.stream(array.getArray()).average().getAsDouble();
        return average;
    }

    @Override
    public int sumOfElements(CustomArray array) {
        int sum = 0;
        for (int i = 0; i < array.getArray().length; i++) {
            sum = sum + array.getArray()[i];
        }
        return sum;
    }

    public int searchSumStream(CustomArray array) {
        int sum = Arrays.stream(array.getArray()).sum();
        return sum;
    }

    @Override
    public int amountOfPositiveElements(CustomArray array) {
        int amount = 0;
        for (int i = 0; i < array.getArray().length; i++) {
            if (array.getArray()[i] > 0) {
                amount++;
            }
        }
        return amount;
    }

    @Override
    public int amountOfNegativeElements(CustomArray array) {
        int amount = 0;
        for (int i = 0; i < array.getArray().length; i++) {
            if (array.getArray()[i] < 0) {
                amount++;
            }
        }
        return amount;
    }

    @Override
    public CustomArray bubbleSort(CustomArray array) {
        int[] arr = array.getArray();
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
        return creatorArray.createArray(arr);
    }

    @Override
    public CustomArray insertionSort(CustomArray array) {
        int[] arr = array.getArray();
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > current) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = current;
        }
        return creatorArray.createArray(arr);
    }

    @Override
    public CustomArray selectionSort(CustomArray array) {
        int[] arr = array.getArray();
        for (int i = 0; i < arr.length; i++) {
            int indexMin = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[indexMin] > arr[j]) {
                    indexMin = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[indexMin];
            arr[indexMin] = temp;
        }
        return creatorArray.createArray(arr);
    }
}
