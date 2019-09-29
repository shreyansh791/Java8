package lambdaexpression;

import java.util.TreeSet;

public class SortingTreeSetInDescendingOrder {
	public static void main(String[] args) {


		TreeSet<Integer> s = new TreeSet<Integer>((I1, I2) -> (I1 > I2) ? -1 : (I1 < I2) ? +1 : 0);

		s.add(10);
		s.add(5);
		s.add(13);
		s.add(21);
		s.add(92);
		s.add(18);
		System.out.println(s);
		

	}
}
