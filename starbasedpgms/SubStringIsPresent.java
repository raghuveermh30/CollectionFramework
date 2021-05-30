package starbasedpgms;

public class SubStringIsPresent {

    public static boolean isSubString(String main, String sub){
        return main.matches("(.*)"+sub+ "(.*)");
    }

    public static boolean isSubString1(String main, String sub){
        return main.contains(sub);
    }

    public static boolean isSubString2(String main, String sub){
        return (main.indexOf(sub)!=-1);
        
    }

    public static void main(String[] args) {

        System.out.println(isSubString("Naveen automation labs", "labs"));
        System.out.println(isSubString("Naveen automation", "Naveen"));
        System.out.println(isSubString("Naveen automation", "Testing"));
        System.out.println(isSubString("Naveen automation", null));
        System.out.println(isSubString("Naveen automation", " "));

        System.out.println("*********************");

        System.out.println(isSubString1("Naveen automation labs", "labs"));
        System.out.println(isSubString1("Naveen automation", "Naveen"));
        System.out.println(isSubString1("Naveen automation", "Testing"));
        System.out.println(isSubString1("Naveen automation", null));
        System.out.println(isSubString1("Naveen automation", " "));

        System.out.println("*********************");

        System.out.println(isSubString2("Naveen automation labs", "labs"));
        System.out.println(isSubString2("Naveen automation", "Naveen"));
        System.out.println(isSubString2("Naveen automation", "Testing"));
        System.out.println(isSubString2("Naveen automation", null));
        System.out.println(isSubString2("Naveen automation", " "));
    }
}
