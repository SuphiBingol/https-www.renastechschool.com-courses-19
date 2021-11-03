package praAbstract;

public class main {

    public static void main(String[] args) {

        chrome obj1=new chrome();
        fireFox obj2=new fireFox();

        obj1.getURL();
        obj1.openBrowser();
        obj1.closeBrowser();


        obj2.getURL();
        obj2.openBrowser();
    }
}
