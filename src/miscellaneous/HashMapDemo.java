package miscellaneous;

import java.util.*;
import java.util.stream.Collectors;

public class HashMapDemo {
    public static void main(String[] args) {
        {

            Map<String, Integer> mapEntry = new HashMap<>();
            mapEntry.put("Shreyansh", 30);
            mapEntry.put("Amod", 31);
            mapEntry.put("Amuthan", 32);
            mapEntry.put("Mukesh", 33);
            mapEntry.put("Omprakash", 34);


            LinkedHashMap<String, Integer> map = mapEntry.entrySet()
                    .stream()
                    //.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
//                    .sorted((c1, c2) -> c2.getValue().compareTo(c1.getValue()))
                    .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                            (oldValue, newValue) -> oldValue, LinkedHashMap::new));
            System.out.println("map = " + map);

        }
    }
}
