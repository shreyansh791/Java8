package predicate;

import java.util.function.IntPredicate;

public class EvenNumber {
	public static void main(String[] args) {


		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };


		checkEvenNumber(a);
	}

	public static void checkEvenNumber(int number[]) {
		IntPredicate p = i -> i % 2 != 0;
		for (int temp : number) {
		if (p.test(temp)) {
			System.out.println(temp + " :: " + true);
			}
		}
	}
}
