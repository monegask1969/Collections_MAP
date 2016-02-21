package com.company;

import java.util.*;

/**
 * Created by jv on 2/21/2016.
 */
public class ColletionExample {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("red","green","blue");
        Collections.sort(list1);
        System.out.println(list1);
        List<String> list2 = Arrays.asList("green", "red", "yellow", "blue");
        Collections.sort(list2, Collections.reverseOrder());
        System.out.println(list2);
    }
}
