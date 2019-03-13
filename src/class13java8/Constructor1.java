package class13java8;


import class13java8.Ex_1.Singer;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

/**
 * Created by user on 04.03.2019.
 */
public class Constructor1 {
    public static void main(String[] args) {
//        List<Singer> singer =asList(Singer.of("Prodigy", "London"),Singer.of("Shakirs", "Miami"));

       /* Predicate<Singer> emptySinger = singer -> singer.name.length() == 0;
        emptySinger.test(new Singer());
        TriplePred<Singer> singerTriplePred = (arg1, arg2, arg3) -> arg1.name.isEmpty() && arg2.name.isEmpty() && arg3.name.isEmpty();
        singerTriplePred.test(new Singer(), new Singer(), new Singer());*/

      /*  Function<Singer, List<String>> singerToList = (singer) -> {
           asList(singer.toString());
        };

        Singer prodigy = new Singer();
        prodigy.name = "Prodigy";
        prodigy.homeTown = "London";

        System.out.println(Stream.of(singerToList(prodigy)));

//        System.out.println(addUp(Stream.of(1,2,3,5)));
    }

    static int addUp(Stream<Integer> numbers) {

        return numbers.collect(Collectors.summingInt(Integer::intValue));
    }

    static List<String> songsBySinger(Stream<Singer> singers, Singer singerToFind) {
        return singers.filter(singer -> singerToFind);
    }*/
    }
}
