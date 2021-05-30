package staticblockques;

public class StaticBlock4 {

    //How can we create objects if we make the constructor private ?

   int age ;

   static {
       StaticBlock4 obj1 = new StaticBlock4();
   }

   public static int  createObject(){
       StaticBlock4 obj2 = new StaticBlock4();
      return obj2.age=40;
   }

   private StaticBlock4(){
        age=30;
   }

    public static void main(String[] args) {
        StaticBlock4 obj = new StaticBlock4();
        System.out.println(obj.age);
    }

}
