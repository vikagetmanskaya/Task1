package by.javacourse.task1.reader;

import by.javacourse.task1.exception.ReaderException;

import java.util.List;

public interface ReaderFromFile {
    List<String> readFile(String pathToFile) throws ReaderException;
}