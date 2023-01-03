package slide3;

public class replace {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("12345678");
		
		sb.replace(5, 7, "was");
	    System.out.println("After replace: " + sb);
	    // +---+
	    StringBuilder Builder = new StringBuilder("This is a test from java2s.com.");

	    Builder.replace(5, 7, "was");
	    System.out.println("After replace: " + Builder);
	}

}
