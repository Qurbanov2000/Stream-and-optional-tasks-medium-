package StreamTasksMedium;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(4,7,2,5,8);
        List<Integer> list2 = List.of(6,3,2,1,7,9);

        List<Integer> list3 = Stream
                .concat(list1.stream(),list2.stream())
                .distinct()
                .sorted().toList();

        System.out.println(list3);
    }
}
