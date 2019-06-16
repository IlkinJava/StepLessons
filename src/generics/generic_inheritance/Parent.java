package generics.generic_inheritance;

public class Parent {
}

class GenParent<T> extends Parent {
}

class Child extends GenParent {
}

class Child2 extends GenParent<String> {
}

class Child3<T> extends GenParent<T> {
}

class Child4<X, T, Y> extends GenParent<Y> {
}

class Child5<X, T, Y> extends Child4<Integer, T, String> {
}