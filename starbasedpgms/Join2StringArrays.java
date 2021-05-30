package starbasedpgms;

import com.google.common.collect.ObjectArrays;
import com.google.common.primitives.Ints;

import java.util.Arrays;
import java.util.stream.Stream;

public class Join2StringArrays {

    public static void main(String[] args) {

        String[] batsmen = {"Rohit", "Virat", "Dhawan", "Shreyas", "Rishabh", "Shubham"};
        String[] bowlers = {"Hardik", "Jaddu", "Bhuvi", "Bumrah"};

        // Using Java 8
        Stream<String> bat = Arrays.stream(batsmen);
        Stream<String> bow = Arrays.stream(bowlers);

        String fullTeam[] = Stream.concat(bat, bow).toArray(size -> new String[size]);

        for (String s : fullTeam) {
            System.out.println(s);
        }

        System.out.println("***************");

        // Google Guava

        String str[] = ObjectArrays.concat(batsmen, bowlers, String.class);
        for (String s : str) {
            System.out.println(s);
        }

        System.out.println("************");

        //for Primitive Type

        int p1[] = {1, 2, 3, 4, 5};
        int p2[] = {3, 4, 5, 7, 8};

        int p3[] = Ints.concat(p1, p2);

        for (int i : p3) {
            System.out.println(p3);
        }

    }
}
