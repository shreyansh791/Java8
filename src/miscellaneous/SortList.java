package miscellaneous;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(8);
        list.add(4);


        List<Integer> collect = list.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

//        System.out.println("collect = " + collect);
        Optional<Integer> min = list.stream()
                .min(Comparator.naturalOrder());
        if(min.isPresent())
            System.out.println("min.get() = " + min.get());

        Optional<Integer> max = list.stream()
                .max(Comparator.naturalOrder());
        if(min.isPresent())
            System.out.println("max.get() = " + max
                    .get());


    }
}
