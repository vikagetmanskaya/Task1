package by.javacourse.task1.parser.impl;

import by.javacourse.task1.parser.StringToIntegerParser;
import by.javacourse.task1.validator.impl.StringValidatorImpl;

import java.util.ArrayList;
import java.util.List;

public class StringToIntegerParserImpl implements StringToIntegerParser {
    private static final String DELIMITER = "\s";

    @Override
    public int[] parserStrToInt(List<String> stringNumbers) {
        List<Integer> numberList = new ArrayList<>();
        StringValidatorImpl stringValidator = new StringValidatorImpl();
        for (int i = 0; i < stringNumbers.size(); i++) {
            if (stringValidator.validateStr(stringNumbers.get(i))) {
                String[] stringArray = stringNumbers.get(i).split(DELIMITER);
                for (String number : stringArray) {
                    numberList.add(Integer.parseInt(number));
                }
            }
        }
        int[] intNumbers = new int[numberList.size()];

        for (int i = 0; i < intNumbers.length; i++) {
            intNumbers[i] = numberList.get(i);
        }
        return intNumbers;
    }
}

