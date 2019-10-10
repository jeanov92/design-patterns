package pattern.command;

public class Main {

    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.setPlace("1st floor");

        LaundryCommand laundryCommand = new LaundryCommand(robot);
        DanceCommand danceCommand = new DanceCommand(robot);
        GoToCommand goToCommand = new GoToCommand(robot);

        laundryCommand.execute();
        danceCommand.execute();
        goToCommand.execute();

        robot.setPlace("2nd floor"); // It works because robot has the same reference
        goToCommand.execute();


    }
}
