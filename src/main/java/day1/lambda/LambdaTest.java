package day1.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class LambdaTest {
    List<String> list = new ArrayList<>();

    public LambdaTest() {
        list.add("Anna");
        list.add("Basia");
        list.add("Alicja");
        list.add("Ewa");
        list.add("Dorota");
    }

    public static void main(String[] args) {
        LambdaTest lambdaTest = new LambdaTest();
        lambdaTest.method2();
    }

    private void method1() {
        LambdaTest lambdaTest = new LambdaTest();  //powołanie obiektu - wywołanie tego co mamy w konstruktorze
//        Consumer<String> cons = new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.print(s + "-");
//            }
//        };
        lambdaTest.list.forEach(x -> System.out.println(x + "-"));
    }

    private void method2() {
        LambdaTest lambdaTest = new LambdaTest();
//        lambdaTest.list.forEach(System.out::println);
//        Comparator<String> comparator = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        };
        lambdaTest.list.sort((x, y) -> x.length() - y.length());
//        System.out.println("*********");
        lambdaTest.list.forEach(System.out::println);
    }
}
