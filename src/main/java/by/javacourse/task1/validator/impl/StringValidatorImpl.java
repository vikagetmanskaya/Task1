package by.javacourse.task1.validator.impl;

import by.javacourse.task1.validator.StringValidator;

import java.util.regex.Pattern;

public class StringValidatorImpl implements StringValidator {
    private static final String REGEX = "[-]?\\d(\\s?([-]?\\d))+";

    @Override
    public boolean validateStr(String line) {
        boolean pattern = Pattern.matches(REGEX, line);
        return pattern;
    }
}
