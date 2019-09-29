package lambdaexpression;

interface bb {
	void mm();
}

public class ghg {
	public static void main(String[] args) {
		bb b = ghg::nn;
		b.mm();
	}

	static void nn() {

		bb b = () -> {
			System.out.println("inside mm impl");
		};
		b.mm();
	}
}
