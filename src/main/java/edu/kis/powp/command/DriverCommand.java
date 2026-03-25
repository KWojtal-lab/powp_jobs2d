package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public abstract class DriverCommand {
    protected Job2dDriver driver;
    abstract void execute();
}
