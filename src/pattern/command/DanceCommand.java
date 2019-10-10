package pattern.command;

public class DanceCommand implements Command {

    private Robot robot;

    public DanceCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        this.robot.dance();
    }
}
