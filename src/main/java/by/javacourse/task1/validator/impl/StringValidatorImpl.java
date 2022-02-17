package by.javacourse.task1.validator.impl;

import by.javacourse.task1.validator.StringValidator;

import java.util.regex.Pattern;

public class StringValidatorImpl implements StringValidator {
    private static final String REGEX_EXPRESSION_FOR_ARRAY = "[-]?\\d(\\s?([-]?\\d))+";

    @Override
    public boolean validateStr(String arrayLine) {
        boolean pattern = Pattern.matches(REGEX_EXPRESSION_FOR_ARRAY, arrayLine);
        return pattern;
    }
}
