package miscellaneous;

import java.util.ArrayList;
import java.util.List;

public class SumOfNumber {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(8);
        list.add(4);

        Integer sum = list.stream().reduce(0, Integer::sum); // BAD APPROACH
        System.out.println("sum = " + sum);

        int sum1 = list.stream() // RIGHT APPROACH
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("sum = " + sum1);


    }
}
