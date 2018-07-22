package Lesson19;

public class Box<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();
        Box<Character> charBox = new Box<Character>();
        Box<Double> doubleBox = new Box<Double>();
        Box<Boolean> boolBox = new Box<Boolean>();

        integerBox.add(10);
        stringBox.add(new String("Hello World"));
        charBox.add('A');
        System.out.printf("Integer Value :%d\n\n", integerBox.get());
        System.out.printf("String Value :%s\n\n", stringBox.get());
        System.out.printf("Character Value :%s\n", charBox.get());
    }
}
