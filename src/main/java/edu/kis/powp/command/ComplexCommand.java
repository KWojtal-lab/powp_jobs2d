package edu.kis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand extends DriverCommand {
    private List<DriverCommand> commands = new ArrayList<>();

    public ComplexCommand(List<DriverCommand> cmds)
    {
        commands = cmds;
    }

    @Override
    void execute() {
        for (DriverCommand cmd : commands)
        {
            cmd.execute();
        }
    }
}
