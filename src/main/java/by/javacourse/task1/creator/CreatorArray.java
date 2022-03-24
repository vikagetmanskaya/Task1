package by.javacourse.task1.creator;

import by.javacourse.task1.entity.CustomArray;

public interface CreatorArray {
    CustomArray createArray(int[] array);

    CustomArray createRandomArray(int amount, int maxValue);
}
