package pattern.adapter;

public class PSController {

    public void plugToPS() {
        System.out.println("Device plugged successfully -> " + this.getClass().getSimpleName());
    }
}
