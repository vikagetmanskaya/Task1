package by.javacourse.task1.creator.impl;

import by.javacourse.task1.creator.CreatorArray;
import by.javacourse.task1.entity.CustomArrayImpl;

import java.util.Random;


public class CreatorArrayImpl implements CreatorArray {
    @Override
    public CustomArrayImpl createArray(int[] array) {
        return new CustomArrayImpl(array);
    }

    @Override
    public CustomArrayImpl createRandomArray(int amount) {
        Random random = new Random();
        int[] array = new int[amount];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return createArray(array);
    }
}
