package com.horsetrack.model;

/**
 * Enum for Bank currency denominations.
 * <p>
 * Created by Mary on 2/21/2016.
 */
public enum Denomination {

    ONE(1), FIVE(5), TEN(10), TWENTY(20), HUNDRED(100);

    private int denomination;

    private Denomination(int value) {
        this.denomination = value;
    }

    public int getValue() {
        return denomination;
    }

}
