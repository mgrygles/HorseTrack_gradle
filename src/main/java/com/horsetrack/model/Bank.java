package com.horsetrack.model;

/**
 * The Bank model object.
 * <p>
 * Created by Mary on 2/21/2016.
 */
public class Bank {

    private int ones;
    private int fives;
    private int tens;
    private int twenties;
    private int hundreds;

    public Bank() {
    }

    public Bank(int ones, int fives, int tens, int twenties, int hundreds) {
        this.ones = ones;
        this.fives = fives;
        this.tens = tens;
        this.twenties = twenties;
        this.hundreds = hundreds;
    }

    public void setOnes(int ones) {
        this.ones = ones;
    }

    public int getOnes() {
        return this.ones;
    }

    public void setFives(int fives) {
        this.fives = fives;
    }

    public int getFives() {
        return this.fives;
    }

    public void setTens(int tens) {
        this.tens = tens;
    }

    public int getTens() {
        return this.tens;
    }

    public void setTwenties(int twenties) {
        this.twenties = twenties;
    }

    public int getTwenties() {
        return this.twenties;
    }

    public void setHundreds(int hundreds) {
        this.hundreds = hundreds;
    }

    public int getHundreds() {
        return this.hundreds;
    }

    public void restocks() {
        setOnes(10);
        setFives(10);
        setTens(10);
        setTwenties(10);
        setHundreds(10);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Inventory:");
        sb.append("$1,").append(this.getOnes()).append("\n");
        sb.append("$5,").append(this.getFives()).append("\n");
        sb.append("$10,").append(this.getTens()).append("\n");
        sb.append("$20,").append(this.getTwenties()).append("\n");
        sb.append("$100,").append(this.getHundreds());
        return sb.toString();
    }

}
