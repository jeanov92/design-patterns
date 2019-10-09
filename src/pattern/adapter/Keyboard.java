package pattern.adapter;

public class Keyboard implements PCDevice {
    @Override
    public void plugToPC() {
        System.out.println("Device plugged successfully -> " + this.getClass().getSimpleName());
    }
}
