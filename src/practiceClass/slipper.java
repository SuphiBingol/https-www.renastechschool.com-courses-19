package practiceClass;

public class slipper {


    String brand;
    int size;
    String color;

    public void wear() {

        System.out.println("Suphi is wearing "+ brand + "slipper");
    }

    public void setSlipperInfo(String brand, int size, String color) {
     this.brand=brand;
     this.size=size;
     this.color=color; }


     public String toString() {

         return brand + "-" + size + "- " + color;
     }

    public void getSlipperInfo() {
    }
//Actions:
//   wear(), setSlipperInfo,  toString;
//
//create a slipper object class to set 5 slipper object and print slipper info
//  */
}
