import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class iterator {
    public static void main(String[] args) {



        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("one", "一");
        map1.put("two", "二");
        map1.put("three", "三");

        Map<String, String> map2 = new HashMap<String, String>();
        map2.put("one", "1");
        map2.put("two", "2");
        map2.put("three", "3");
        map2.put("ten", "十");
        map2.put("nine", "九");
        map2.put("eight", "八");




        Iterator updateIter2 = map2.entrySet().iterator();
        while(updateIter2.hasNext()){
            Map.Entry entry = (Map.Entry)updateIter2.next();
            String key = (String) entry.getKey();
            if(map1.containsKey(key)){
                map2.put(key,map1.get(key));
            }
        }


        System.out.println("迭代测试1"); // prints ue1Value56

        Iterator printIter = map2.entrySet().iterator();
        while(printIter.hasNext()){
            Map.Entry entry = (Map.Entry)printIter.next();
            String key = (String) entry.getKey();
            String value = (String) entry.getValue();
            System.out.println("key=" + key + ", value=" + value); // prints ue1Value56
        }






    }
}
