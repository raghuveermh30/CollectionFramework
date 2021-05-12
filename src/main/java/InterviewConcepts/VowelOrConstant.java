package InterviewConcepts;

public class VowelOrConstant {
    public static void main(String[] args) {

        char ch = 'a';

        // a, e, i, o, u

		/*
		 * if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		 * System.out.println("The eneterd character is Vowel"); } else {
		 * System.out.println("The Enterd Character is Consonant"); }
		 * 
		 * switch (ch) { case 'a': case 'e': case 'i': case 'o': case 'u':
		 * System.out.println("The entered character is Vowel "); break; default:
		 * System.out.println("The enterd charcter is conson"); break; }
		 */
        
        int x = 1;
        int result = 0;

        while (x<=10){
            if(x%2==0){
                result+= x;
                ++x;
            }
        }
        System.out.println("Output"+result);
    }

    }

