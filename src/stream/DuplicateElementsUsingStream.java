package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElementsUsingStream {
	public static void main(String[] args) {

		String skills[] = { "k8s", "k8s", "java", "docker", "java", "maven", "testng", "docker","selenium" };
		System.out.println("******************** Using Streams filter and Frequency **************************");
		List<String> skillList = Arrays.asList(skills);
		Set<String> collect = skillList.stream().filter(i -> Collections.frequency(skillList, i) > 1)
				.collect(Collectors.toSet());
		System.out.println(collect);

		System.out.println("******************** Using Streams and filter **************************");
		List<String> skillList1 = Arrays.asList(skills);
		Set<String> set = new HashSet<>();
		List<String> collect2 = skillList1.stream().filter(i -> !set.add(i)).collect(Collectors.toList());
		System.out.println(collect2);
		System.out.println("******************** Using Streams and grouping **************************");

		List<String> skillList3 = Arrays.asList(skills);
		List<String> collect3 = skillList3.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(collect3);
	}
}
