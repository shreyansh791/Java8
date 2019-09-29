package lambdaexpression;

interface Demo1 {
	public int demo(String s);
}

interface Interf {
	public int square(int a, int b);
}
public class LambdaExp {

	public static void main(String[] args) {
		/*
		 * Without curly braces we can not use return statement. Within curly braces if
		 * we want to return some value compulsory we should use return statement
		 */
		demoImpl(15, 550);


	}

	public static void demoImpl(int a, int b) {
		Interf i = (p, q) -> p + q;
		int square = i.square(a, b);
		System.out.println(square);
	}

}