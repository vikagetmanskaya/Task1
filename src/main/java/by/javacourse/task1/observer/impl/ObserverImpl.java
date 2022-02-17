package by.javacourse.task1.observer.impl;

import by.javacourse.task1.entity.ArrayParameters;
import by.javacourse.task1.entity.CustomArrayImpl;
import by.javacourse.task1.entity.WareHouse;
import by.javacourse.task1.exception.CustomException;
import by.javacourse.task1.observer.ArrayEvent;
import by.javacourse.task1.observer.Observer;
import by.javacourse.task1.service.impl.WorkWithArrayImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ObserverImpl implements Observer {
    private static final Logger logger = LogManager.getLogger();

    @Override
    public void parameterChanged(ArrayEvent arrayEvent) {
        CustomArrayImpl customArray = arrayEvent.getSource();
        WareHouse wareHouse = WareHouse.getInstance();
        ArrayParameters arrayParameters = wareHouse.get(customArray.getId());
        WorkWithArrayImpl workWithArray = new WorkWithArrayImpl();
        int sum = workWithArray.sumOfElements(customArray);
        double average = 0;
        try {
            average = workWithArray.averageValueOfElement(customArray);
        } catch (CustomException e) {
            logger.info("Problems with arithmetic " + e);
        }
        int min = workWithArray.searchMinElement(customArray);
        int max = workWithArray.searchMaxElement(customArray);
        arrayParameters.setSumElements(sum);
        arrayParameters.setAverageValue(average);
        arrayParameters.setMinElement(min);
        arrayParameters.setMaxElement(max);
    }
}
