package miscellaneous;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MinDemo {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);


        Integer integer = integerList.stream()
                .min(Comparator.naturalOrder())
                .orElseThrow(() -> new RuntimeException(""));
        System.out.println("integer.intValue() = " + integer.intValue());


    }
}
