package LambdaExpressions;

@FunctionalInterface
public interface MathOperation<T> {
    T execute(T a, T b);
}
