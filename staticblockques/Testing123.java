package staticblockques;

public class Testing123 {

    static {
        System.out.println("Static Block");
    }
    {
        System.out.println("Instance Initialiser Block");
    }

    Testing123(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
        /*o/p
        Static Block
        Main Method*/

        new Testing123(); //Creating the object

     /*   o/p
        Static Block
        Main Method
        Instance Initialiser Block
                Constructor      */
    }

}
