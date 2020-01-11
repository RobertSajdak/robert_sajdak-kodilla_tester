package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String nameStamp;
    private int widthStamp;
    private int heightStamp;
    private String stampedStamp;
    private String noStampedStamp;


    public Stamp(String nameStamp, int widthStamp, int heightStamp, String stampedStamp, String noStampedStamp) {
        this.nameStamp = nameStamp;
        this.widthStamp = widthStamp;
        this.heightStamp = heightStamp;
        this.stampedStamp = stampedStamp;
        this.noStampedStamp = noStampedStamp;
    }

    public String getNameStamp() {
        return nameStamp;
    }

    public int getWidthStamp() {
        return widthStamp;
    }

    public int getHeightStamp() {
        return heightStamp;
    }

    public String getStampedStamp() {
        return stampedStamp;
    }

    public String getNoStampedStamp() {
        return noStampedStamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return widthStamp == stamp.widthStamp &&
                heightStamp == stamp.heightStamp &&
                Objects.equals(nameStamp, stamp.nameStamp) &&
                Objects.equals(stampedStamp, stamp.stampedStamp) &&
                Objects.equals(noStampedStamp, stamp.noStampedStamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameStamp, widthStamp, heightStamp, stampedStamp, noStampedStamp);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "nameStamp='" + nameStamp + '\'' +
                ", widthStamp=" + widthStamp +
                ", heightStamp=" + heightStamp +
                ", stampedStamp='" + stampedStamp + '\'' +
                ", noStampedStamp='" + noStampedStamp + '\'' +
                '}';
    }
}
