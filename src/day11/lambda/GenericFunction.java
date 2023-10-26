package day11.lambda;

@FunctionalInterface
public interface GenericFunction<X, Y> {
    //x에서 y를 추출해줄게
    Y apply(X x);
}
