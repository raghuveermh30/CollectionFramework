package InterviewConcepts;

public class AlphabetCheck {

    public static void main(String[] args) {

        char c = 'a';
        char c1 = '$';

        if((c>='a' && c<='z') || (c>='A' && c<= 'Z')){
            System.out.println(c + " is a alpabet");
        }
        else{
            System.out.println(c+ "is not an alphabet");
        }
    }
}
