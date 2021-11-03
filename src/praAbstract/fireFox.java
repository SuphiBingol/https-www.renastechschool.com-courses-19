package praAbstract;

public class fireFox extends drive{

    public final String driveName="Firefox";

    @Override
    public void openBrowser() {
        System.out.println("Hello hello" +driveName);

    }

    @Override
    public void getURL() {

        System.out.println("Please bring "+driveName);

    }
}
