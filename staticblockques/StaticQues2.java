package staticblockques;

public class StaticQues2 {

    // Q2. How can we run a java program without making any object?

//    Here static block will be called and it will be loaded whenever class file will be created
    // static Method is different and block is different

    static {
        System.out.println("Static Block");
    }

    public static void test(){
        System.out.println("Testing Method");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
    }
}
