package collections;

import java.util.Arrays;

public class MyArrayListArray<E> implements MyList<E> {
        private static final int DEFAULT_CAPACITY = 10;
        private Object[] elements;
        private int size;

        public MyArrayListArray() {
                elements = new Object[DEFAULT_CAPACITY];
                size = 0;
        }

        @Override
        public void add(E element) {
                if (size == elements.length) {
                        increaseCapacity();
                }
                elements[size] = element;
                size++;
        }

        @Override
        public void remove(int index) {
                if (index < 0 || index >= size) {
                        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
                }
                for (int i = index; i < size - 1; i++) {
                        elements[i] = elements[i + 1];
                }
                elements[size - 1] = null;
                size--;
        }

        @Override
        public void set(int index, E element) {
                if (index < 0 || index >= size) {
                        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
                }
                elements[index] = element;
        }

        @Override
        public E get(int index) {
                if (index < 0 || index >= size) {
                        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
                }
                return (E) elements[index];
        }

        @Override
        public int size() {
                return size;
        }

        private void increaseCapacity() {
                int newCapacity = elements.length * 2;
                elements = Arrays.copyOf(elements, newCapacity);
        }
}