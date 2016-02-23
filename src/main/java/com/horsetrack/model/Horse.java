package com.horsetrack.model;

/**
 * Horse model object.
 * <p>
 * Created by Mary on 2/21/2016.
 */
public class Horse {

    private int number;
    private String name;
    private int odds;
    private boolean isWon;

    public Horse() {
    }

    public Horse(int number, String name, int odds, boolean isWon) {
        this.number = number;
        this.name = name;
        this.odds = odds;
        this.isWon = isWon;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setOdds(int odds) {
        this.odds = odds;
    }

    public int getOdds() {
        return odds;
    }

    public void setWon(boolean isWon) {
        this.isWon = isWon;
    }

    public boolean isWon() {
        return isWon;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getNumber()).append(",");
        sb.append(getName()).append(",");
        sb.append(getOdds()).append(",");
        sb.append(isWon() ? "won" : "lost");
        return sb.toString();
    }


}
