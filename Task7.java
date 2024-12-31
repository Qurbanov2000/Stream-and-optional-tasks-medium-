package StreamTasksMedium;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Task7 {
    public static void main(String[] args) {
        List<String> list = List.of(
                "Hello Java World Hello Java",
                "Hi everyone please send this to everyone",
                "Happy new year new year"
        );
        Set<String> set = list.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .map(String::toLowerCase)
                .collect(Collectors.toSet());
        System.out.println(set);
    }
}
