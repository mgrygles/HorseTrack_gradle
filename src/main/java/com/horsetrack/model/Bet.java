package com.horsetrack.model;

/**
 * Bet model object.
 * <p>
 * Created by Mary on 2/21/2016.
 */
public class Bet {

    private int horse;
    private int amount;

    public Bet() {
    }

    ;

    public Bet(int horse, int amount) {
        this.horse = horse;
        this.amount = amount;
    }

    public void setHorse(int horse) {
        this.horse = horse;
    }

    public int getHorse() {
        return this.horse;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Horse: ").append(this.horse);
        sb.append("Amount: ").append(this.amount);
        return sb.toString();
    }
}
