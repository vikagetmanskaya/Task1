package by.javacourse.task1.repository;

import by.javacourse.task1.entity.CustomArray;
import by.javacourse.task1.exception.CustomException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class ArrayRepository {
    private static final Logger logger = LogManager.getLogger();
    private static ArrayRepository instance;
    private List<CustomArray> customArrays;


    private ArrayRepository() {
        customArrays = new ArrayList<>();
    }

    public static ArrayRepository getInstance() {
        if (instance == null) {
            instance = new ArrayRepository();
        }
        return instance;
    }

    public boolean add(CustomArray customArray) {
        return customArrays.add(customArray);
    }

    public boolean remove(Object o) {
        return customArrays.remove(o);
    }

    public boolean addAll(Collection<? extends CustomArray> c) {
        return customArrays.addAll(c);
    }

    public boolean removeAll(Collection<?> c) {
        return customArrays.removeAll(c);
    }

    public CustomArray get(int index) {
        return customArrays.get(index);
    }

    public CustomArray set(int index, CustomArray element) {
        return customArrays.set(index, element);
    }

    public void sort(Comparator<? super CustomArray> comparator) {
        customArrays.sort(comparator);
    }

    public List<CustomArray> query(Specification specification) {
        List<CustomArray> result = new ArrayList<>();
        for (int i = 0; i < customArrays.size(); i++) {
            try {
                if (specification.specify(customArrays.get(i))) {
                    result.add(customArrays.get(i));
                }
            } catch (CustomException e) {
                logger.error("Problems with arithmetic ", e);
            }
        }
        return result;
    }

}
