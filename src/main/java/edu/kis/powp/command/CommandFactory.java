package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;

public final class CommandFactory {

    private CommandFactory() {

    }

    public static ComplexCommand rightTriangleCommand(int x, int y, int width, int height, Job2dDriver driver)
    {
        ArrayList<DriverCommand> commands = new ArrayList<>();
        commands.add(new SetPositionCommand(x, y, driver));
        commands.add(new OperateToCommand(x + width, y, driver));
        commands.add(new OperateToCommand(x, y + height, driver));
        commands.add(new OperateToCommand(x, y, driver));

        return new ComplexCommand(commands);
    }

    public static ComplexCommand crossCommand(int x, int y, int armSize, Job2dDriver driver) {
        ArrayList<DriverCommand> commands = new ArrayList<>();

        commands.add(new SetPositionCommand(x, y, driver));

        commands.add(new OperateToCommand(x + armSize, y, driver));

        commands.add(new OperateToCommand(x + armSize, y - armSize, driver));
        commands.add(new OperateToCommand(x + 2 * armSize, y - armSize, driver));
        commands.add(new OperateToCommand(x + 2 * armSize, y, driver));

        commands.add(new OperateToCommand(x + 3 * armSize, y, driver));
        commands.add(new OperateToCommand(x + 3 * armSize, y + armSize, driver));
        commands.add(new OperateToCommand(x + 2 * armSize, y + armSize, driver));

        commands.add(new OperateToCommand(x + 2 * armSize, y + 2 * armSize, driver));
        commands.add(new OperateToCommand(x + armSize, y + 2 * armSize, driver));
        commands.add(new OperateToCommand(x + armSize, y + armSize, driver));

        commands.add(new OperateToCommand(x, y + armSize, driver));
        commands.add(new OperateToCommand(x, y, driver));

        return new ComplexCommand(commands);
    }

}
