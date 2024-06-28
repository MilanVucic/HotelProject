package lesson_15;

public class MyArray<E> {
    public static final int INITIAL_SIZE = 10;
    public static final int SIZE_INCREASE = 10;
    private E[] data;
    private int size; // actual length of data

    public MyArray() {
        this.data = (E[]) new Object[INITIAL_SIZE];
        this.size = 0;
    }

    // data -> [0,0,0], size = 0;
    // add number 6
    // data[size] = data[0] = 6; data -> [6,0,0], size -> 1
    // add 7 -> data -> [6,7,0]; size -> 2
    // add 8 -> data -> [6,7,8]; size -> 3
    // add 9 -> data -> [6,7,8,9,0,0], size -> 4
    public void add(E element) {
        // [element, null, null,.... null]
        // [1,2,3,4,5] add 6
        // [1,2,3,4,5,6,7,8,9]
        // [1,2,3,4,5,6,7,8,9,10                         ]
        if (size == data.length) {
            // Make sure there's enough space to add new elements
            E[] temp = (E[]) new Object[data.length + SIZE_INCREASE];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        data[size] = element;
        size++;
    }

    public E get(int index) {
        return data[index];
    }

    public int getSize() {
        return size;
    }

    public String toString() {
        String result = "[";
        for (int i = 0; i < size; i++) {
            result += data[i];
            if (i != size - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }
}
