package LambdaExpressions;

import java.util.function.Consumer;

public class Application {
    public static void main(String[] args) {

        resultPrinter.accept(sum.execute(1,2));
    }

    static MathOperation<Integer> sum = (a,b) -> {
      return a+b;
    };

    static Consumer<Integer> resultPrinter = (result) -> {
        System.out.println("result = " + result);
    };
}
