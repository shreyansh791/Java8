package miscellaneous;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlatMapDemo {
    public static void main(String[] args) {
        List<Map<String, Integer>> listOfMap = new ArrayList<>();
        Map<String, Integer> mapEntry = new HashMap<>();
        mapEntry.put("Shreyansh", 30);
        mapEntry.put("Amod", 31);
        mapEntry.put("Amuthan", 32);
        mapEntry.put("Mukesh", 33);
        mapEntry.put("Omprakash", 34);

        Map<String, Integer> mapEntry2 = new HashMap<>();
        mapEntry2.put("Shreyansh1", 30);
        mapEntry2.put("Amod1", 31);
        mapEntry2.put("Amuthan1", 32);
        mapEntry2.put("Mukesh1", 33);
        mapEntry2.put("Omprakash1", 34);

        listOfMap.add(mapEntry);
        listOfMap.add(mapEntry2);

        listOfMap.stream().
                flatMap(list -> list.entrySet().parallelStream()).
                forEach(i -> {
                    System.out.println("i.getKey() = " + i.getKey()+ "i.getValue() = " + i.getValue());
                });

    }
}
