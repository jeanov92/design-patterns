package pattern.adapter;

public class XboxController {

    public void plugToXbox() {
        System.out.println("Device plugged successfully -> " + this.getClass().getSimpleName());
    }

}
