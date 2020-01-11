package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Poland", 3, 2, "---", "noStamped" ));
        stamps.add(new Stamp("World", 4, 3, "---", "noStamped" ));
        stamps.add(new Stamp("Poland", 5, 3, "stamped", "---" ));
        stamps.add(new Stamp("World", 2, 2, "stamped", "---" ));
        stamps.add(new Stamp("Poland", 3, 2, "---", "noStamped" ));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
       }
}