package javasessions;

public class NullArgument {

    public static void main(String[] args) {

        test(null);
    }

    public  static void test(Object o){
        System.out.println("Object Argumemt");
    }

    public  static void test(String o){
        System.out.println("String Argumemt");
    }

  /*  public  static void test(StringBuffer o){
        System.out.println("String Argumemt");
    }*/
}
