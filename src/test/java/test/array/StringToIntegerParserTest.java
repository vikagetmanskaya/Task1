package test.array;

import by.javacourse.task1.parser.impl.StringToIntegerParserImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class StringToIntegerParserTest {
    private StringToIntegerParserImpl stringToIntegerParser = new StringToIntegerParserImpl();

    @Test
    public void testStrToIntParser() {
        List<String> listNumbers = new ArrayList<>();
        listNumbers.add("3a 1 2");
        listNumbers.add("1 2 3");
        listNumbers.add("-56 5 -3");
        int[] actual = stringToIntegerParser.parserStrToInt(listNumbers);
        int[] expected = new int[]{1, 2, 3, -56, 5, -3};
        Assert.assertEquals(actual, expected);

    }

}
