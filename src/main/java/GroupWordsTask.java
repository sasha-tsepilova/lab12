import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupWordsTask {
    public static Map<Character, Integer> groupIt(List<String>arr){
        Set<Map.Entry<Character, List<String>>> map = arr
                .stream()
                .collect(Collectors.groupingBy(x -> x.charAt(0), HashMap::new, Collectors.toList()))
                .entrySet();
        return map.stream().collect(Collectors.toMap(Map.Entry::getKey, GroupWordsTask::remake));
    }
    private static Integer remake(Map.Entry<Character, List<String>> toRemake){
        List<String> arr = toRemake.getValue();
        Character key = toRemake.getKey();
        int num = 0;
        for(String word: arr){
            for(int i = 0; i< word.length(); i++){
                if(word.charAt(i) == key) num++;
            }
        }
        return num;
    }
}
