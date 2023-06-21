package collections;
public class MyArrayListArray<E> implements MyList {
        private Object[] values = new Object[0];
        @Override
        public boolean add(Object e) {
                try {
                        Object[] temp = values;
                        values = (Object[]) new Object[temp.length + 1];
                        System.arraycopy(temp, 0, values, 0, temp.length);
                        values[values.length - 1] = e;
                        return true;
                } catch (ClassCastException ex) {
                        ex.printStackTrace();
                }
                return false;
        }

        @Override
        public void set(int index, Object element) {
                values[index] = element;
        }

        @Override
        public Object remove(int index) {
                try {
                        Object[] temp = values;
                        values = (Object[]) new Object[temp.length + 1];
                        System.arraycopy(temp, 0, values, 0, temp.length);
                        int amountElemAfterIndex = temp.length - index - 1;
                        System.arraycopy(temp, index + 1, values, index, amountElemAfterIndex);
                } catch (ClassCastException ex) {
                        ex.printStackTrace();
                }
                return null;
        }

        @Override
        public int size() {
                return values.length;
        }

        @Override
        public Object get(int index) {
                return values[index];
        }
}
