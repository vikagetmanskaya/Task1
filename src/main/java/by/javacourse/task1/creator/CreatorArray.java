package by.javacourse.task1.creator;

import by.javacourse.task1.entity.CustomArrayImpl;

public interface CreatorArray {
    CustomArrayImpl createArray(int[] array);

    CustomArrayImpl createRandomArray(int amount);
}
