package pattern.adapter;

public class Main {

    public static void main(String[] args) {
        PC pc = new PC();
        Keyboard keyboard = new Keyboard();
        PSController psController = new PSController();
        XboxController xboxController = new XboxController();

        PSAdapter psAdapter = new PSAdapter(psController);
        XboxAdapter xboxAdapter = new XboxAdapter(xboxController);

        pc.addDevice(keyboard);
        pc.addDevice(psAdapter);
        pc.addDevice(xboxAdapter);

        pc.listDevices();


    }
}
