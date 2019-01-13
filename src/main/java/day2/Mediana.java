package day2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Mediana {

    public List mediana1() {
        Scanner scanner = new Scanner(System.in);
        String s;
        List<Double> list = new ArrayList<>();
        do {
            s = scanner.nextLine();
            try{
                double d = Double.parseDouble(s);
                list.add(d);
            } catch(NumberFormatException e) {
                if (!s.equals("q")) {
                    System.out.println("nie wpisano liczby, q aby wyjść");
                }
            }
        } while (!s.equals("q"));
        return list;
    }

    private double median(double... dable) {
        Arrays.sort(dable);
        int size = dable.length;
        if(size == 0) {
            throw new IllegalArgumentException("metoda powinna posiadać minimum jeden argument");
        }else if (size % 2 == 0) {
            return (dable[size / 2 - 1] + dable[size / 2]) / 2;
        }
        return (dable[size / 2]);
    }

    public static void main(String[] args) {
        Mediana main = new Mediana();
//        System.out.println(main.median(1, 4, 51, 52));
        System.out.println(main.mediana1());
    }
}