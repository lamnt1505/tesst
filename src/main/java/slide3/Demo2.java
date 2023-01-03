package slide3;

public class Demo2 {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
		
		char charArray[] = {'a', 'b', 'c', 'd', 'e', 'f'};
		buffer.insert(0, charArray);
		
		System.out.println(buffer.toString());
		
		StringBuilder Builder = new StringBuilder();
		

		char characterValue = 'K';
		Builder.insert(0, characterValue);

		System.out.println(Builder.toString());
	}

}
