package day2.generic;

import java.util.Arrays;

public class Lista {

    private Object[] objects = new Object[0];

    public void addElement(Object element) {
        Object[] temporaryTable = Arrays.copyOf(objects, objects.length + 1);
        objects = temporaryTable;
    }
    public Object[] getLista() {
        return objects;
    }
}
