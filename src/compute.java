import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class compute {
    public static void main(String[] args) {


        System.out.println( "Compute Test");
        HashMap<String, Integer> map=new HashMap<>();
        /*boolean*///当这个value为null时为1，否则为3
        map.put("DEMO1", 1);
        map.put("DEMO2", 2);
        System.out.println(map);//{DEMO1=1, DEMO2=2}
        map.compute("DEMO2", (k,v)->v==2?1:3);
        System.out.println(map);//{DEMO1=1, DEMO2=3}


        System.out.println( "Compute Test");
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



//
//        Iterator printIter = map2.entrySet().iterator();
//        while(printIter.hasNext()){
//            Map.Entry entry = (Map.Entry)printIter.next();
//            String key = (String) entry.getKey();
//            String value = (String) entry.getValue();
//            map2.computeIfAbsent((k, v) -> v == null ? new ArrayList<>(1) : v)
//        }
//

        // 合并后打印出所有内容
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }



    }
}
