package collections;

public interface MyList<T> {
    void add(T value);
    void set(int index, T value);
    int size();
    void remove(int index);
    T get(int index);
}
