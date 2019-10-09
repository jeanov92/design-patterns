package pattern.adapter;

public class PSAdapter implements PCDevice {

    PSController psController;

    public PSAdapter(PSController psController) {
        this.psController = psController;
    }

    @Override
    public void plugToPC() {
        this.psController.plugToPS();
    }
}
