package lambdaexpression;

interface Demo1 {
	public int demo(String s);
}

public class LambdaExp {

	public static void main(String[] args) {
		Demo1 d = (s) -> s.length();
		

	}

}