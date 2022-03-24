package test.array;


import by.javacourse.task1.exception.ReaderException;
import by.javacourse.task1.reader.impl.ReaderFromFileImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ReaderFromFileTest {
    private ReaderFromFileImpl readerFromFile = new ReaderFromFileImpl();

    @Test
    public void testReader() throws ReaderException {
        List<String> actual = readerFromFile.readFile("src/test/resources/arrayTest.txt");
        List<String> expected = new ArrayList<>();
        expected.add("1 2 3 4");
        expected.add("-5 6 3");
        expected.add("5 a 1c");
        Assert.assertEquals(actual, expected);

    }
}
