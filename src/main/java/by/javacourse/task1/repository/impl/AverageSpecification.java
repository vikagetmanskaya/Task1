package by.javacourse.task1.repository.impl;

import by.javacourse.task1.entity.CustomArray;
import by.javacourse.task1.exception.CustomException;
import by.javacourse.task1.repository.Specification;
import by.javacourse.task1.service.impl.WorkWithArrayImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AverageSpecification implements Specification {
    private static final Logger logger = LogManager.getLogger();
    private int lowValue;
    private int highValue;

    public AverageSpecification(int lowValue, int highValue) {
        this.lowValue = lowValue;
        this.highValue = highValue;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        WorkWithArrayImpl workWithArray = new WorkWithArrayImpl();
        boolean result = false;
        try {
            result = workWithArray.averageValueOfElement(customArray) > lowValue && workWithArray.averageValueOfElement(customArray) < highValue;
        } catch (CustomException e) {
            logger.error("Problems with arithmetic ", e);
        }
        return result;
    }
}
