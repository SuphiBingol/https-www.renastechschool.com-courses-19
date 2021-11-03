package praConstructor;

public class person {

   String name;
   int age;
   String gender;

   public void setPersonInfo(String name, int age, String gender){
      this.name=name;
      this.age=age;
      this.gender=gender;
   }

   public void eat(String food) {

      System.out.println("Rodin likes "+food);
   }

   public void walk(int miles) {

      System.out.println("Rodin walks 5 "+ miles+" miles");
   }

   public void gender(String boy) {

      System.out.println("Roidin is a handsome " + boy);
   }
//                methods: eat, walk, sleep, setPersonInfo
}
