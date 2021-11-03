package praAbstract;

public class chrome extends drive {

    public final String driveName="Chrome";


    @Override
    public void openBrowser() {

        System.out.println("Open "+ driveName);

    }

    @Override
    public void getURL() {

        System.out.println("Get the adress of " + driveName);

    }
}
