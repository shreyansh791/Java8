package predicate;

public class Len {
	public static void main(String[] args) {
		String s = "Shreyansh Jain";
		System.out.println(s.lastIndexOf(""));
		int length = 0;
		for(Character c:s.toCharArray())
			length++;
		System.out.println(length);
	}
}
