package stream;

public class StringDemo {
	public static void main(String[] args) {
		String s = "Gaurva Singh [ncjancjan]()";

		if (s.contains("[")) {
			System.out.println(s.substring(0, s.indexOf("[")));

		}
		else if (s.contains("(") && !s.contains("["))
		{
			System.out.println(s.substring(0, s.indexOf("(")));
			
		}
		else {

			System.out.println(s);
		}

	}
}
