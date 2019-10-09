package pattern.adapter;

import java.util.ArrayList;
import java.util.List;

public class PC {

    private List<PCDevice> pcDevices = new ArrayList<>();

    public void addDevice(PCDevice device) {
        this.pcDevices.add(device);
    }

    public void listDevices() {
        System.out.println("Devices plugged into " + this.getClass().getSimpleName());
        this.pcDevices.forEach(PCDevice::plugToPC);
    }
}