package com.horsetrack.processor;

import com.horsetrack.model.Bank;
import com.horsetrack.model.Horse;

/**
 * The Command Processor.
 * <p>
 * Created by Mary on 2/21/2016.
 */
public final class CommandProcessor {

    private String cmdRestocks = "[R|r]";
    private String cmdSetsWinning = "[W|w] [1-7]";
    private String cmdMakesBet = "[1-7] [.*\\d+]";

    private Bank bank;
    private Horse horse;

    public CommandProcessor() {
        bank = new Bank();
        bank.restocks();

        horse = new HorseProcessor();
        horse.init();
    }

    public void processCmdLine(String cmd) {
        if (cmd.matches(cmdRestocks)) {
            bank.restocks();
            System.out.println("restocks");
        } else if (cmd.matches(cmdSetsWinning)) {
            horse.
        }


    }

}
