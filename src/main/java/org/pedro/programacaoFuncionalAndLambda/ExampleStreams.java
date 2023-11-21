package org.pedro.programacaoFuncionalAndLambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ExampleStreams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,4,5,10,7);

        Stream<Integer> stream = list.stream().map(x -> x *10);
        //Uso array em toString e pego a stream e transformo em array
        System.out.println(Arrays.toString(stream.toArray()));

        Stream<String> stream1 = Stream.of("Maria", "Alex", "Bob");
        System.out.println(Arrays.toString(stream1.toArray()));

        Stream<Integer> stream2 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(stream2.limit(10).toArray()));

        Stream<Long> fibonnaci = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]})
                .map(p -> p[0]);
        System.out.println(Arrays.toString(fibonnaci.limit(50).toArray()));
    }
}
