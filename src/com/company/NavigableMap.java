package com.company;

import java.util.*;

/**
 * Created by jv on 2/21/2016.
 */
public class NavigableMap {
    public static void main(String[] args) {
        TreeMap<String,Double> hm = new TreeMap<String, Double>();

        hm.put("John Doe", new Double(3434.34));
        hm.put("Tom Smith", new Double(123.22));
        hm.put("Jane Baker", new Double(1378.00));
        hm.put("Tod Hall", new Double(99.22));
        hm.put("Ralph Smith", new Double(-19.08));

        Set<Map.Entry<String,Double>> set = hm.entrySet();



        for(Map.Entry<String,Double> me : set)
        {
            System.out.println(me.getKey()+":");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = hm.get("John Doe");
        hm.put("John Doe", balance + 1000);

        System.out.println("John Doe's new balance: " + hm.get("John Doe"));
    }
}
