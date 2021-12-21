import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println(FlattingTask.flattingStrings(Arrays.asList("abc","cbd")));
        System.out.println(FizzBuzzTask.fizzBuzz(10));
        List<String> arr = Arrays.asList("ABCA", "BCD", "ABC");
        Set<Map.Entry<Character, List<String>>> map = arr
                .stream()
                .collect(Collectors.groupingBy(x -> x.charAt(0), HashMap::new, Collectors.toList()))
                .entrySet();
        System.out.println(map);
    }
}
