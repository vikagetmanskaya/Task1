package by.javacourse.task1.reader.impl;

import by.javacourse.task1.exception.ReaderException;
import by.javacourse.task1.reader.ReaderFromFile;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderFromFileImpl implements ReaderFromFile {
    private static final Logger logger = LogManager.getLogger();

    @Override
    public List<String> readFile(String pathToFile) throws ReaderException {
        List<String> listNumbers = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathToFile));
            logger.info("Reading file and connection with file");
            String currentLine;

            while ((currentLine = bufferedReader.readLine()) != null) {
                listNumbers.add(currentLine);

            }

        } catch (FileNotFoundException e) {
            logger.info("File " + pathToFile + " not Found");
            throw new ReaderException("File " + pathToFile + " not Found");
        } catch
        (IOException e) {

            logger.info("File " + pathToFile + " is not correct");
            throw new ReaderException("Input/Output exception");
        }
        return listNumbers;
    }
}

