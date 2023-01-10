import java.util.HashMap;
import java.util.Map;


public class countLinesInWords {
    public static void main(String[] args) {
        
    }
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> someMap1 = new HashMap<>();
        Map<String, Integer> someMap2 = new HashMap<>();

        for (String word : words1) {
            someMap1.putIfAbsent(word, 0);
            someMap1.put(word, someMap1.get(word) + 1);
        }

        for (String word : words2) {
            someMap2.putIfAbsent(word, 0);
            someMap2.put(word, someMap2.get(word) + 1);
        }
        int count = 0;

        for (String word : words1) {
            if (someMap1.containsKey(word) && someMap2.containsKey(word)) {
                if (someMap1.get(word) == 1 && someMap2.get(word) == 1) {
                    count++;
                }
            }
        }

        return count;
    }
}