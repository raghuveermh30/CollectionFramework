package staticblockques;

public class StaticBlockQues1 {

    static {
        System.out.println("Static Block1");
    }

    static {
        System.out.println("Static Block2");
    }

    static {
        System.out.println("Static Block3");
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    static {
        System.out.println("Static Block4");
    }

}
