package by.javacourse.task1.main;

import by.javacourse.task1.creator.impl.CreatorArrayImpl;
import by.javacourse.task1.entity.CustomArrayImpl;
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
        List<String> arr = reader.readFile("resource/array.txt");
        StringToIntegerParser stringToInteger = new StringToIntegerParserImpl();
        int[] array = stringToInteger.parserStrToInt(arr);
        CreatorArrayImpl creatorArray = new CreatorArrayImpl();
        CustomArrayImpl result = creatorArray.createArray(array);
        WorkWithArrayImpl workWithArray = new WorkWithArrayImpl();
        System.out.println(Arrays.toString(result.getArray()));
        long id = 1;
        result.setId(id);
        result.setElement(2, 5);
        System.out.println(Arrays.toString(result.getArray()));
        System.out.println(workWithArray.searchMinElement(result));
        System.out.println(workWithArray.searchMaxElement(result));
        System.out.println(workWithArray.averageValueOfElement(result));
        System.out.println(workWithArray.sumOfElements(result));
        System.out.println(workWithArray.amountOfPositiveElements(result));
        System.out.println(workWithArray.amountOfNegativeElements(result));
        System.out.println(Arrays.toString(workWithArray.changeElements(result, 2).getArray()));
        System.out.println(Arrays.toString(workWithArray.bubbleSort(result).getArray()));
        System.out.println(Arrays.toString(workWithArray.insertionSort(result).getArray()));
        System.out.println(Arrays.toString(workWithArray.selectionSort(result).getArray()));


    }
}
