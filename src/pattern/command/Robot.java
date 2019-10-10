package pattern.command;

public class Robot {

    private String simpleName = this.getClass().getSimpleName();
    private  String place;

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPlace() {
        return place;
    }

    public void doLaundry() {
        this.takeDirtyClothes();
        System.out.println(simpleName + " is doing laundry");
    }

    private void takeDirtyClothes() {
        System.out.println(simpleName + " is taking dirty clothes \n " +
                "preparing for doing the laundry...");
    }

    public void dance() {
        System.out.println(simpleName + " is dancing");
    }

    public void goTo (String place) {
        System.out.println(simpleName + " is going to " + place);
    }
}
