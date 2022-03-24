package test.array;

import by.javacourse.task1.entity.CustomArray;
import by.javacourse.task1.exception.CustomException;
import by.javacourse.task1.service.impl.WorkWithArrayImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WorkWithArrayTest {

    private WorkWithArrayImpl workWithArray = new WorkWithArrayImpl();

    @Test
    public void testMinElement() {
        CustomArray customArray = new CustomArray(new int[]{1, -1, 2, 3, -5});
        int actual = workWithArray.searchMinElement(customArray);
        int expected = -5;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testMinElementStream() {
        CustomArray customArray = new CustomArray(new int[]{1, -1, 2, 3, -5});
        int actual = workWithArray.searchMinStream(customArray);
        int expected = -5;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testMaxElement() {
        CustomArray customArray = new CustomArray(new int[]{1, -1, 2, 3, -5});
        int actual = workWithArray.searchMaxElement(customArray);
        int expected = 3;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testMaxElementStream() {
        CustomArray customArray = new CustomArray(new int[]{1, -1, 2, 3, -5});
        int actual = workWithArray.searchMaxStream(customArray);
        int expected = 3;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testChangeElements() {
        CustomArray customArray = new CustomArray(new int[]{1, -1, 2, 3, -5});
        int[] actual = workWithArray.changeElements(customArray, 0).getArray();
        int[] expected = new int[]{1, 0, 2, 3, 0};
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testAverageValue() throws CustomException {
        CustomArray customArray = new CustomArray(new int[]{1, -1, 2, 3, -5, 6});
        double actual = workWithArray.averageValueOfElement(customArray);
        double expected = 1;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testAverageValueStream() {
        CustomArray customArray = new CustomArray(new int[]{1, -1, 2, 3, -5, 6});
        double actual = workWithArray.searchAverageStream(customArray);
        double expected = 1;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSumOfElements() {
        CustomArray customArray = new CustomArray(new int[]{1, -1, 2, 3, -5, 6});
        int actual = workWithArray.sumOfElements(customArray);
        int expected = 6;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSumOfElementsStream() {
        CustomArray customArray = new CustomArray(new int[]{1, -1, 2, 3, -5, 6});
        int actual = workWithArray.searchSumStream(customArray);
        int expected = 6;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testAmountOfPositiveElements() {
        CustomArray customArray = new CustomArray(new int[]{1, -1, 2, 3, -5, 6});
        int actual = workWithArray.amountOfPositiveElements(customArray);
        int expected = 4;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testAmountOfNegativeElements() {
        CustomArray customArray = new CustomArray(new int[]{1, -1, 2, 3, -5, 6});
        int actual = workWithArray.amountOfNegativeElements(customArray);
        int expected = 2;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testBubbleSort() {
        CustomArray customArray = new CustomArray(new int[]{1, -1, 2, 3, -5, 6});
        int[] actual = workWithArray.bubbleSort(customArray).getArray();
        int[] expected = new int[]{-5, -1, 1, 2, 3, 6};
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testInsertionSort() {
        CustomArray customArray = new CustomArray(new int[]{1, -1, 2, 3, -5, 6});
        int[] actual = workWithArray.insertionSort(customArray).getArray();
        int[] expected = new int[]{-5, -1, 1, 2, 3, 6};
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSelectedSort() {
        CustomArray customArray = new CustomArray(new int[]{1, -1, 2, 3, -5, 6});
        int[] actual = workWithArray.selectionSort(customArray).getArray();
        int[] expected = new int[]{-5, -1, 1, 2, 3, 6};
        Assert.assertEquals(actual, expected);
    }

}
