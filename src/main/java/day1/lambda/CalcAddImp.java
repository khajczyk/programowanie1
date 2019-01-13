package day1.lambda;

public class CalcAddImp implements Calculator{

    @Override
    public int calc(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(new CalcAddImp().calc(12, 31));
    }
}
