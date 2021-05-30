package javasessions;

public class StaticClass {

    public static void main(String[] args) {
        System.out.println(main.x);

   /*
    Note: When any variable is declared with final then static block wont execute but if we remove the final keyword
                Then complier will take the variable and Static block as well
                */
    }
}

class main {

    public static final int x = 100;

    static {
        System.out.println("main -- class static block...");
    }

}
