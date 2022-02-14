package by.javacourse.task1.observer.impl;

import by.javacourse.task1.entity.ArrayParameters;
import by.javacourse.task1.entity.CustomArrayImpl;
import by.javacourse.task1.entity.WareHouse;
import by.javacourse.task1.exception.CustomException;
import by.javacourse.task1.observer.ArrayEvent;
import by.javacourse.task1.observer.Observer;
import by.javacourse.task1.service.impl.WorkWithArrayImpl;

public class ObserverImpl implements Observer {
    @Override
    public void parameterChanged(ArrayEvent arrayEvent) throws CustomException {
        CustomArrayImpl customArray = arrayEvent.getSource();
        WareHouse wareHouse = WareHouse.getInstance();
        ArrayParameters arrayParameters = wareHouse.get(customArray.getId());
        WorkWithArrayImpl workWithArray = new WorkWithArrayImpl();
        int sum = workWithArray.sumOfElements(customArray);
        double average = workWithArray.averageValueOfElement(customArray);
        int min = workWithArray.searchMinElement(customArray);
        int max = workWithArray.searchMaxElement(customArray);
        arrayParameters.setSumElements(sum);
        arrayParameters.setAverageValue(average);
        arrayParameters.setMinElement(min);
        arrayParameters.setMaxElement(max);
    }
}
