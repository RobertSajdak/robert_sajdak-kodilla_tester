package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {

    public static void main(String[] args) {
        Map<Principal, School> principalSchoolMap = new HashMap<>();
        Principal john = new Principal("John", "Stevenson");
        Principal anna = new Principal("Anna", "Rose");
        Principal phil = new Principal("Phil", "Collins");

        School johnSchool = new School("University", "High", "Warsaw");
        School annaSchool = new School("University of technology", "High", "Warsaw");
        School philSchool = new School("High school", "College", "Lodz");

        principalSchoolMap.put(john, johnSchool);
        principalSchoolMap.put(anna, annaSchool);
        principalSchoolMap.put(phil, philSchool);

        System.out.println(principalSchoolMap.get(john));

      }
}