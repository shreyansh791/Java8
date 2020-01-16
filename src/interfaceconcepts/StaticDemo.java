package interfaceconcepts;

public class StaticDemo {
	static int count = 10; // static variable or class variable

	public static void staticMethod() {
		System.out.println("Inside Static Method.");
	}

	static {
		System.out.println("Static Block.");
	}

	public static void main(String[] args) {
		staticMethod();
		StaticDemo.staticMethod();
		System.out.println(StaticDemo.count);
	}
}
