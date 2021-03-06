package by.javacourse.task1.main;

import by.javacourse.task1.creator.impl.CreatorArrayImpl;
import by.javacourse.task1.entity.CustomArray;
import by.javacourse.task1.exception.CustomException;
import by.javacourse.task1.exception.ReaderException;
import by.javacourse.task1.parser.StringToIntegerParser;
import by.javacourse.task1.parser.impl.StringToIntegerParserImpl;
import by.javacourse.task1.reader.impl.ReaderFromFileImpl;
import by.javacourse.task1.service.impl.WorkWithArrayImpl;

import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) throws ReaderException, CustomException {
        ReaderFromFileImpl reader = new ReaderFromFileImpl();
        List<String> arr = reader.readFile("src/main/resources/array.txt");
        StringToIntegerParser stringToInteger = new StringToIntegerParserImpl();
        int[] array = stringToInteger.parserStrToInt(arr);
        CreatorArrayImpl creatorArray = new CreatorArrayImpl();
        CustomArray result = creatorArray.createArray(array);
        WorkWithArrayImpl workWithArray = new WorkWithArrayImpl();
        System.out.println(Arrays.toString(result.getArray()));
        System.out.println(workWithArray.searchMinStream(result));
        System.out.println(workWithArray.searchMaxElement(result));
        System.out.println(workWithArray.averageValueOfElement(result));
        System.out.println(workWithArray.searchSumStream(result));
        System.out.println(workWithArray.amountOfPositiveElements(result));
        System.out.println(workWithArray.amountOfNegativeElements(result));
        System.out.println(Arrays.toString(workWithArray.changeElements(result, 2).getArray()));
        System.out.println(Arrays.toString(workWithArray.bubbleSort(result).getArray()));
        System.out.println(Arrays.toString(workWithArray.insertionSort(result).getArray()));
        System.out.println(Arrays.toString(workWithArray.selectionSort(result).getArray()));


    }
}
