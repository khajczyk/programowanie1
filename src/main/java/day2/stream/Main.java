package day2.stream;

import day1.sorting.Car;
import day1.sorting.ListCreat;
import day2.fluency.Settings;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static jdk.nashorn.internal.objects.NativeMath.random;

public class Main {

    private void arrayToStream() {
        String[] table = {"Mateusz", "Monika", "Artur", "Ala", "Norbert"};
//        Predicate<String> keyWord = new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.length() == 5;
//            }
//        };
//        Consumer<String> consumer = new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        };
        Arrays.stream(table).filter(x -> x.length() == 5).forEach(System.out::println);
    }

    private void streamCreate() {
        Stream<String> emptyStream = Stream.empty();
        Stream<String> arrayStream = Stream.of("Mateusz", "Monika", "Artur", "Ala", "Norbert");
        emptyStream.forEach(System.out::println);
        arrayStream.forEach(System.out::println);
        Stream<String> streamBuilder = Stream.<String>builder().add("Piotrek").add("Kot").add("bot").build();
        streamBuilder
                .map(x -> x.toUpperCase())
                .forEach(System.out::println);

    }

    private void method() {
        String s = ListCreat.getCars()
                .stream()
                .map(x -> x.getColor().toUpperCase())
                .collect(Collectors.joining(" - "));
        System.out.println(s);
    }

//    private void method2() {
//        IntStream nameStream = new Random(40).ints(10);
//        Stream<Double> nameStream2 = Stream.generate((x) -> x.r).limit(10);
//        nameStream2.forEach(System.out::println);
//    }


    private void method3() throws IOException {
        Stream<String> lines = Files.lines(Paths.get("src/main/java/day1/lambda/Calculator.java"));
        lines.forEach(System.out::println);
    }


    public static void main(String[] args) throws IOException {
        Main main = new Main();
        Car car = main.genericMethod(new Car("Black","V50",124,1241,"Volvo"));
        Settings settings = main.genericMethod(new Settings().setName("Verdana")
                .setColor("red")
                .setFontFamily("Verdana")
                .setStyle("bold")
                .setSize(20));
        System.out.println(car);
        System.out.println(settings);
    }

    public <T> T genericMethod(T t) {
        if(t instanceof Settings) {
            System.out.println("settings");
            ((Settings) t).setName("Comic Sans");
        }
        if(t instanceof Car) {
            System.out.println("car");
            ((Car) t).setName("Volvo");
        }
        return t;
    }
}
