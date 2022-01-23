package miscellaneous;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class MapDemo {
    public static void main(String[] args) {
        {
            List<Integer> list = new ArrayList<>();


            list.add(1);
            list.add(2);
            Function<Integer,Integer> function=(i)->i+5;
            list.stream()
                    .map(function)
                   .forEach(i-> System.out.println("i = " + i));

        }
    }
}
