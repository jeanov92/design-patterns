package pattern.command;

public class GoToCommand implements Command {
    private Robot robot;

    public GoToCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        this.robot.goTo(this.robot.getPlace());
    }
}
