package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //ArrayList = a resizable array that stores objects (autoboxing)
        //            Arrays are fixed in size, but ArrayLists are dynamic and can grow as needed.

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        System.out.println(arrayList);
        arrayList.remove(0);
        System.out.println(arrayList);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.size());
        arrayList.set(0, "D");
        System.out.println(arrayList);
        for (String i : arrayList) {
            System.out.println(i);
        }
        arrayList.clear();
        System.out.println(arrayList);
        arrayList.add("F");
        arrayList.add("Z");
        arrayList.add("6");
        arrayList.add("A");
        arrayList.add("R");
        arrayList.add("X");
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
