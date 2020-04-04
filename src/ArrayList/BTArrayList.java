package ArrayList;

import java.util.ArrayList;

public class BTArrayList {
    public static void main(String[] args) {
        String[] strings = new String[10];
        ArrayList<String> list = new ArrayList(10);
//        ArrayList<Integer> list1 = new ArrayList<>();
//        System.out.println("Size of ArrayList" + list.size());
//        System.out.println("Size of Array" + strings.length);
//        list.add("123465");
//        list.add("546423");
//        list.add("new Object()");
        list.add("One");
        list.add("Two");
        list.add("Four");
        System.out.println("Size: " + list.size());
        String s1 = list.get(0);
        String s2 = list.get(list.size()-1);
//        System.out.println(s2);
        list.add(2,"Three");
        list.set(3,"nine");
        list.remove("One");

        for (String s : list)
        {
            System.out.println(s);
            System.out.println(s);
        }

    }
}
