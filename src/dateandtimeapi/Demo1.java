package dateandtimeapi;

public class Demo1 {
	static int i = 10;
	static int j;
	static {   System.out.println("Static block initialized.");   j = i * 2; 
	}
	static {

		System.out.println("Static Block...");
	}
	public static void main(String[] args) {  
		System.out.println("Value of i : " + i); 
		System.out.println("Value of j : " + j);
	}

}
