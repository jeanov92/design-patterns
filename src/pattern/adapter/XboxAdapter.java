package pattern.adapter;

public class XboxAdapter implements PCDevice {

    XboxController xboxController;

    public XboxAdapter(XboxController xboxController) {
        this.xboxController = xboxController;
    }

    @Override
    public void plugToPC() {
        this.xboxController.plugToXbox();
    }

}
