import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzTask {
    public static List<String>  fizzBuzz(int n){
        return IntStream.range(0,n).boxed().collect(Collectors.toList()).stream().map(x->process(x)).collect(Collectors.toList());
    }
    private static String process(int x){
        if(x%15 ==0) return "Fizz Buzz";
        if(x % 5 == 0) return "Buzz";
        if(x % 3 == 0) return "Fizz";
        return Integer.toString(x);
    }
}
