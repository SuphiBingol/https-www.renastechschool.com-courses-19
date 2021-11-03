package praOOP;

public class phone {

    public String color;
    private int number;
    private long ip;
    public char size;


    public void call() {

        System.out.println("I call eveyday");
    }

    public void text() {

        System.out.println("I love texting");
    }

    public void setNumber(int number) {

        this.number=number;
    }

    public int getNumber() {

        return number;
    }

    public void setIp(long ip) {
        this.ip=ip;
    }

    public long getIp() {

        return ip;
    }



}
