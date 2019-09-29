package lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SortingEmpArrayList {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Shreyansh", 22));
		list.add(new Employee("Abhishek", 87));
		list.add(new Employee("Manoj", 2));
		list.add(new Employee("Praneeth", 34));
		list.add(new Employee("Aurobinda", 21));
		Collections.sort(list, (e1, e2) -> e1.getId() - (e2.getId()));
		list.forEach((s) -> System.out.println(s));
	}
}
