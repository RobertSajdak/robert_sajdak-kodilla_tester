package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    public String typeOfSchool;
    public String schoolLevel;
    public String addressOfSchool;

    public School(String typeOfSchool, String schoolLevel, String addressOfSchool) {
        this.typeOfSchool = typeOfSchool;
        this.schoolLevel = schoolLevel;
        this.addressOfSchool = addressOfSchool;
    }

    private List<Classroom> pupils = new ArrayList<>();


    public String getTypeOfSchool() {
        return typeOfSchool;
    }

    public String getSchoolLevel() {
        return schoolLevel;
    }

    public String getAddressOfSchool() {
        return addressOfSchool;
    }

    public List<Classroom> getPupils() {
        return pupils;
    }

    public void addClassroom(int number, String name) {
        this.pupils.add(new Classroom(number, name));
    }

    @Override
    public String toString() {
        return "School have pupils" +
                pupils;
    }
}
