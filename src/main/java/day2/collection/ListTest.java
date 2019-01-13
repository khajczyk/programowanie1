package day2.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

    List<String> list;

    public void addToList(int index) {
        list = new ArrayList<>(index);
        for (int i = 0; i < index; i++) {
            list.add("tekst" + i);
        }
    }
    public void checkTimeAddingElement(int index, String element) {
        long start1 = System.currentTimeMillis();
        list.add(index, element);
        long stop1 = System.currentTimeMillis();
        System.out.println("Array list time :" + (stop1 - start1));

        List<String> linkedList = new LinkedList<>(list);
        long start2 = System.currentTimeMillis();
        linkedList.add(index, element);
        long stop2 = System.currentTimeMillis();
        System.out.println("Linked list time :" + (stop2 - start2));
    }

    public static void main(String[] args) {
        ListTest list = new ListTest();
        list.addToList(10000000);
        list.checkTimeAddingElement(50, "KArl");
    }
}
