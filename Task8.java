package StreamTasksMedium;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task8 {
    public static void main(String[] args) {
        List<String> list = List.of("Hello", "World","Java","Programming","Paralel","Wow");
        Map<Character,List<String>> map = list.stream().collect(Collectors.groupingBy(s -> s.charAt(0)));
        map.forEach(
                (key,value) ->
                        System.out.println("Key: " + key +
                                "     Values: " + value.stream()
                                .collect(Collectors.joining(",")))
        );
    }
}
