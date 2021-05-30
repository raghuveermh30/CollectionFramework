package staticblockques;

// Will the static block executed in the following Code ? why?

class Test {

    static {
        System.out.println("Static Block");
    }
    static final int age = 25;

    //final = o/p = 25
    // if Final is not present Static block will be executed
}

public class StaticBlock7{

    public static void main(String[] args) {
        System.out.println(Test.age);
    }

        }
