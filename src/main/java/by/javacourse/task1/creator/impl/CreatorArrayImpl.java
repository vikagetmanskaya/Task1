package by.javacourse.task1.creator.impl;

import by.javacourse.task1.creator.CreatorArray;
import by.javacourse.task1.entity.CustomArray;

import java.util.Random;


public class CreatorArrayImpl implements CreatorArray {
    @Override
    public CustomArray createArray(int[] array) {
        return new CustomArray(array);
    }

    @Override
    public CustomArray createRandomArray(int amount, int maxValue) {
        Random random = new Random();
        int[] array = new int[amount];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxValue);
        }
        return createArray(array);
    }
}
