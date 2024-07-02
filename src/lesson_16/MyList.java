package lesson_16;

public interface MyList<T> {
    void add(T elem);
    int size();
    T get(int index);
    void add(T elem, int index);
    void remove(int index);
    boolean contains(T elem);
}
