import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {

        Map<String, Integer> numbers = new HashMap<>();
        /*
            It does not maintain the insertion order
         */

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 5);

//        numbers.put("Two", 23); // it will overwrite the value of key: Two

        numbers.putIfAbsent("Two", 23);
        /*
            It will first check whether the given key is absent or not,
            then it will insert the element
         */

//        System.out.println(numbers);

//        System.out.println(numbers.containsKey("Three")); // it will check whether the given keys is present or not
//        System.out.println(numbers.containsValue(4)); // it will check whether the given values is present or not
//        System.out.println(numbers.isEmpty());

//        for(Map.Entry<String, Integer> ele : numbers.entrySet()){
//            System.out.println(ele);
//            System.out.println(ele.getKey());
//            System.out.println(ele.getValue());
//        }

        for (String key: numbers.keySet()) {
            System.out.println(key);
        }
//
//        for(Integer value: numbers.values()) {
//            System.out.println(value);
//        }

    }
}
