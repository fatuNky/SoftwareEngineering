package Probeklausur.exercise6and7;

@FunctionalInterface
public interface TriFunction <X, Y, Z> {
    X apply(X x, Y y, Z z);
}
