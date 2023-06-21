package collections;

public interface MyList<T> {
    boolean add(T e);
    void set(int index, T element);
    T remove(int index);
    int size();
    T get(int index);
}
