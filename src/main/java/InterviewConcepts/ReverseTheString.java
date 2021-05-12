package InterviewConcepts;

public class ReverseTheString {

	public static void main(String[] args) {
		
		String s = "Selenuim";
		
		int len = s.length();//8
		
		String rev = "";
		
		// Using for loop
		
		for(int i=len-1;i>=0;i--) {
			rev = rev+s.charAt(i); //miuneleS
		}
		
		System.out.println(rev);
		
		int num = 12345;
		//using StringBuffer class
		
		
		
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
		
		StringBuffer sb1 =  new StringBuffer(String.valueOf(num));
		System.out.println(sb1.reverse());
	}
	
	

}
