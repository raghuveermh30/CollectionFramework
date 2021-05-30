package starbasedpgms;

import java.lang.reflect.Field;

public class StringTranslator {


    static {

        try {
            Field value = String.class.getDeclaredField("value");
            value.setAccessible(true);
            value.set("Hello Naveen", "Hola naveen");
            value.set("I need help in Java", "Refer Naveen Automation Labs");
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {

        System.out.println("Hello Naveen");
        System.out.println("I need help in Java");
    }
}
