import java.util.HashMap;
import java.util.Map;

public class putall {
    public static void main(String[] args) {

        System.out.println( "MAP PUTALL TEST" );
        Map<String, String> PUTALLmap1 = new HashMap<String, String>();
        PUTALLmap1.put("one", "一");
        PUTALLmap1.put("two", "二");
        PUTALLmap1.put("three", "三");
        PUTALLmap1.put("four", "四");

        Map<String, String> PUTALLmap2 = new HashMap<String, String>();
        PUTALLmap2.put("one", "1");
        PUTALLmap2.put("two", "2");
        PUTALLmap2.put("three", "3");
        PUTALLmap2.put("ten", "十");
        PUTALLmap2.put("nine", "九");
        PUTALLmap2.put("eight", "八");


        PUTALLmap2.putAll(PUTALLmap1);
        // 合并后打印出所有内容
        for (Map.Entry<String, String> entry : PUTALLmap2.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }



        System.out.println( "MAP FOREACH TEST" );
        Map<String, String> FOREACHmap1 = new HashMap<String, String>();
        FOREACHmap1.put("one", "一");
        FOREACHmap1.put("two", "二");
        FOREACHmap1.put("three", "三");
        FOREACHmap1.put("four", "四");

        Map<String, String> FOREACHmap2 = new HashMap<String, String>();
        FOREACHmap2.put("one", "1");
        FOREACHmap2.put("two", "2");
        FOREACHmap2.put("three", "3");
        FOREACHmap2.put("ten", "十");
        FOREACHmap2.put("nine", "九");
        FOREACHmap2.put("eight", "八");

//        FOREACHmap2.forEach((k, v) -> FOREACHmap1.putIfAbsent(k, v));

        FOREACHmap2.forEach(FOREACHmap1::putIfAbsent);


        // 合并后打印出所有内容
        for (Map.Entry<String, String> entry : FOREACHmap1.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }











    }
}
