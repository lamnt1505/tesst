package slide3;

public class setCharAt {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("WelcomeLam");
		
		 System.out.println("String = "  + str.toString());
		 
		 str.setCharAt(8, 'l');
		 
		 System.out.println("After setCharAt() String = " + str.toString());
	}

}
