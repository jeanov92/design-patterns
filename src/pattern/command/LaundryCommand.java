package pattern.command;

public class LaundryCommand implements Command {

    private Robot robot;

    public LaundryCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        this.robot.doLaundry();
    }
}
