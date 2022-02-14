package by.javacourse.task1.entity;

import java.util.HashMap;
import java.util.Map;

public class WareHouse {
    private Map<Long, ArrayParameters> arrayMap;
    private static WareHouse instance;

    private WareHouse() {
        this.arrayMap = new HashMap<>();
    }
    public static WareHouse getInstance(){
        if(instance == null){
            instance = new WareHouse();
        }
        return instance;
    }

    public ArrayParameters put(Long arrayId, ArrayParameters parameters) {
        return arrayMap.put(arrayId, parameters);
    }

    public ArrayParameters remove(Long arrayId) {
        return arrayMap.remove(arrayId);
    }

    public ArrayParameters get(Long arrayId) {
        return arrayMap.get(arrayId);
    }
}
