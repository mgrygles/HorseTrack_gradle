package com.horsetrack;

import com.horsetrack.processor.CommandProcessor;

import java.util.Scanner;

/**
 * Main class that functions as the Automated Teller Machine at the Horse Race Park.
 * <p>
 * Created by Mary on 2/21/2016.
 */
public class MainMachine {

    public static void main(String[] args) {

        boolean isExit = false;

        Bank bank = new Bank();

        CommandProcessor cmdProcessor = new CommandProcessor();
        Scanner cmdLine = new Scanner(System.in);

        while (cmdLine.hasNextLine() && !isExit) {

            String cmd = cmdLine.nextLine();

            if (cmd.matches("[Q|q]")) {
                System.out.println("Thanks for visiting your friendly Horse Race Park! Good-bye.");
                isExit = true;
            } else {
                cmdProcessor.processCmdLine(cmd);
            }
        }

        if (null != cmdLine) {
            cmdLine.close();
        }
    }

}
