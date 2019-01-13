package day1.lambda;

public class CalculatorImp {
//    public int addition(int a, int b){
//        Calculator calc = new Calculator() {
//            @Override
//            public int calc(int a, int b) {
//                return a + b;
//            }
//        };
//        return calc.calc(a,b);
//    }

    public static void main(String[] args) {
        System.out.println(new CalculatorImp().multiLambda(12, 3));
    }

    public int addLambda(int a, int b) {
        Calculator calc = (x, y) -> x + y; //implemantacja intefejsu funkcyjnego
        return calc.calc(a, b);
    }

    public int subLambda(int a, int b) {
        Calculator calc = (c, d) -> c - d; //implemantacja intefejsu funkcyjnego
        return calc.calc(a, b);
    }

    public int divLambda(int a, int b) {
        Calculator calc = (c, d) -> c / d; //implemantacja intefejsu funkcyjnego
        return calc.calc(a, b);
    }

    public int multiLambda(int a, int b) {
        Calculator calc = (c, d) -> c * d; //implemantacja intefejsu funkcyjnego
        return calc.calc(a, b);
    }

}