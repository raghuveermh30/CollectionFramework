package starbasedpgms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringLengthMethod {

    public static void main(String[] args) {

        String str = "Testing";

        System.out.println(str.length());
        System.out.println(str.toCharArray().length);
        System.out.println(str.lastIndexOf(""));

        Matcher matcher = Pattern.compile("$").matcher(str);
        matcher.find();
        int lenght = matcher.end();

        System.out.println(lenght);

        System.out.println(str.split("").length);

        int count = 0;

        for(char c : str.toCharArray()){
            count++;
        }
        System.out.println(count);
    }
}
