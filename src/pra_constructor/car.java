package pra_constructor;

public class car {

    public String name;
    public String color;
    public int engine;
    public int doors;

    public car() {

        this("no info", "no info", 0,0);
    }

    public car(String name, String color){
        this(name, color, 0, 0);

    }


    public car (String name, String color, int engine, int doors) {

    }

    public void showInfos() {

        System.out.println(this.color);
        System.out.println(this.name);
        System.out.println(this.engine);
        System.out.println(this.doors);
    }


}
