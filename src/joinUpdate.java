import java.util.HashMap;
import java.util.Map;

public class joinUpdate {
    public static void main(String[] args) {
        System.out.println("MAP FOREACH TEST");
        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("one", "一");
        map1.put("two", "二");
        map1.put("three", "三");
        map1.put("four", "四");

        Map<String, String> map2 = new HashMap<String, String>();
        map2.put("one", "1");
        map2.put("two", "2");
        map2.put("three", "3");
        map2.put("ten", "十");
        map2.put("nine", "九");
        map2.put("eight", "八");



        map1.forEach((k, v) -> {
            if (map2.containsKey(k)) map2.put(k, v);
        });

        System.out.println(map2);
    }
}
