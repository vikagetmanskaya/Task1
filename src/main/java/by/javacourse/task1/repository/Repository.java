package by.javacourse.task1.repository;

import by.javacourse.task1.entity.CustomArrayImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Repository {
    private List<CustomArrayImpl> customArrays;
    private static Repository instance;

    private Repository() {
        customArrays = new ArrayList<>();
    }

    public static Repository getInstance() {
        if (instance == null) {
            instance = new Repository();
        }
        return instance;
    }

    public boolean add(CustomArrayImpl customArray) {
        return customArrays.add(customArray);
    }

    public boolean remove(Object o) {
        return customArrays.remove(o);
    }

    public boolean addAll(Collection<? extends CustomArrayImpl> c) {
        return customArrays.addAll(c);
    }

    public boolean removeAll(Collection<?> c) {
        return customArrays.removeAll(c);
    }

    public CustomArrayImpl get(int index) {
        return customArrays.get(index);
    }

    public CustomArrayImpl set(int index, CustomArrayImpl element) {
        return customArrays.set(index, element);
    }

    public List<CustomArrayImpl> query(Specification specification) {
        List<CustomArrayImpl> result = new ArrayList<>();
        for (int i = 0; i < customArrays.size(); i++) {
            if (specification.specify(customArrays.get(i))) {
                result.add(customArrays.get(i));
            }
        }
        return result;
    }
}
