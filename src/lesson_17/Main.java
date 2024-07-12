package lesson_17;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // HW: Create word counter and sort words by number of occurrences
        // and present them in the console
    }

    private static void treeMapExample() {
        Map<Integer, String> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        treeMap.put(10, "asdkaskjd");
        treeMap.put(12, "asdlnajks");
        treeMap.put(8, "kaks");
        treeMap.put(9, "wqewe");
        System.out.println(treeMap);
        Map<String, Double> treeMap2 = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        treeMap2.put("abcd", 5.4);
        treeMap2.put("b", 5.4);
        treeMap2.put("abd", 5.4);
        treeMap2.put("zzz", 5.4);
        System.out.println(treeMap2);
    }

    private static Map<Character, Integer> getLetterCount(String input) {
        Map<Character, Integer> letterCountMap = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            if (letterCountMap.containsKey(letter)) {
                int value = letterCountMap.get(letter);
                letterCountMap.put(letter, value + 1);
            } else {
                letterCountMap.put(letter, 1);
            }
        }
        return letterCountMap;
    }

    private static void mapBasics() {
        // Map stores key-value pairs
        // Milan -> Vucic
        // a -> 9
        String[] names = {"Milan", "Krzysztof", "Farouqy"};
        // 0 -> Milan
        names[0] = "Marco";
        // 0 -> Marco
        Map<String, Integer> map = new HashMap<>();
        map.put("Milan", 10);
        map.put("Marco", 5);
        map.put("Lucia", 5);
        map.put("Milan", 150);
        System.out.println(map.size());
        System.out.println(map.get("Milan"));
        System.out.println(map.get("Isnt there"));

        Set<String> keys = map.keySet();
        List<String> particularNames = new ArrayList<>();
        for (String key : keys) {
            Integer value = map.get(key);
            if (value == 5) {
                particularNames.add(key);
            }
            System.out.println(key + " -> " + value);
        }

        System.out.println(particularNames);
        Collection<Integer> values = map.values();
        for (Integer value : values) {
            System.out.println(value);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
